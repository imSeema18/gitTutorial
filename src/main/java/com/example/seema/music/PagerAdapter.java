package com.example.seema.music;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AllMusic tab1 = new AllMusic();
                return tab1;
            case 1:
                happyMusic tab2 = new happyMusic();
                return tab2;
            case 2:
                SadMusic tab3 = new SadMusic();
                return tab3;
            case 4:
                AngryMusic tab4 = new AngryMusic();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}