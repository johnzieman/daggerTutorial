package ziemansoft.ziemapp.daggertutorialappcomponents.network;

import io.reactivex.Flowable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ziemansoft.ziemapp.daggertutorialappcomponents.pojo.User;

public interface AuthApi {
    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}
