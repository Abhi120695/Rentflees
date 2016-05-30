package com.rentflees.rentflees.Dataholder_and_adapter;

import java.io.Serializable;

/**
 * Created by Abhishek-Pc on 29-05-2016.
 */
@SuppressWarnings("serial")
public class house implements Serializable{
    public String Housename;
    public String Rent;
    public String BHK;
    public String type;
        int photoId;

       String Deposit;
        Boolean Wish=false;
        String description;

        house(String name, String Rent,String BHK,String Deposit, String Description,String type,int photoId) {
            this.Housename = name;
            this.Rent = Rent;
            this.BHK=BHK;
            this.Deposit=Deposit;
            this.photoId = photoId;
            this.description=Description;
            this.type=type;
        }

}
