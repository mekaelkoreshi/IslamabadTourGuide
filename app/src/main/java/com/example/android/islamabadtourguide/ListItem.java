package com.example.android.islamabadtourguide;

/**
 * Created by mekaelkoreshi on 19.06.2018.
 */

public class ListItem {

    private String mName;

    private String mType;

    private int mImageResourceId = NO_IMAGE;

    final static int NO_IMAGE = -1;


    public ListItem(String name, String type, int imageResourceId) {
        mName = name;
        mType = type;
        mImageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        if (mImageResourceId != -1) {
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return mName;
    }

    public String getType() {
        return mType;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}
