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

public class ActivitiesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.drawable.ic_local_activity_white_36dp,
                getContext().getResources().getString(R.string.activity_beltline)));
        items.add(new ListItem(R.drawable.georgia_aquarium,
                getContext().getResources().getString(R.string.activity_aquarium)));
        items.add(new ListItem(R.drawable.world_of_coke,
                getContext().getResources().getString(R.string.activity_coke_museum)));
        items.add(new ListItem(R.drawable.centennial_olympic_park,
                getContext().getResources().getString(R.string.centennial_olympic_park)));

        ListItemAdapter itemAdapter = new ListItemAdapter(getActivity(), items, R.color.colorActivities);

        ListView listView = (ListView) rootView.findViewById(R.id.item_list);
        listView.setAdapter(itemAdapter);

        return rootView;

    }

}
