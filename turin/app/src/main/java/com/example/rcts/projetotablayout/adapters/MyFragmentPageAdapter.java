package com.example.rcts.projetotablayout.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rcts.projetotablayout.tabs.Artefatos;
import com.example.rcts.projetotablayout.tabs.Joia;
import com.example.rcts.projetotablayout.tabs.Porcao;

public class MyFragmentPageAdapter extends FragmentPagerAdapter {

    private String[] mTabTitles;


    public MyFragmentPageAdapter(FragmentManager fm, String[] mTabTitles) {
        super(fm);
        this.mTabTitles = mTabTitles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new Porcao();

            case 1:
                return new Artefatos();

            case 2:
                return new Joia();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}
