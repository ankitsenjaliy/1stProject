package com.example.a1stproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ViewpagerActivity extends AppCompatActivity {

    ViewPager ViewPager;

    int[] images = {R.drawable.image13, R.drawable.image14, R.drawable.image15, R.drawable.image16, R.drawable.image17};

    ViewPagerAdapter ViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        ViewPager = (ViewPager)findViewById(R.id.viewpager);

        ViewPagerAdapter = new ViewPagerAdapter(ViewpagerActivity.this, images);

        ViewPager.setAdapter(ViewPagerAdapter);

    }
}