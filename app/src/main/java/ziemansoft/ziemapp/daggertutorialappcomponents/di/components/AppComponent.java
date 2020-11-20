package ziemansoft.ziemapp.daggertutorialappcomponents.di.components;

import android.app.Application;

import javax.inject.Singleton;

import ziemansoft.ziemapp.daggertutorialappcomponents.BaseApplication;


import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.ActivityBuildersModule;
import ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.AppModule;
import ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.ViewModelFactoryModule;
import ziemansoft.ziemapp.daggertutorialappcomponents.viewmodels.ViewModelProvidersFactory;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                ViewModelFactoryModule.class,
        })
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}