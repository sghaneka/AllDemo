package com.sg.alldemo.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sg.alldemo.R;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouts_main);
        getSupportActionBar().setTitle("Layouts");
    }

    public void onclick_example1(View view){
        Intent intent = new Intent(this, com.sg.alldemo.layouts.basic_examples.LinearLayoutHelloWorld.class);
        startActivity(intent);
    }
}
