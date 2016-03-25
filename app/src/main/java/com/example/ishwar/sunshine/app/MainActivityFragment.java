package com.example.ishwar.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String weekForecast[] = {"Today - Sunny - 88/63","Tomorrow - Foggy - 70/40",
                "Wednesday - Cloudy - 72/63","Thursday - Asteroids - 75/65",
                "Friday - Heavy rain - 65/56",
                "Saturday - Windy - 60/51",
                "Sunday - Sunny - 80/68"};

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,weekForecast);
        
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
