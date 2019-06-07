package com.ghsapp.android.ghsapp;



import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Student extends AppCompatActivity
{
ImageButton back;
Button Aeries;
Button AnnouncementRequest;
Button SocialMedia;
Button Calendar;
Button Schedule;
Button Map;
Global global;
Button Classroom;
Button Naviance;
Button Athletics;
Button CollegeBoard;
Button Tutorcom;
Button StudentStore;
Button TeacherSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_student);
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
        //themes

        //Website Links
        //Aeries
            Aeries = findViewById(R.id.AeriesButton);
            Aeries.setOnClickListener((new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Student.this, AeriesWebView.class);
                    startActivity(myIntent);
                }
            }));

         //tartan daily

        //announcement request
        AnnouncementRequest = findViewById(R.id.AnnouncementRequest);
        AnnouncementRequest.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, AnnouncementRequestWebView.class);
                startActivity(myIntent);
            }
        }));

        //social media
        SocialMedia = findViewById(R.id.SocialMedia);
        SocialMedia.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, SocialMedia.class);
                startActivity(myIntent);
            }
        }));

        //calendar
        Schedule = findViewById(R.id.ScheduleButton);
        Schedule.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, ScheduleImageView.class);
                startActivity(myIntent);
            }
        }));

        //schedule
        Calendar = findViewById(R.id.CalendarButton);
        Calendar.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, CalendarImageView.class);
                startActivity(myIntent);
            }
        }));

        //map
        Map = findViewById(R.id.MapButton);
        Map.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, MapImageView.class);
                startActivity(myIntent);
            }
        }));


        //classroom
        Classroom = findViewById(R.id.ClassroomButton);
        Classroom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com"));
                try {
                    Intent appIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.classroom");
                    startActivity(appIntent);
                } catch (NullPointerException ex) {
                    Intent myIntent = new Intent(Student.this, ClassroomWebView.class);
                    startActivity(myIntent);
                }
            }

        });
        //Teacher Search
        Aeries = findViewById(R.id.TeacherSearch);
        Aeries.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, TeacherSearch.class);
                startActivity(myIntent);
            }
        }));

        //naviance
        Naviance = findViewById(R.id.NavianceButton);
        Naviance.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, NavianceWebView.class);
                startActivity(myIntent);
            }
        }));

        Athletics = findViewById(R.id.AthleticsButton);
        Athletics.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, AthleticsWebView.class);
                startActivity(myIntent);
            }
        }));

        //collegeboard
        CollegeBoard = findViewById(R.id.CollegeBoardButton);
        CollegeBoard.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, CollegeBoardWebView.class);
                startActivity(myIntent);
            }
        }));

        //tutor.com
        Tutorcom = findViewById(R.id.TutorcomButton);
        Tutorcom.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, TutorcomWebView.class);
                startActivity(myIntent);
            }
        }));

        //student store
        StudentStore = findViewById(R.id.StudentStoreButton);
        StudentStore.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Student.this, StudentStoreWebView.class);
                startActivity(myIntent);
            }
        }));


    }
}
