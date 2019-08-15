package com.example.appsyrs.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appsyrs.R;

// 10116348 Yaris Nuryana IF 8  14 agustus 2019


public class About1Fragment extends Fragment {


    public About1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about1, container, false);
    }

    public interface OnFragmentInteractionListener {
    }
}
