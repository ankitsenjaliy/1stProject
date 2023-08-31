package com.example.a1stproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    LinearLayoutManager Orientation;

    List<Model_Recyclerview> avsRecycler = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        recyclerview = findViewById(R.id.recycler);

            Model_Recyclerview avs;

            avs = new Model_Recyclerview(R.drawable.image3, "Ankit Senjaliya");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image4, "Nikunj Sanghani");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image5, "Bhautik Karma");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image6, "Sagar Vakani");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image7, "Amish Kajavadra");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image8, "Manav Dalasania");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image9, "Akshay Patel");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image10, "Darshan Golani");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image11, "Deep Siroya");
            avsRecycler.add(avs);
            avs = new Model_Recyclerview(R.drawable.image12, "Harsh Swami");
            avsRecycler.add(avs);

            RecyclerAdapter RecyclerAdapter = new RecyclerAdapter(this, avsRecycler);

            Orientation = new LinearLayoutManager(RecyclerviewActivity.this,LinearLayoutManager.VERTICAL,false);
            recyclerview.setLayoutManager(Orientation);


//            Orientation = new LinearLayoutManager(RecyclerviewActivity.this,LinearLayoutManager.HORIZONTAL,false);
//            recyclerview.setLayoutManager(Orientation);

//            Orientation = new GridLayoutManager(this, 2);
//            recyclerview.setLayoutManager(Orientation);

            recyclerview.setAdapter(RecyclerAdapter);

    }
}