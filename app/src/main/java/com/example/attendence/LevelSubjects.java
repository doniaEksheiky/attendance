package com.example.attendence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class LevelSubjects extends AppCompatActivity {

    private static final String TAG = "LevelSubjects";

    private static final int NUM_COLUMNS = 1;
    ListView olistview;

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_subjects);

        getImages();
    }

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("DataBase");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("AI");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("MAth");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("operating System");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("DB2");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Math2");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("System");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Analysis");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Hello");


        initRecyclerView();
        initRecyclerView2();
        initRecyclerView3();
        initRecyclerView4();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter staggeredRecyclerViewAdapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);
    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView2 = findViewById(R.id.recyclerView2);

        RecyclerViewAdapter staggeredRecyclerViewAdapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        recyclerView2.setAdapter(staggeredRecyclerViewAdapter);
    }
    private void initRecyclerView3(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView3 = findViewById(R.id.recyclerView3);

        RecyclerViewAdapter staggeredRecyclerViewAdapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.HORIZONTAL);
        recyclerView3.setLayoutManager(staggeredGridLayoutManager);
        recyclerView3.setAdapter(staggeredRecyclerViewAdapter);
    }
    private void initRecyclerView4(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView4 = findViewById(R.id.recyclerView4);

        RecyclerViewAdapter staggeredRecyclerViewAdapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.HORIZONTAL);
        recyclerView4.setLayoutManager(staggeredGridLayoutManager);
        recyclerView4.setAdapter(staggeredRecyclerViewAdapter);
    }
}
