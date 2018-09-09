package com.ghsapp.android.ghsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AnnouncementRequestWebView extends AppCompatActivity
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

        setContentView(R.layout.activity_announcementrequest_web_view);
        WebView myWebView = findViewById(R.id.webview);
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

        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://goo.gl/forms/J95VfIr89Lnj2QpY2");
        myWebView.getSettings().setJavaScriptEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}
