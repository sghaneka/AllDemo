package com.sg.alldemo.fragments;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sg.alldemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAlertDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{


    public MyAlertDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Do you wanna give it try");
        builder.setPositiveButton("Go for it", this);
        builder.setNegativeButton("Stay Safe", this);

        Dialog theDialog = builder.create();
        theDialog.setCanceledOnTouchOutside(false);

        return theDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch(i) {
            case Dialog.BUTTON_POSITIVE:
                break;
            case Dialog.BUTTON_NEGATIVE:
                break;
        }
    }

}
