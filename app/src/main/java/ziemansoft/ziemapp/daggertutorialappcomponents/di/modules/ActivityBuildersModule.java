package ziemansoft.ziemapp.daggertutorialappcomponents.di.modules;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.auth.AuthViewModelsModule;
import ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class})
    abstract AuthActivity contributeAuthActivity();
}
