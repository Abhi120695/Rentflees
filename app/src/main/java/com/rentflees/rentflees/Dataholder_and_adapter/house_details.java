package com.rentflees.rentflees.Dataholder_and_adapter;

import com.rentflees.rentflees.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek-Pc on 26-05-2016.
 */
public class house_details {





    private List<house> House;


    public List<house> initializeData(int num){

        House = new ArrayList<>();
        //persons.add(new Person("Emma Wilson", "23 years old", R.drawable.emma));
        //persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.lavery));
        //persons.add(new Person("Lillie Watts", "35 years old", R.drawable.lillie));
        for(int i=0;i<num;i++) {
            House.add(new house("house" + i,"Rs"+(i+1)+(i+1)*1000,"4",i + "000", "New House fully furnished and new New House fully furnished and new ","Boys", R.drawable.house3));
        }
        return House;

    }

    public List<house> getHouse() {
        return House;
    }
}
