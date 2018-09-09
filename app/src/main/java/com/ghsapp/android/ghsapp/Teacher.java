package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Teacher extends AppCompatActivity
{
    ImageButton back;
    Button Aeries;
    Button Aesop;
    Button DistrictSite;
    Button TartanDaily;
    Button AnnouncementRequest;
    Button Schedule;
    Button Calendar;
    Button map;
    Global global;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        if(global.getCounter() == 0) {setTheme(R.style.red);}
        if(global.getCounter() == 1) {setTheme(R.style.black_oled);}
        if(global.getCounter() == 2) {setTheme(R.style.space);}
        if(global.getCounter() == 3) {setTheme(R.style.forest);}
        setContentView(R.layout.activity_teacher);
        //back button
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
        //theme

        //Website Links
        //Aeries
        Aeries = findViewById(R.id.AeriesButton2);
        Aeries.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, TeacherAeriesWebView.class);
                startActivity(myIntent);
            }
        }));

        //Aesop
        Aesop = findViewById(R.id.AesopButton2);
        Aesop.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, TeacherAesopWebView.class);
                startActivity(myIntent);
            }
        }));
        //District Site
        DistrictSite = findViewById(R.id.DistrictSiteButton2);
        DistrictSite.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, TeacherDistrictSiteWebView.class);
                startActivity(myIntent);
            }
        }));

        //Tartan Daily
        TartanDaily = findViewById(R.id.TartanDailyButton2);
        TartanDaily.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, TwitterAnnouncements.class);
                startActivity(myIntent);
            }
        }));

        //Announcement Request
        AnnouncementRequest = findViewById(R.id.AnnouncementRequestButton2);
        AnnouncementRequest.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, AnnouncementRequestWebView.class);
                startActivity(myIntent);
            }
        }));

        //Schedule
        Schedule = findViewById(R.id.ScheduleButton2);
        Schedule.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, ScheduleImageView.class);
                startActivity(myIntent);
            }
        }));

        //Calendar
        Calendar = findViewById(R.id.CalendarButton2);
        Calendar.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, CalendarImageView.class);
                startActivity(myIntent);
            }
        }));

        //map
        map = findViewById(R.id.MapButton2);
        map.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Teacher.this, MapImageView.class);
                startActivity(myIntent);
            }
        }));

    }
}
