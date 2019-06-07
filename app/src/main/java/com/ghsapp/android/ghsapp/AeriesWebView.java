package com.ghsapp.android.ghsapp;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.ColorStateList;
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

public class AeriesWebView extends AppCompatActivity
{
ImageButton back;
Global global;

    @Override
protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    //theme
    global=((Global)getApplicationContext());
    setTheme(global.getThemes());
    setContentView(R.layout.activity_aeries_web_view);
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

    //web view code
    WebView myWebView = findViewById(R.id.webview);
    myWebView.setWebViewClient(new WebViewClient());
    myWebView.loadUrl("https://aeries.glendora.k12.ca.us/ParentPortal/LoginParent.aspx?page=default.aspx");
    myWebView.getSettings().setJavaScriptEnabled(true);
    CookieManager.getInstance().setAcceptCookie(true);
}
}
