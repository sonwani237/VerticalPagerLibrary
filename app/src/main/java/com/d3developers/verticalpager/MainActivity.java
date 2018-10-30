package com.d3developers.verticalpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());

        viewPagerAdapter.addFragments(new OneFragment());
        viewPagerAdapter.addFragments(new TwoFragment());
        viewPagerAdapter.addFragments(new ThreeFragment());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(1);

    }
}
