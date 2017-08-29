package com.example.deepu.dogwiteration1.drawerFragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deepu.dogwiteration1.R;

/**
 * Created by deepu on 17/08/2017.
 */

public class Vet extends Fragment {


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Vet");
        return inflater.inflate(R.layout.vet, container, false);
    }
}
