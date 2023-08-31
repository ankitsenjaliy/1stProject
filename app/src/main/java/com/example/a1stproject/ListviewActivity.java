package com.example.a1stproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {

    ListView listview;

    List<Model_Listview> avsList = new ArrayList<>();

    MaterialButton btn_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listview = findViewById(R.id.list);

        btn_list = findViewById( R.id. btn_list);

        Model_Listview avs;

        avs = new Model_Listview(R.drawable.image3,"Ankit Senjaliya","01-11-2001","12:00 PM", "7624066500");
        avsList.add(avs);
        avs = new Model_Listview(R.drawable.image4,"Nikunj Sanghani","16-11-2001","03:00 PM", "9328646220");
        avsList.add(avs);
        avs = new Model_Listview(R.drawable.image5,"Bhautik Karma","12-01-2002","09:00 AM", "6353790743");
        avsList.add(avs);
        avs = new Model_Listview(R.drawable.image6,"Sagar Vakani","26-12-2001","05:00 PM","9157261201");
        avsList.add(avs);
        avs = new Model_Listview(R.drawable.image7,"Amish Kajavadra","06-10-2001","08:30 PM","9925320820");
        avsList.add(avs);
        avs = new Model_Listview(R.drawable.image8,"Manav Dalsania","30-05-2001","10:45 PM","7383160655");
        avsList.add(avs);

        ListAdapter ListAdapter=new ListAdapter(this,avsList);
        listview.setAdapter(ListAdapter);

        btn_list.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ListviewActivity.this, GridviewActivity.class);
                startActivity( intent );
            }
        } );

    }
}