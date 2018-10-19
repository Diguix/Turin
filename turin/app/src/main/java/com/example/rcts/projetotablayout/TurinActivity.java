package com.example.rcts.projetotablayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.rcts.projetotablayout.adapters.MyFragmentPageAdapter;

public class TurinActivity extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mTabLayout = (TabLayout) findViewById(R.id.IDtab_layout);
        mViewPager = (ViewPager) findViewById(R.id.IDview_pager);

        mViewPager.setAdapter(new MyFragmentPageAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.title_tab)));
        mTabLayout.setupWithViewPager(mViewPager);


    }
}
