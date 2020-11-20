package ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    private final String TAG = "AuthActivityViewModel";

    @Inject
    public AuthViewModel(){
        Log.d(TAG, "EveryThing is working");
    }
}
