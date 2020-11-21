package ziemansoft.ziemapp.daggertutorialappcomponents.di.modules.auth;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import ziemansoft.ziemapp.daggertutorialappcomponents.network.AuthApi;

@Module
public class AuthModule {
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }
}
