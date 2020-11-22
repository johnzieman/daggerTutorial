package ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


import com.bumptech.glide.RequestManager;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import ziemansoft.ziemapp.daggertutorialappcomponents.R;
import ziemansoft.ziemapp.daggertutorialappcomponents.pojo.User;
import ziemansoft.ziemapp.daggertutorialappcomponents.viewmodels.ViewModelProvidersFactory;

public class AuthActivity extends DaggerAppCompatActivity{
    private ImageView imageView;
    private EditText editText;
    private final String TAG = "AuthActivityViewModel";


    private AuthViewModel authViewModel;

    @Inject
    Picasso picasso;

    @Inject
    ViewModelProvidersFactory viewModelProvidersFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        init();
        picasso.load(R.drawable.icon_user).into(imageView);
        editText = findViewById(R.id.editTextTextMultiLine);
        authViewModel = new ViewModelProvider(this, viewModelProvidersFactory).get(AuthViewModel.class);
    }

    private void init(){
        imageView = findViewById(R.id.imageViewLogo);
    }

    public void getEmailValue(View view) {
        if(editText.getText().toString().isEmpty()){
            return;
        }
        authViewModel.authenticateWithId(Integer.parseInt(editText.getText().toString()));
        subscribeObservers();
    }

    private void subscribeObservers(){
        authViewModel.observeUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                Log.d(TAG, "On changed: "+ user.getEmail());
            }
        });
    }
}