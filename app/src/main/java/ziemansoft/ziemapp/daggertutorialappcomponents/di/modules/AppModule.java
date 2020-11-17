package ziemansoft.ziemapp.daggertutorialappcomponents.di.modules;

import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static Picasso providePicasso(){
        return Picasso.get();
    }


}
