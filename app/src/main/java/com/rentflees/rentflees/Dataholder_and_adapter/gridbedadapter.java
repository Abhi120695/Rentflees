package com.rentflees.rentflees.Dataholder_and_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.rentflees.rentflees.R;

import java.util.ArrayList;

/**
 * Created by Abhishek-Pc on 01-06-2016.
 */
public class gridbedadapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Integer> mHouse;

    public gridbedadapter(Context context, ArrayList<Integer> mhouse){
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
            gridView = inflater.inflate(R.layout.gridbed, null);

            ImageButton mImageButton = (ImageButton) gridView.findViewById(R.id.bedimage);
            TextView Roomtextview = (TextView) gridView.findViewById(R.id.bedno);
            int  position2=position+ 1;
            Roomtextview.setText("Bed "+ position2);

            mImageButton.setImageResource(R.drawable.bed);
            // convertView.setTag(holder);

        }
        else {

            gridView = (View) convertView;

        }

        return gridView;
    }
}
