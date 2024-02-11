package com.example.linear_and_relative;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),
                "onCreate Called",Toast.LENGTH_LONG).show();
    }
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(),
                "onStart Called",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),
                "onPause Called",Toast.LENGTH_LONG).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(),
                "onStop Called",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(),
                "onStop Called",Toast.LENGTH_LONG).show();
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),
                "onDestroy Called",Toast.LENGTH_LONG).show();
    }

}