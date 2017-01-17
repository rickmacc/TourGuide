package org.eightfoldpath.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rick on 1/16/17.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {

    private int backgroundColorId;

    public ListItemAdapter(Activity context, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);
    }

    public ListItemAdapter(Activity context, ArrayList<ListItem> listItems, int backgroundColorId) {
        super(context, 0, listItems);
        this.backgroundColorId = backgroundColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ListItem currentItem = getItem(position);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.item_container);
        int color = ContextCompat.getColor(getContext(), backgroundColorId);
        textContainer.setBackgroundColor(color);

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentItem.getImageResourceId() > 0) {
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentItem.getImageResourceId());
        } else {
            iconView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentItem.getTitle());

        return listItemView;
    }

}
