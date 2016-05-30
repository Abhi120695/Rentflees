package com.rentflees.rentflees.Dataholder_and_adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rentflees.rentflees.R;
import com.rentflees.rentflees.UI.Explordetail;

import java.util.List;

/**
 * Created by Abhishek-Pc on 26-05-2016.
 */
public class houseadapter extends RecyclerView.Adapter<houseadapter.houseViewHolder> {

  List<house> House;
    private static Context mContext;

    public houseadapter(List<house> Houses,Context context) {
        this.mContext=context;

        this.House=Houses;

    }


    @Override
    public houseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.houseview, parent, false);
        houseViewHolder pvh = new houseViewHolder(v);
        return pvh;

    }

    @Override
    public void onBindViewHolder(houseViewHolder holder, int position) {
       holder.Price.setText(House.get(position).Rent);
        holder.Description.setText(House.get(position).description);
        holder.type.setText(House.get(position).type);
        holder.housePhoto.setImageResource(House.get(position).photoId);
       holder.currenthouse=House.get(position);


    }

    @Override
    public int getItemCount() {
        return House.size();
    }

    public static class houseViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView Description;
        TextView Price;
        ImageView housePhoto;
        TextView type;
        public house currenthouse;

        houseViewHolder(View itemView) {
            super(itemView);


            cv = (CardView)itemView.findViewById(R.id.cv);
            Description = (TextView)itemView.findViewById(R.id.discription);
            Price = (TextView)itemView.findViewById(R.id.Price);
            type = (TextView)itemView.findViewById(R.id.type);
            housePhoto = (ImageView)itemView.findViewById(R.id.Housephoto);
            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(mContext, Explordetail.class);
                    i.putExtra("currenthouse",currenthouse);
                    mContext.startActivity(i);


                }
            });
        }

    }


}



