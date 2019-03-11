package com.example.attendence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = findViewById(R.id.profile_tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
