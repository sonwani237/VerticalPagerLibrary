package com.d3developers.verticalpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Divyanshu
 */

public class VerticalViewPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<DataModel> dataModels = new ArrayList<>();

    public VerticalViewPagerAdapter(FragmentManager fm, ArrayList<DataModel> dataModels) {
        super(fm);
        this.dataModels = dataModels;
    }

    @Override
    public int getCount() {
        return dataModels.size();
    }

    @Override
    public Fragment getItem(int position) {

        return DashboardFragment.newInstance(dataModels, position);

    }

}
