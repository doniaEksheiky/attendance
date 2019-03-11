package com.example.attendence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AddedSubjects extends AppCompatActivity {
    private static final String TAG = "AddedSubjects";
    private ListView oListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.added_subjects_listview);
        oListView=(ListView)findViewById(R.id.listView);

        ArrayList<AddedSubjectsCard> list=new ArrayList<>();

        list.add(new AddedSubjectsCard("AI"));
        list.add(new AddedSubjectsCard("Web design"));
        list.add(new AddedSubjectsCard("Data base"));
        list.add(new AddedSubjectsCard("graphics"));
        list.add(new AddedSubjectsCard("AI"));
        list.add(new AddedSubjectsCard("Web design"));
        list.add(new AddedSubjectsCard("Data base"));
        list.add(new AddedSubjectsCard("graphics"));



        customListAdapterAddedSubjects adapter=new customListAdapterAddedSubjects (this,R.layout.activity_my_added_subjects,list);
        oListView.setAdapter(adapter);

    }
}
