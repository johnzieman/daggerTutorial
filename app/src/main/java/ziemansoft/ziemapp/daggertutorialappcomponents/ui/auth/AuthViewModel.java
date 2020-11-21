package ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import ziemansoft.ziemapp.daggertutorialappcomponents.network.AuthApi;
import ziemansoft.ziemapp.daggertutorialappcomponents.pojo.User;

public class AuthViewModel extends ViewModel {
    private final String TAG = "AuthActivityViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi){
        this.authApi = authApi;
        Log.d(TAG, "EveryThing is working");

        authApi.getUser(6)
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull User user) {
                        Log.d(TAG, user.getEmail());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d(TAG, "onError " + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
