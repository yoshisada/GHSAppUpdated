package com.ghsapp.android.ghsapp;

import android.animation.Animator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;


public class AnimationView2 extends AppCompatActivity
{
    Global global;
    AlertDialog.Builder alertDialog;
    private LottieAnimationView animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPref= getSharedPreferences("mypref", 0);
        global=((Global)getApplicationContext());
        global.set(sharedPref.getInt("global",0));
        if(global.getCounter() == 0) {setTheme(R.style.red);}
        if(global.getCounter() == 1) {setTheme(R.style.black_oled);}
        if(global.getCounter() == 2) {setTheme(R.style.space);}
        if(global.getCounter() == 3) {setTheme(R.style.forest);}
        setContentView(R.layout.activity_animation_view);
        alertDialog = new AlertDialog.Builder(AnimationView2.this)

                //set message
                .setMessage("Hey this is pretty cool!!! code 5183|| Can anyone tell me about Mr. Liao?")
                //set positive button
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //set what would happen when positive button is clicked
                        dialogInterface.dismiss();
                    }
                });


        animationView = findViewById(R.id.animation_view);
        animationView.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        animationView.setImageAssetsFolder("Images");
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                alertDialog.show();
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                Intent myIntent = new Intent(AnimationView2.this, MainActivity.class);
                startActivity(myIntent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {
                Intent myIntent = new Intent(AnimationView2.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
