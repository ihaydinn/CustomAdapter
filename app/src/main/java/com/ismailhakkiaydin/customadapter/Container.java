package com.ismailhakkiaydin.customadapter;

import java.util.Vector;

public class Container {

    private Vector<City> vector;

    public Vector<City> getVector(){
        return vector;
    }

    public Container(){
        this.vector = new Vector<City>(3);
        vector.add(new City("Istanbul", R.drawable.ic_launcher_background, 34L));
        vector.add(new City("Izmir", R.drawable.ic_launcher_foreground,35L));
        vector.add(new City("Bursa", R.drawable.ic_launcher_background, 16L));
    }

}
