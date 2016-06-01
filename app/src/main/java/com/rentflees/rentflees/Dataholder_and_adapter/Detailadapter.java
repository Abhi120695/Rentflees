package com.rentflees.rentflees.Dataholder_and_adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.rentflees.rentflees.R;

/**
 * Created by Abhishek-Pc on 01-06-2016.
 */
public class Detailadapter extends RecyclerView.Adapter<Detailadapter.DetailViewHolder> {


    @Override
    public DetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DetailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
        public RadioButton room;
        public RadioButton bed;
        public RadioButton House;


        public appartmentViewHolder(View itemView) {
            super(itemView);
            this.heading = (TextView) itemView.findViewById(R.id.Heading);
            this.subheading = (TextView) itemView.findViewById(R.id.Subheading);
            this.type = (TextView) itemView.findViewById(R.id.Type);
            this.Securitydepsoit = (TextView) itemView.findViewById(R.id.Security);
            this.Rent = (TextView) itemView.findViewById(R.id.Rent);
            this.room = (RadioButton) itemView.findViewById(R.id.Room);
            this.bed = (RadioButton) itemView.findViewById(R.id.Bed);
            this.House = (RadioButton) itemView.findViewById(R.id.House);

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
}


