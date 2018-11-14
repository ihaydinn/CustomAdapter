package com.ismailhakkiaydin.customadapter;

public class City {

    private String name;
    private int image;
    private long autoNumber;

    public City(String name, int image, long autoNumber) {
        this.name = name;
        this.image = image;
        this.autoNumber = autoNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public long getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(long autoNumber) {
        this.autoNumber = autoNumber;
    }
}
