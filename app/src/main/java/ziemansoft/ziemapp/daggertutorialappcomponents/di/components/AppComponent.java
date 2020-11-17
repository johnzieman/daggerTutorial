package ziemansoft.ziemapp.daggertutorialappcomponents.di.components;

import android.app.Application;

import ziemansoft.ziemapp.daggertutorialappcomponents.BaseApplication;


import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.ActivityBuildersModule;
import ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.AppModule;

@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
        })
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}