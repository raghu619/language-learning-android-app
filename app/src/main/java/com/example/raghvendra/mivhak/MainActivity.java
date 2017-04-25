package com.example.raghvendra.mivhak;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.color.white;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=(ViewPager)findViewById(R.id.pageviewer);
        viewPager.getElevation();

        SimpleFragmentpageAdapter adapter=new SimpleFragmentpageAdapter(getSupportFragmentManager());


        viewPager.setAdapter(adapter);


        TabLayout tabLayout=(TabLayout)findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#9C27B0"));
        tabLayout.setTabTextColors(Color.parseColor("#EDE7F6"),Color.parseColor("#000000"));


    }


}