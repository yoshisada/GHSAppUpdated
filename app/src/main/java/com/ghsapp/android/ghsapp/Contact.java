package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class Contact extends AppCompatActivity {
    Button pdf;
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
        setContentView(R.layout.activity_contact);
        TextView call = findViewById(R.id.callSchool);
            call.setMovementMethod(LinkMovementMethod.getInstance());
        TextView text = findViewById(R.id.addressGoTo);
                text.setMovementMethod(LinkMovementMethod.getInstance());
                TextView webLink = findViewById(R.id.webLink);
                    webLink.setMovementMethod(LinkMovementMethod.getInstance());
        pdf = findViewById(R.id.pdfTest);
        pdf.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Contact.this, pdfView.class);
                startActivity(myIntent);
            }
        }));

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
