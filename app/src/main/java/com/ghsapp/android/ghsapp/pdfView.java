package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfView extends AppCompatActivity {
    PDFView pdfView;
    ImageButton back;
    Global global;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        if(global.getCounter() == 0) {setTheme(R.style.red);}
        if(global.getCounter() == 1) {setTheme(R.style.black_oled);}
        if(global.getCounter() == 2) {setTheme(R.style.space);}
        if(global.getCounter() == 3) {setTheme(R.style.forest);}
        setContentView(R.layout.pdf_test);

        pdfView= findViewById(R.id.pdfView);
        pdfView.fromAsset("ghsAbsence.pdf").load();
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
    }
}
