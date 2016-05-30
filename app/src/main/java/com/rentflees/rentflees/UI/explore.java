package com.rentflees.rentflees.UI;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ToggleButton;

import com.rentflees.rentflees.Dataholder_and_adapter.house;
import com.rentflees.rentflees.Dataholder_and_adapter.house_details;
import com.rentflees.rentflees.Dataholder_and_adapter.houseadapter;
import com.rentflees.rentflees.R;

import java.util.List;

public class explore extends AppCompatActivity {
    house_details h1;
    List<house> mHouse;
    houseadapter hd;
    ToggleButton Wishbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        h1=new house_details();
        mHouse =  h1.initializeData(8);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
       hd = new houseadapter(mHouse,this);
        Log.v("test1", Integer.toString(h1.getHouse().size()));
        rv.setAdapter(hd);

    }

    public void addremovewishlist(View view) {
       /* Drawable d = getResources().getDrawable(android.R.drawable.star_on);
        Drawable d1 = getResources().getDrawable(android.R.drawable.star_off);
        Wishbutton= (ToggleButton) findViewById(R.id.Wishbutton);
        if(Wishbutton.isSelected()){
         Wishbutton.setBackgroundDrawable(d);
        }
        else {
            Wishbutton.setBackgroundDrawable(d1);
        }*/
       // Wishbutton.setImageResource();

    }

}
