package com.example.shashank.bagtracker;

/**
 * Created by shashank on 23-Apr-17.
 */
public class UserLocation {
    public String id;
    public double lat;
    public double lng;
    public double alt;

    public UserLocation(String id, double lat, double lng, double alt) {
        this.id=id;
        this.lat = lat;
        this.lng = lng;
        this.alt = alt;
    }
}
