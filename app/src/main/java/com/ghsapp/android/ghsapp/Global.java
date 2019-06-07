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
        if(counter == 8)
        {
            counter = 0;
        }
    }
    public int getThemes()
    {
        if(counter == 0)
        {
            return (R.style.red);
        }
        if(counter == 1)
        {
            return R.style.black_oled;
        }
        if(counter == 2)
        {
            return (R.style.space);
        }
        if(counter == 3)
        {
            return (R.style.forest);
        }
        if(counter == 4)
        {
            return (R.style.senior);
        }
        if(counter == 5)
        {
            return (R.style.junior);
        }
        if(counter == 6)
        {
            return (R.style.sophmore);
        }
        if(counter == 7)
        {
            return (R.style.freshman);
        }
        return 0;
    }
}