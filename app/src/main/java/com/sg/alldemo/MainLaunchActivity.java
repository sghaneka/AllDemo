package com.sg.alldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainLaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_launch);
        getSupportActionBar().setTitle("AllDemo");
    }

    /**
     * Called when the user touches the button
     */
    public void fragmentDemo(View view) {
        // Provide context if MyActivity is an internal activity.
        Intent intent = new Intent(this, com.sg.alldemo.fragments.LaunchActivity.class);
        startActivity(intent);
    }

    public void onClickLayoutDemo(View view) {
        Intent intent = new Intent(this, com.sg.alldemo.layouts.LaunchActivity.class);
        startActivity(intent);
    }

}
