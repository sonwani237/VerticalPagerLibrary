package com.d3developers.verticalpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.d3developers.verticalviewpager.VerticalViewPager;

import java.util.ArrayList;
import java.util.Objects;


public class TwoFragment extends Fragment {

    VerticalViewPager view_pager;
    VerticalViewPagerAdapter adapter;
    ArrayList<DataModel> dataModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        dataModels = new ArrayList<>();
        dataModels.add(new DataModel("Android Volley Tutorial", getString(R.string.volley_description), getString(R.string.volley_url)));
        dataModels.add(new DataModel("Android Dagger 2", getString(R.string.dagger_description), getString(R.string.dagger_url)));
        dataModels.add(new DataModel("Android Geocoder Reverse Geocoding", getString(R.string.geocoder_description), getString(R.string.geocoder_url)));
        dataModels.add(new DataModel("Android Notification Direct Reply", getString(R.string.notification_description), getString(R.string.notification_url)));
        dataModels.add(new DataModel("RecyclerView Android with Dividers and Contextual Toolbar", getString(R.string.recyclerview_description), getString(R.string.recyclerview_url)));

        dataModels.add(new DataModel("Android Volley Tutorial", getString(R.string.volley_description), getString(R.string.volley_url)));
        dataModels.add(new DataModel("Android Dagger 2", getString(R.string.dagger_description), getString(R.string.dagger_url)));
        dataModels.add(new DataModel("Android Geocoder Reverse Geocoding", getString(R.string.geocoder_description), getString(R.string.geocoder_url)));
        dataModels.add(new DataModel("Android Notification Direct Reply", getString(R.string.notification_description), getString(R.string.notification_url)));
        dataModels.add(new DataModel("RecyclerView Android with Dividers and Contextual Toolbar", getString(R.string.recyclerview_description), getString(R.string.recyclerview_url)));

        view_pager = view.findViewById(R.id.view_pager);
        adapter = new VerticalViewPagerAdapter(Objects.requireNonNull(getActivity()).getSupportFragmentManager(), dataModels);
        view_pager.setAdapter(adapter);
        ThreeFragment.setmNum(0, dataModels.get(0).getUrl());

        view_pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
//                Log.e("Position ","Current "+i);
                ThreeFragment.setmNum(i, dataModels.get(i).getUrl());
                if (dataModels.size()== i+5){



                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        return view;
    }

}
