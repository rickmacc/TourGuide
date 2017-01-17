package org.eightfoldpath.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by rick on 1/16/17.
 */

public class DiningFragment extends Fragment {
       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           View rootView = inflater.inflate(R.layout.item_list, container, false);

           final ArrayList<ListItem> items = new ArrayList<ListItem>();
           items.add(new ListItem(R.drawable.bistro_niko,
                   getContext().getResources().getString(R.string.dining_bistro_niko)));
           items.add(new ListItem(R.drawable.south_city_kitchen,
                   getContext().getResources().getString(R.string.dining_south_city_kitchen)));
           items.add(new ListItem(R.drawable.staplehouse,
                   getContext().getResources().getString(R.string.dining_staplehouse)));
           items.add(new ListItem(R.drawable.einsteins,
                   getContext().getResources().getString(R.string.dining_einsteins)));
           items.add(new ListItem(R.drawable.fivechurch,
                   getContext().getResources().getString(R.string.dining_5church)));
           items.add(new ListItem(R.drawable.buttermilk_kitchen,
                   getContext().getResources().getString(R.string.dining_buttermilk_kitchen)));
           items.add(new ListItem(R.drawable.atlanta_fish_market,
                   getContext().getResources().getString(R.string.dining_atlanta_fish_market)));

           ListItemAdapter itemAdapter = new ListItemAdapter(getActivity(), items, R.color.colorActivities);

           ListView listView = (ListView) rootView.findViewById(R.id.item_list);
           listView.setAdapter(itemAdapter);

           return rootView;

    }

}
