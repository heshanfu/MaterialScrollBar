package com.turingtechnologies.materialscrollbardemo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.turingtechnologies.materialscrollbardemo.DemoAdapter;
import com.turingtechnologies.materialscrollbardemo.R;

public class FirstLetterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_main, container, false);
        RecyclerView rv = view.findViewById(R.id.recyclerView);
        rv.setAdapter(new DemoAdapter(getActivity()));
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}
