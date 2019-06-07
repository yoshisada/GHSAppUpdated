package com.ghsapp.android.ghsapp;

import android.animation.Animator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;


public class AnimationView extends AppCompatActivity
{
    Global global;
    private LottieAnimationView animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPref= getSharedPreferences("mypref", 0);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_animation_view);

        animationView = findViewById(R.id.animation_view);
        animationView.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        animationView.setImageAssetsFolder("Images");
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                Intent myIntent = new Intent(AnimationView.this, MainActivity.class);
                startActivity(myIntent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {
                Intent myIntent = new Intent(AnimationView.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
