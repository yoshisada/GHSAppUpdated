package com.ghsapp.android.ghsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.chrisbanes.photoview.PhotoView;


public class CalendarImageView extends AppCompatActivity
{
    ImageButton back;
    Global global;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        if(global.getCounter() == 0) {setTheme(R.style.red);}
        if(global.getCounter() == 1) {setTheme(R.style.black_oled);}
        if(global.getCounter() == 2) {setTheme(R.style.space);}
        if(global.getCounter() == 3) {setTheme(R.style.forest);}
        setContentView(R.layout.activity_calendar_image_view);
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });


        pdfView= findViewById(R.id.pdfView);
        pdfView.fromAsset("OddEvenCalendar_2018.pdf").load();

    }
}
