package ziemansoft.ziemapp.daggertutorialappcomponents.di.modules;

import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import ziemansoft.ziemapp.daggertutorialappcomponents.viewmodels.ViewModelProvidersFactory;

@Module
public abstract class ViewModelFactoryModule {
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProvidersFactory viewModelProvidersFactory);
}
