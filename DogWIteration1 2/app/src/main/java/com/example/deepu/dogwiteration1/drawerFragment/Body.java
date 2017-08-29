package com.example.deepu.dogwiteration1.drawerFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deepu.dogwiteration1.DogBodyLanguage.FirstPageForBodyLanguage;
import com.example.deepu.dogwiteration1.R;

/**
 * Created by qingyunhe on 22/08/2017.
 */

public class Body extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.body, container, false);
        getFragmentManager().beginTransaction().
                add(R.id.body_main_page, new FirstPageForBodyLanguage(), "mainPage").
                commit();
        getActivity().setTitle("Body Language");
        return view;
    }


}
