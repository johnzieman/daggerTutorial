package ziemansoft.ziemapp.daggertutorialappcomponents.di.modules;

import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import ziemansoft.ziemapp.daggertutorialappcomponents.viewmodels.ViewModelProvidersFactory;

public abstract class ViewModelFactoryModule {
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProvidersFactory viewModelProvidersFactory);
}
