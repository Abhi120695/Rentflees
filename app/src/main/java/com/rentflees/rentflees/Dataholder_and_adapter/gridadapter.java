package com.rentflees.rentflees.Dataholder_and_adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.rentflees.rentflees.R;

import java.util.ArrayList;

/**
 * Created by Abhishek-Pc on 28-05-2016.
 */

public class gridadapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Integer> mHouse;

    public gridadapter(Context context, ArrayList<Integer> mhouse){
        mHouse=mhouse;
        mContext=context;
    }

    @Override
    public int getCount() {
        return mHouse.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(mContext);
            gridView = inflater.inflate(R.layout.customgridroom, null);

            ImageButton mImageButton = (ImageButton) gridView.findViewById(R.id.Roomimage);
            TextView Roomtextview = (TextView) gridView.findViewById(R.id.Roomno);
            int  position2=position+ 1;
            Roomtextview.setText("Room "+ position2);
            mImageButton.setImageResource(R.drawable.door1);
           // convertView.setTag(holder);

        }
        else {

            gridView = (View) convertView;

        }

        return gridView;
}
}

