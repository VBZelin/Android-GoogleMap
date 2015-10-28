package com.example.zelin.geofencing_test;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public final class Constants {
    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 2;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 100; // 0.1 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> AREA_MARKERS = new HashMap<String, LatLng>();
    static {
        //Old Dominion University.
        AREA_MARKERS.put("Old Dominion University", new LatLng(36.886015, -76.304392));
        //Old Dominion University Admissions
        AREA_MARKERS.put("Admissions Building", new LatLng(36.890086, -76.30447600000002));
        //Old Dominion University Engineering and Computational Sciences Building
        AREA_MARKERS.put("Computer Science Building", new LatLng(36.8856976, -76.3074413));
    }
}
