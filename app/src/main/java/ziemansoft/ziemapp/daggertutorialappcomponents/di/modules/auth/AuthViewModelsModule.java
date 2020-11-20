package ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.auth;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import ziemansoft.ziemapp.daggertutorialappcomponents.di.keys.ViewModelKey;
import ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth.AuthViewModel;

@Module
public abstract class AuthViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
