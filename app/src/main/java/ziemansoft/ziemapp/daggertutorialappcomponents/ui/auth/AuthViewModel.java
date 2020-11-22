package ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import ziemansoft.ziemapp.daggertutorialappcomponents.network.AuthApi;
import ziemansoft.ziemapp.daggertutorialappcomponents.pojo.User;

public class AuthViewModel extends ViewModel {
    private MediatorLiveData<User> authUser = new MediatorLiveData<>();
    private final String TAG = "AuthActivityViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "EveryThing is working");
    }

    public void authenticateWithId(int id) {
        final LiveData<User> source = LiveDataReactiveStreams.fromPublisher(
                authApi.getUser(id)
                .subscribeOn(Schedulers.io())
        );

        authUser.addSource(source, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                authUser.setValue(user);
                authUser.removeSource(source);
            }
        });
    }
    public LiveData<User> observeUser() {
        return authUser;
    }

}
