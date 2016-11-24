package mappapp.adam.googleplaces;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Adam on 24/11/2016.
 */
public class Places extends AppCompatActivity{
    GPSTracker gps;
    MainActivity men = new MainActivity();

    public String getUserLocation(){
       String userLocation = " ";
        double latitude = 0;
        double longitude = 0;
        if(gps.canGetLocation()){

            latitude = gps.getLatitude();
            longitude = gps.getLongitude();

            men.executeLocaton();
            // \n is for new line
            Toast.makeText(getApplicationContext(),"Generating random Restaurant", Toast.LENGTH_SHORT).show();

            // Toast.makeText(getApplicationContext(),"Gathering GPS Data...", Toast.LENGTH_SHORT).show();
            //  Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
        }else{
            // can't get location
            // GPS or Network is not enabled
            // Ask user to enable GPS/network in settings
            gps.showSettingsAlert();
        }
        userLocation=latitude + "," + longitude;
       return userLocation;
    }
}
