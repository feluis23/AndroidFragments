package com.example.luisfelipe.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by luisfelipe on 01/02/15.
 */
public class NameDetailFragment extends Fragment{
    private TextView txt_name;
    public void setName(String name){
        if (name != null){
            txt_name.setText(name);
        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name_detail,null);
        txt_name = (TextView)view.findViewById(R.id.txt_name);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String name = (String) arguments.get(MainActivity.NAME_TAG);
            setName(name);
        }


    }
}
