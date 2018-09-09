package com.ghsapp.android.ghsapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TeacherAeriesWebView extends AppCompatActivity
{
    ImageButton back;
    Global global;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        if(global.getCounter() == 0) {setTheme(R.style.red);}
        if(global.getCounter() == 1) {setTheme(R.style.black_oled);}
        if(global.getCounter() == 2) {setTheme(R.style.space);}
        if(global.getCounter() == 3) {setTheme(R.style.forest);}
        setContentView(R.layout.activity_teacher_aeries_web_view);
        //back button
        final WebView myWebView = findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
                myWebView.destroy();

            }
        });


        myWebView.loadUrl("https://aeries.glendora.k12.ca.us/Aeries.NET/Login.aspx?page=default.aspx");
        myWebView.getSettings().setJavaScriptEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);

    }
}
