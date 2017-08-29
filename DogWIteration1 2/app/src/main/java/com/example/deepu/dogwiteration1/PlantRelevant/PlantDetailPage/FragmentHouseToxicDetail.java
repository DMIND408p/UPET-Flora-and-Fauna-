package com.example.deepu.dogwiteration1.PlantRelevant.PlantDetailPage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.deepu.dogwiteration1.PlantRelevant.PlantEntities.HouseToxicPlant;
import com.example.deepu.dogwiteration1.R;

/**
 * Created by qingyunhe on 27/08/2017.
 */

public class FragmentHouseToxicDetail extends Fragment {
    View view;
    TextView plantName;
    HouseToxicPlant houseToxicPlant;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.house_toxic_detail,container,false);
        plantName = (TextView) view.findViewById(R.id.detailHouseToxicPlantName);
        plantName.setText(houseToxicPlant.getPlantName());
        return view;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            houseToxicPlant = new HouseToxicPlant();
            houseToxicPlant.setPicLink(bundle.getString("PicLink"));
            houseToxicPlant.setPlantName(bundle.getString("PlantName"));
            houseToxicPlant.setScienName(bundle.getString("ScienName"));
            houseToxicPlant.setSymptom(bundle.getString("Symptom"));
            houseToxicPlant.setTioxicPart(bundle.getString("ToxicPart"));
            houseToxicPlant.setToxicLevel(bundle.getString("ToxicLevel"));
            houseToxicPlant.setToxicLevel(bundle.getString("Type"));
        }
    }
}
