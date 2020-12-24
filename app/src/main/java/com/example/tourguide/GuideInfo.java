package com.example.tourguide;

public class GuideInfo {
    private String mName;
    private String mLocation;
    private int mImageResource;

    public GuideInfo(String mName, String mLocation, int mImageResource) {
        this.mName = mName;
        this.mLocation = mLocation;
        this.mImageResource = mImageResource;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getImageResource() {
        return mImageResource;
    }
}
