/**
 * Created by karmanya on 12/12/15.
 */
import com.google.android.gms.common.api.GoogleApiClient;

public class GoogleApiClient_Singleton {
        private  static final String TAG = "Nigger";
        private static GoogleApiClient_Singleton instance = null;
        private static GoogleApiClient mGoogleApiClient = null;
         public static GoogleApiClient_Singleton getInstance(GoogleApiClient aGoogleApiClient) {
             if(instance == null) {
                instance = new GoogleApiClient_Singleton();
                    if (mGoogleApiClient == null)
                    mGoogleApiClient = aGoogleApiClient;
        }
        return instance;
    }
    public GoogleApiClient get_GoogleApiClient(){
        return mGoogleApiClient;
    }
}
