package com.example.android.islamabadtourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

//        String[] listItem = {"One", "Two", "Three", "Four", "Five"};
//
//        ListView listView = (ListView) view.findViewById(R.id.listview);
//
//        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listItem);
//        listView.setAdapter(listViewAdapter);

        ArrayList<ListItem> restaurants = new ArrayList<ListItem>();
        restaurants.add(new ListItem("Monal", "Pakistani Cuisine", R.drawable.placeholder));
        restaurants.add(new ListItem("Chaaye Khana", "Pakistani Cuisine", R.drawable.placeholder));

        ListView listView = view.findViewById(R.id.listview);
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), restaurants);
        listView.setAdapter(adapter);

        return view;
    }

    public interface OnFragmentInteractionListener {
    }
}
