package io.github.coderoly.fragswithnestedlists.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import io.github.coderoly.fragswithnestedlists.fragments.ComingSoon;
import io.github.coderoly.fragswithnestedlists.fragments.NowShowing;
import io.github.coderoly.fragswithnestedlists.fragments.Showtimes;

// A FragmentPagerAdapter that returns a fragment corresponding to one of the tabs.
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        // Show a different fragment corresponding to the position
        switch (position) {
            case 0:
                return new NowShowing();
            case 1:
                return new ComingSoon();
            case 2:
                return new Showtimes();
        }

        return null;
    }

    // Returns number of fragments hosted by adapter.
    @Override
    public int getCount() {
        return 3;
    }
}
