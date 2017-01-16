package org.eightfoldpath.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rick on 1/16/17.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {

    private int backgroundColorId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param word A List of Word objects to display in a list
     */
    public ListItemAdapter(Activity context, ArrayList<ListItem> listItems) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, listItems);
    }

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param word A List of Word objects to display in a list
     * @param color Background color for this category
     */
    public ListItemAdapter(Activity context, ArrayList<ListItem> listItems, int backgroundColorId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, listItems);
        this.backgroundColorId = backgroundColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //return super.getView(position, convertView, parent);
        // Check if the existing view is being reused, otherwise inflate the view

        // Get the {@link Word} object located at this position in the list
        final ListItem currentItem = getItem(position);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Set the background color for the text container
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
