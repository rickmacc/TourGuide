package org.eightfoldpath.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        // Create an adapter that knows which fragment should be shown on each page
        PageFragmentAdapter adapter = new PageFragmentAdapter(getSupportFragmentManager());

        adapter.setTabTitles(new String[] {getApplicationContext().getResources().getString(R.string.activities),
                getApplicationContext().getResources().getString(R.string.dining),
                getApplicationContext().getResources().getString(R.string.events),
                getApplicationContext().getResources().getString(R.string.parks)});

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
