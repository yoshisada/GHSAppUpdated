package com.ghsapp.android.ghsapp;

public class TeacherObject {
    private String fName;
    private String Desc;
    private String room;
    private String email;
    public  TeacherObject(){
        fName = " ";
        room = " ";
        email = " ";
        Desc = " ";
    }
    public void setDetails( String n, String r, String e, String D){
        fName = n;
        room = r;
        Desc = D;
        email = e;
    }
    public String getName(){
        return fName;
    }
    public String getRoom(){
        return room;
    }
    public String getEmail(){
        return email;
    }
    public String getDesc(){
        return Desc;
    }
}
