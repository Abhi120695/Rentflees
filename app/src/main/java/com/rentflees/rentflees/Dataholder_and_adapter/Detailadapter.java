package com.rentflees.rentflees.Dataholder_and_adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.rentflees.rentflees.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Abhishek-Pc on 01-06-2016.
 */
public class Detailadapter extends RecyclerView.Adapter<Detailadapter.DetailViewHolder> {
    public static final int appartment = 0;
    public static final int housedetail = 3;
    public static final int houseamenties = 1;
    public static final int Society = 2;
    public static final int blank = 4;
    house House;
    private gridadapter mGridadapter;
    private gridbedsadpter mGridbedsadpter;
    private static Context mContext;
    public Detailadapter(house Houses, Context context) {
        this.mContext=context;

        this.House=Houses;

    }


    @Override
    public DetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if(viewType==housedetail){
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.housedetailcard,parent,false);

            return new housedetailViewHolder(v);
        }
        else if(viewType==appartment){
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.appartmentdetailcard,parent,false);
            return new appartmentViewHolder(v);
        }
        else if(viewType==houseamenties){
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.homeamentiesview,parent,false);
            return new houseamentiesViewHolder(v);

        }
        else if(viewType==Society){
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.societyamentiesview,parent,false);
            return new SocietyViewHolder(v);
        }
        else {
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.blankcard,parent,false);
            return new BlankViewHolder(v);
        }
    }

    @Override
    public void onBindViewHolder(DetailViewHolder holder, int position) {

        if(holder.getItemViewType()==appartment){
            final appartmentViewHolder holder1=(appartmentViewHolder) holder;
            holder1.room.setSelected(true);
            String roomcount = House.BHK;
            int roomcount2 = Integer.valueOf(roomcount);
            ArrayList<Integer> roomno = new ArrayList<>();
            for(int j=0;j< roomcount2;j++){
                roomno.add(j+1);
            }
            mGridadapter= new gridadapter(mContext,roomno);
            holder1.gridview.setAdapter(mGridadapter);

          holder1.mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup radioGroup, int i) {

                  switch (i){
                      case R.id.Room:
                          String roomcount = House.BHK;
                         int roomcount2 = Integer.valueOf(roomcount);
                          ArrayList<Integer> roomno = new ArrayList<>();
                          for(int j=0;j< roomcount2;j++){
                              roomno.add(j+1);
                          }
                          mGridadapter= new gridadapter(mContext,roomno);
                          holder1.gridview.setAdapter(mGridadapter);
                          break;

                      case R.id.Bed:
                          String roomcount3 = House.BHK;
                          int roomcount4 = Integer.valueOf(roomcount3);
                          ArrayList<Integer> roomno1 = new ArrayList<>();
                          for(int j=0;j< roomcount4;j++){
                              roomno1.add(j+1);
                          }
                          mGridbedsadpter= new gridbedsadpter(mContext,roomno1);
                          holder1.gridview.setAdapter(mGridbedsadpter);
                          break;
                  }
              }
          });


        }

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder {

        public house currenthouse;

        public DetailViewHolder(View itemView) {
            super(itemView);

        }
    }

    public class appartmentViewHolder extends DetailViewHolder {
        public TextView heading;
        public TextView subheading;
        public TextView type;
        public TextView Rent;
        public TextView Securitydepsoit;
        public RadioGroup mRadioGroup;
        public RadioButton room;
        public RadioButton bed;
        public RadioButton House1;
        public GridView gridview;


        public appartmentViewHolder(View itemView) {
            super(itemView);
            this.heading = (TextView) itemView.findViewById(R.id.Heading);
            this.subheading = (TextView) itemView.findViewById(R.id.Subheading);
            this.type = (TextView) itemView.findViewById(R.id.Type);
            this.Securitydepsoit = (TextView) itemView.findViewById(R.id.Security);
            this.Rent = (TextView) itemView.findViewById(R.id.Rent);

            this.room = (RadioButton) itemView.findViewById(R.id.Room);
            this.bed = (RadioButton) itemView.findViewById(R.id.Bed);
            this.House1 = (RadioButton) itemView.findViewById(R.id.House);
            this.mRadioGroup= (RadioGroup) itemView.findViewById(R.id.radioGroup);
            this.gridview= (GridView) itemView.findViewById(R.id.gridView);


        }
    }

    public class housedetailViewHolder extends DetailViewHolder {
        public TextView Size;
        public TextView houseid;
        public TextView type;
        public TextView onlyfor;
        public TextView Bedroom;
        public TextView Food;
        public Button Houseaddr;
        public Button Rules;


        public housedetailViewHolder(View itemView) {
            super(itemView);
            this.Size = (TextView) itemView.findViewById(R.id.size);
            this.houseid = (TextView) itemView.findViewById(R.id.houseid);
            this.type = (TextView) itemView.findViewById(R.id.type);
            this.onlyfor = (TextView) itemView.findViewById(R.id.Onlyfor);
            this.Bedroom = (TextView) itemView.findViewById(R.id.Beedroom);
            this.Food = (TextView) itemView.findViewById(R.id.Food);
            this.Houseaddr = (Button) itemView.findViewById(R.id.Houseaddr);
            this.Rules = (Button) itemView.findViewById(R.id.Rules);


        }
    }
    public class houseamentiesViewHolder extends DetailViewHolder {


        public Button viewall;
        public GridView houseamentiesgridview;


        public houseamentiesViewHolder(View itemView) {
            super(itemView);


            this.viewall = (Button) itemView.findViewById(R.id.houseviewallaamenties);

            this.houseamentiesgridview= (GridView) itemView.findViewById(R.id.homeamgrid);


        }
    }
    public class SocietyViewHolder extends DetailViewHolder {


        public Button viewall;
        public GridView houseamentiesgridview;


        public SocietyViewHolder(View itemView) {
            super(itemView);


            this.viewall = (Button) itemView.findViewById(R.id.societyviewallamenties);

            this.houseamentiesgridview= (GridView) itemView.findViewById(R.id.societygrid);


        }
    }
    public class BlankViewHolder extends DetailViewHolder {



        public BlankViewHolder(View itemView) {
            super(itemView);



        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}


