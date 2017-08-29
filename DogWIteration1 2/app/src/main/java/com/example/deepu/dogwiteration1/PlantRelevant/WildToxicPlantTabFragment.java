package com.example.deepu.dogwiteration1.PlantRelevant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.deepu.dogwiteration1.FirebaseClient;
import com.example.deepu.dogwiteration1.R;

/**
 * Created by qingyunhe on 20/08/2017.
 */

public class WildToxicPlantTabFragment extends Fragment {
    ListView plantListView;
    FirebaseClient firebaseClient;
    View wildToxicPlantView;
    final static String DB_URL = "https://databaseplant-8e253.firebaseio.com/";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        wildToxicPlantView = inflater.inflate(R.layout.wild_toxic_plant_tab_fragment, container, false);
        plantListView = (ListView) wildToxicPlantView.findViewById(R.id.wildToxicPlantListView);
        plantListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO:

            }
        });
        firebaseClient = new FirebaseClient(wildToxicPlantView.getContext(), DB_URL, plantListView);
        firebaseClient.refreshWildToxicPlantData();

        return wildToxicPlantView;
    }

    public void filterList(String searchString) {
        firebaseClient.filterWildToxicList(searchString.toLowerCase());
    }
}
