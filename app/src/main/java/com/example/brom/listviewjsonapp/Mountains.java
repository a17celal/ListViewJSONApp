package com.example.brom.listviewjsonapp;

/**
 * Created by a17celal on 2018-04-13.
 */

public class Mountains {
    private String namn;
    private String plats;
    private int hojd;
    private String ID;
    private String typ;
    private String cost;
    private String auxdata;

    Mountains(String n, String p, int h) {
        namn=n;
        plats=p;
        hojd=h;
    }

    Mountains(String n, String p, int h, String i, String t, String c, String a) {
        namn=n;
        plats=p;
        hojd=h;
        ID=i;
        typ=t;
        cost=c;
        auxdata=a;
    }

    public String toString() {
        String l=new String();
        l=namn;

        return l;
    }

    public String fakta() {
        String l=new String();
        l=namn;
        l+=" is located in "+plats;
        l+=" and is "+hojd+" meters ";

        return l;
    }

    public String hojd() {
        String l=new String();
        l=Integer.toString(hojd);

        return l;
    }

    public String plats() {
        String l=new String();
        l=plats;

        return l;
    }

}
