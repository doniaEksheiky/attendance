package com.example.attendence;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;

public class StudentSubjects extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((StudentSubjectsAdapter)mRecyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_subjects);



        //expandable recyclerView
        mRecyclerView =(RecyclerView)findViewById(R.id.student_home_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(StudentSubjects.this));
        StudentSubjectsAdapter adapter=new StudentSubjectsAdapter(this,initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);
        mRecyclerView.setAdapter(adapter);
        //navigation drawer
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        mDrawerLayout =(DrawerLayout) findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private List<ParentObject> initData()
    {
        StudentSubjectsCreator studentSubjectsCreator=StudentSubjectsCreator.get(this);
        List<StudentSubjectsParent> studentSubjectsParents= studentSubjectsCreator.getAll();

        List<ParentObject>parentObjects =new ArrayList<>();
        for (StudentSubjectsParent studentSubjectsParent:studentSubjectsParents)
        {
            List<Object> childList =new ArrayList<>();
            childList.add(new StudentSubjectsChild("scan","report"));
            studentSubjectsParent.setChildObjectList(childList);
            parentObjects.add(studentSubjectsParent);
        }
        return parentObjects;
    }



}
