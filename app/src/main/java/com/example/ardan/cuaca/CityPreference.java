package com.example.ardan.cuaca;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by ardan on 29/11/15.
 */
public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity(){
        return prefs.getString("city", "Yogyakarta, ID");
    }

    void setCity(String city){
        prefs.edit().putString("city",city).commit();
    }
}
