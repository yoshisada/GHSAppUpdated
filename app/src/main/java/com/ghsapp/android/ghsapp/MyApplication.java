package com.ghsapp.android.ghsapp;

import android.app.Application;

public class MyApplication extends Application {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void increase() {
        counter++;
    }
}