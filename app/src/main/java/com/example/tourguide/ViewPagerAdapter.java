package com.example.tourguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    // Context of the app
    private Context mContext;
    public ViewPagerAdapter( Context context, FragmentManager fm) {
        // only current fragment is on resumed state
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }
    // Swap between tabs
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new CitiesFragment();
        }else if (position == 1){
            return new ClubsFragment();
        }else if (position == 2){
            return new RestaurantsFragment();
        }else {
            return new TourismFragment();
        }
    }

    // Set titles for tabs
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return mContext.getString(R.string.cities);
        }else if (position == 1){
            return mContext.getString(R.string.clubs);
        }else if (position == 2){
            return mContext.getString(R.string.restaurants);
        }else {
            return mContext.getString(R.string.tourism);
        }    }

    // Set number of tabs
    @Override
    public int getCount() {
        return 4;
    }
}
