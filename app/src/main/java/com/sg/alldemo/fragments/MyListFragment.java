package com.sg.alldemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sg.alldemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyListFragment extends ListFragment {


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.

        //String[] courseTitles = getResources().getStringArray(R.array.emptyList);
        String[] courseTitles = getResources().getStringArray(R.array.courseTitles);
        ArrayAdapter<String> courseTitlesAdapter =
                new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_activated_1, courseTitles);

        setListAdapter(courseTitlesAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragments_mycustomlistlayout, container, false);
    }

}
