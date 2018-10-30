package com.d3developers.verticalpager;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class DashboardFragment extends Fragment {

    private static final String MY_NUM_KEY = "num";
    private static final String MY_COLOR_KEY = "color";
    private static ArrayList<DataModel> dataModel;

    private int mNum;

    public static DashboardFragment newInstance(ArrayList<DataModel> dataModels, int num) {
        DashboardFragment f = new DashboardFragment();
        Bundle args = new Bundle();
        args.putInt(MY_NUM_KEY, num);
        f.setArguments(args);
        dataModel = dataModels;
        return f;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNum = getArguments() != null ? getArguments().getInt(MY_NUM_KEY) : 0;

        Log.e("Position "," Page "+mNum);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        TextView textView = view.findViewById(R.id.title);
        TextView body_text = view.findViewById(R.id.body_text);

        textView.setText(""+dataModel.get(mNum).getTitle());
        body_text.setText(""+dataModel.get(mNum).getDescription());

        return view;

    }

}
