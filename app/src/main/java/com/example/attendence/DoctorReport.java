package com.example.attendence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DoctorReport extends AppCompatActivity {
    private static final String TAG = "DoctorReport";
    private ListView oListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_report_listview);
        oListView=(ListView)findViewById(R.id.listView);

        ArrayList<docCard> list=new ArrayList<>();

        list.add(new docCard("heba","5"));
        list.add(new docCard("adel","3"));
        list.add(new docCard("ali","2"));
        list.add(new docCard("ahmed","1"));
        list.add(new docCard("nour","6" ));
        list.add(new docCard("mai","5"));
        list.add(new docCard("bassant","9"));
        list.add(new docCard("yara","7"));
        list.add(new docCard("ahmed","4"));
        list.add(new docCard("noor","0"));

        customListAdapterDoctor adapter=new customListAdapterDoctor (this,R.layout.activity_doctor_report,list);
        oListView.setAdapter(adapter);

    }
}

