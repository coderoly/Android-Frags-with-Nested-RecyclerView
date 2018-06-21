package io.github.coderoly.fragswithnestedlists;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

import io.github.coderoly.fragswithnestedlists.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // The ViewPager that will host the fragments : basically to allow swiping btn frags
        ViewPager viewPager = findViewById(R.id.container);
        // TabLayout to hold action bar tabs
        TabLayout tabLayout = findViewById(R.id.tabs);


        // Attach adapter that will return a fragment for each of the 3 fragments to viewpager
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        // Attach listener to viewpager
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        // Merge tab and viewpager events
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));


    }


}
