package com.sg.alldemo.layouts.basic_examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sg.alldemo.R;

public class LinearLayoutHelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouts_basic_examples_linear_layout_hello_world);
        getSupportActionBar().setTitle("Layouts");
    }
}
