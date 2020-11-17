package ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;


import com.bumptech.glide.RequestManager;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import ziemansoft.ziemapp.daggertutorialappcomponents.R;
import ziemansoft.ziemapp.daggertutorialappcomponents.viewmodels.ViewModelProvidersFactory;

public class AuthActivity extends DaggerAppCompatActivity{

    private AuthViewModel authViewModel;

    private ImageView imageView;


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
        authViewModel = new ViewModelProvider(this, viewModelProvidersFactory).get(AuthViewModel.class);
    }

    private void init(){
        imageView = findViewById(R.id.imageViewLogo);
    }
}