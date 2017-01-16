package org.eightfoldpath.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
 * sequence.
 */
public class PageFragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;

    private String[] tabTitles = new String[] {String.getString(R.string.activities), "Dining", "Events", "Parks"};

    public PageFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.v(this.getClass().getSimpleName(), "getItem(" + position + ")");
        switch (position) {
            case 0:
                return new ActivitiesFragment();
            case 1:
                return new DiningFragment();
            case 2:
                return new EventsFragment();
            case 3:
                return new ParksFragment();
            default:
                return new ActivitiesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}

