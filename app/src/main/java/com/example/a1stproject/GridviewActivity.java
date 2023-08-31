package com.example.a1stproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class GridviewActivity extends AppCompatActivity {

    GridView gridview;

    List<Model_Gridview> avsGrid = new ArrayList<>();

    MaterialButton btn_grid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        gridview = findViewById(R.id.grid);

        btn_grid = findViewById( R.id.btn_grid );

        Model_Gridview avs;

        avs = new Model_Gridview(R.drawable.image3,"Ankit Senjaliya","01-11-2001");
        avsGrid.add(avs);
        avs = new Model_Gridview(R.drawable.image4,"Nikunj Sanghani","16-11-2001");
        avsGrid.add(avs);
        avs = new Model_Gridview(R.drawable.image5,"Bhautik Karma","12-01-2002");
        avsGrid.add(avs);
        avs = new Model_Gridview(R.drawable.image6,"Sagar Vakani","26-12-2001");
        avsGrid.add(avs);
        avs = new Model_Gridview(R.drawable.image7,"Amish Kajavadra","06-10-2001");
        avsGrid.add(avs);
        avs = new Model_Gridview(R.drawable.image8,"Manav Dalsania","30-05-2001");
        avsGrid.add(avs);

        GridAdapter GridAdapter=new GridAdapter(this,avsGrid);
        gridview.setAdapter(GridAdapter);

        btn_grid.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GridviewActivity.this, ViewpagerActivity.class);
                startActivity( intent );
            }
        } );

    }
}