package com.ghsapp.android.ghsapp;

import android.app.Application;

public  class  Global extends Application {
    private int counter = 0;
    public int getCounter() {
        return counter;
    }
    public void set(int val)
    {
        counter = val;
    }
    public void increase() {
        this.counter++;
        if(counter == 4)
        {
            counter = 0;
        }


    }
}