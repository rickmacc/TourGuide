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

public class EventsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.drawable.ic_public_white_36dp,
                getContext().getResources().getString(R.string.events_mlk_day)));
        items.add(new ListItem(R.drawable.ic_public_white_36dp,
                getContext().getResources().getString(R.string.events_jewish_film_festival)));

        ListItemAdapter itemAdapter = new ListItemAdapter(getActivity(), items, R.color.colorActivities);

        ListView listView = (ListView) rootView.findViewById(R.id.item_list);
        listView.setAdapter(itemAdapter);

        return rootView;

    }

}
