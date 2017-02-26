package com.sg.alldemo.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.sg.alldemo.R;

/**
 * Created by samgh on 2/14/2017.
 */

public class LaunchActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragments_layout_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater() ;
        inflater.inflate(R.menu.fragments_main_menu, menu) ;
        return true;
    }

    public void onMenuList(MenuItem item)
    {
        startActivity(new Intent(this, MyListActivity.class));
    }

    public void onMenuDialog(MenuItem item)
    {
        FragmentManager fm = getSupportFragmentManager();
        MyDialogFragment theFragment = new MyDialogFragment();

        //theFragment.show(fm, "MyDialog");

        FragmentTransaction ft = fm.beginTransaction();
        // Add some other fragments
        theFragment.show(ft, "MyDialog");

        // ** Do not call commit

    }

    public void onMenuDialogWrapped(MenuItem item)
    {
        FragmentManager fm = getSupportFragmentManager();
        MyAlertDialogFragment theFragment = new MyAlertDialogFragment();

        theFragment.show(fm, "MyDialog");

    }

    public void onMenuDialogAdd(MenuItem item)
    {
        FragmentManager fm = getSupportFragmentManager();
        MyDialogFragment theFragment = new MyDialogFragment();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(android.R.id.content, theFragment, "MyDialog");
        ft.addToBackStack("DialogAsARegularFragment");
        ft.commit();
    }

    public void onMenuQuit(MenuItem item)
    {
        finish();
    }

    public void done(View view) {
        // Provide context if MyActivity is an internal activity.
        finish();
    }
}

