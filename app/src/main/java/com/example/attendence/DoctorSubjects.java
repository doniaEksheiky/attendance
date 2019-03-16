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

public class DoctorSubjects extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((DoctorSubjectsAdapter)mRecyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_subjects);



        //expandable recyclerView
        mRecyclerView =(RecyclerView)findViewById(R.id.home_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(DoctorSubjects.this));
        DoctorSubjectsAdapter adapter=new DoctorSubjectsAdapter(this,initData());
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
        DoctorSubjectsCreator doctorSubjectsCreator=DoctorSubjectsCreator.get(this);
        List<DoctorSubjectsParent> doctorSubjectsParents= doctorSubjectsCreator.getAll();

        List<ParentObject>parentObjects =new ArrayList<>();
        for (DoctorSubjectsParent doctorSubjectsParent:doctorSubjectsParents)
        {
            List<Object> childList =new ArrayList<>();
            childList.add(new DoctorSubjectsChild("generate","report","student"));
            doctorSubjectsParent.setChildObjectList(childList);
            parentObjects.add(doctorSubjectsParent);
        }
        return parentObjects;
    }



}
