package mappapp.adam.googleplaces;

/**
 * Created by Adam on 23/11/2016.
 */

import android.app.Application;

public class Services extends Application {

    //assigning variables for users location and random location //
    private double longitude;
    private double latitude;
    private double Rlongitude;
    private double Rlatitude;
    private String Rlocation="";
    private double uDistance;

    public double getUdistance() {

        return uDistance;
    }

    public void setuDistance(double aName) {

        uDistance = aName;

    }
    public double getLongitude() {

        return longitude;
    }

    public void setLongitude(double aName) {

        longitude = aName;

    }

    public double getLatitude() {

        return latitude;
    }

    public void setLatitude(double aEmail) {

        latitude = aEmail;
    }

    public double getRLongitude() {

        return Rlongitude;
    }

    public void setRLongitude(double aName) {

        Rlongitude = aName;

    }

    public double getRLatitude() {

        return Rlatitude;
    }

    public void setRLatitude(double aEmail) {

        Rlatitude = aEmail;
    }

    public void getRlocation(String aEmail) {

        Rlocation = aEmail;
    }
    public String setRlocation() {

        return Rlocation;
    }

}
