package ziemansoft.ziemapp.daggertutorialappcomponents.di.modules;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ziemansoft.ziemapp.daggertutorialappcomponents.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();
}
