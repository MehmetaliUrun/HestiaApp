package com.example.myapplication;

import java.io.Serializable;

public class ıletısımler implements Serializable{

    String isim ;
    String mail;
    String Gorev;
    String numara;
    int image;

    public ıletısımler(String isim, String mail, String gorev,String numara, int image){



        this.isim=isim;
        this.mail=mail;
        this.Gorev=gorev;
        this.numara=numara;
        this.image=image;




    }
}
