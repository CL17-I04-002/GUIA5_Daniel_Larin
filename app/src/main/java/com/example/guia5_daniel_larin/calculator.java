package com.example.guia5_daniel_larin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setTitle(getString(R.string.app_calculator));
    }
}