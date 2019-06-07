package com.ghsapp.android.ghsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SocialMedia extends AppCompatActivity
{
    ImageButton back;
    Button Instagram;
    Button Twitter;
    Button YouTube;
    Button Yearbook;
    Global global;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_social_media);
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

        //opens Instagram app, if not installed opens the webpage
        Instagram = findViewById(R.id.InstagramButton);
        Instagram.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("instagram://media?id=434784289393782000_15903882"));
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/glendorahs/"));
                try {
                    startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }

        });
        //opens Twitter app, if not installed opens the webpage
        Twitter = findViewById(R.id.TwitterButton);
        Twitter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SocialMedia.this, TwitterAnnouncements.class);
                startActivity(myIntent);
            }

        });
        //opens the webpage for Yearbook
        Yearbook = findViewById(R.id.YearbookButton);
        Yearbook.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/glendorayearbook/home"));
                startActivity(webIntent);
            }

        });
        //opens Youtube app, if not installed opens the webpage
        YouTube = findViewById(R.id.YouTubeButton);
        YouTube.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube"));
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/tartanbroadcasting13/videos"));
                try {
                    startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });
    }
}
