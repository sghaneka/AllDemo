package com.sg.alldemo.fragments;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sg.alldemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDialogFragment extends DialogFragment implements View.OnClickListener{


    public MyDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.fragments_mydialogfragment, container, false);

        View yesButton = theView.findViewById(R.id.btnYes);
        yesButton.setOnClickListener(this);
        yesButton.requestFocus();

        View noButton = theView.findViewById(R.id.btnNo);
        noButton.setOnClickListener(this);

        Dialog theDialog = getDialog();
        if (theDialog != null) {
            theDialog.setTitle("This the Title");
            theDialog.setCanceledOnTouchOutside(false);
        }

        return theView;
    }

    public void onClick(View view) {
        int viewId = view.getId();
        switch(viewId) {
            case R.id.btnYes:
                break;
            case R.id.btnNo:
                break;
        }

        dismiss();
    }

}
