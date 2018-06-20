package com.example.android.islamabadtourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by mekaelkoreshi on 20.06.2018.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {

    private static final String LOG_TAG = ListItemAdapter.class.getSimpleName();

    public ListItemAdapter(Context context, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        super.getView(position, convertView, parent);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListItem currentListItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentListItem.getName());

        TextView typeTextView = (TextView) listItemView.findViewById(R.id.type);
        typeTextView.setText(currentListItem.getType());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentListItem.hasImage()) {
            // set this text on the ImageView
            imageView.setImageResource(currentListItem.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}






