package org.eightfoldpath.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rick on 1/16/17.
 */

public class DiningFragment extends Fragment {
       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_page, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.page_text);

        return rootView;
        */

           TextView textView = (TextView) inflater.inflate(
                   R.layout.fragment_page, container, false);
           textView.setText("Dining");

        return textView;
    }

}
