package com.rentflees.rentflees.UI;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.GridLayout;
import android.widget.GridView;


import com.rentflees.rentflees.Dataholder_and_adapter.gridadapter;
import com.rentflees.rentflees.Dataholder_and_adapter.gridbedsadpter;
import com.rentflees.rentflees.Dataholder_and_adapter.house;
import com.rentflees.rentflees.R;

import java.util.ArrayList;

public class Explordetail extends AppCompatActivity {
    private gridadapter mGridadapter;
    private gridbedsadpter mGridbedsadpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explordetail);
        GridView roomgrid= (GridView) findViewById(R.id.gridView);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent i =getIntent();
        house currenthouse = (house) i.getSerializableExtra("currenthouse");
        collapsingToolbar.setTitle(currenthouse.Housename);
        String roomcount ;
        int roomcount2;
        ArrayList<Integer> roomno = new ArrayList<>();
        roomcount = currenthouse.BHK;
        roomcount2 = Integer.valueOf(roomcount);



            for(int j=0;j< roomcount2;j++){
                roomno.add(j+1);
            }
      //  mGridadapter= new gridadapter(this,roomno);
        mGridbedsadpter=new gridbedsadpter(this,roomno);
        roomgrid.setAdapter(mGridbedsadpter);





    }
}
