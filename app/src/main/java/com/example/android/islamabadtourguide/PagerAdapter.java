package com.example.android.islamabadtourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.islamabadtourguide.LeisureFragment;
import com.example.android.islamabadtourguide.RestaurantFragment;
import com.example.android.islamabadtourguide.TouristFragment;

/**
 * Created by mekaelkoreshi on 19.06.2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                RestaurantFragment restaurantFragment = new RestaurantFragment();
                return restaurantFragment;
            case 1:
                TouristFragment touristFragment = new TouristFragment();
                return touristFragment;
            case 2:
                LeisureFragment leisureFragment = new LeisureFragment();
                return leisureFragment;
            default:
                return null;
        }
    }
}
