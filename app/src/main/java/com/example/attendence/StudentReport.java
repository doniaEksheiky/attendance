package com.example.attendence;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentReport extends AppCompatActivity {
    private static final String TAG = "StudentReport";
    private ListView oListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_report_listview);
        oListView=(ListView)findViewById(R.id.listView);
        ArrayList <stuCard> list=new ArrayList<>();

        list.add(new stuCard("Lec 1","2/3/2015","drawable://" + R.drawable.right1));
        list.add(new stuCard("Lec 2","3/12/2012","drawable://" + R.drawable.right1));
        list.add(new stuCard("Lec 3","14/12/2012","drawable://" + R.drawable.wrong));
        list.add(new stuCard("Lec 4","10/12/2012","drawable://" + R.drawable.right1));
        list.add(new stuCard("Lec 5","1/12/2012","drawable://" + R.drawable.right1));
        list.add(new stuCard("Lec 1","12/12/2012","drawable://" + R.drawable.wrong));
        list.add(new stuCard("Lec 2","3/12/2012","drawable://" + R.drawable.right1));
        list.add(new stuCard("Lec 3","14/12/2012","drawable://" + R.drawable.wrong));
        list.add(new stuCard("Lec 4","10/12/2012","drawable://" + R.drawable.wrong));
        list.add(new stuCard("Lec 5","11/12/2012","drawable://" + R.drawable.right1));

        customListAdapterStudent adapter=new customListAdapterStudent (this,R.layout.activity_student_report,list);
        oListView.setAdapter(adapter);

    }
}
