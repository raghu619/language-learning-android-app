package com.example.raghvendra.mivhak;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by raghvendra on 16/2/17.
 */

public class SimpleFragmentpageAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "NUMBERS", "FAMILY", "COLORS","PHRASES" };

    public SimpleFragmentpageAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
       switch (position){

           case 0:
               return new NumbersFragment();

           case 1:
               return new FamilyFragment();
           case 2:
               return new ColorsFragment();
           case 3:
               return new PhrasesFragment();
            default:
                return null;
       }


    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
