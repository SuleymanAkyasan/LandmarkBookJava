package com.example.landmarkbookjava;

import java.io.Serializable;

public class informationsData implements Serializable {
    String country;
    String name;
    int image;

    informationsData(String name,String country,int image){
        this.name=name;
        this.country=country;
        this.image=image;
    }
}
