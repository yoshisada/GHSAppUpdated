package com.ghsapp.android.ghsapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.github.tbouron.shakedetector.library.ShakeDetector;

public class MainActivity extends AppCompatActivity {
    ImageButton ghs;
    Button student;
    Button teacher;
    Button counselor;
    Button contact;
    Button other;
    Global global;
    AlertDialog.Builder alertDialog;
    @Override
    public void onBackPressed() {
        finishAffinity();
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_main);
//        alertDialog = new AlertDialog.Builder(MainActivity.this)
//
//                //set message
//                .setMessage("Hey don't shake me!! code: 6985 || I am pretty stressed about this new year, I really need to reevaluate my work load.")
//                //set positive button
//                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        //set what would happen when positive button is clicked
//                        dialogInterface.dismiss();
//                    }
//                });
//
//        ShakeDetector.create(this, new ShakeDetector.OnShakeListener() {
//            @Override
//            public void OnShake() {
//
//                alertDialog.show();
//            }
//        });
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        ghs = findViewById(R.id.ghs);
        ghs = findViewById(R.id.ghs);


        ghs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                global = ((Global) getApplicationContext());
                global.increase();
                // Create object of SharedPreferences.
                SharedPreferences sharedPref = getSharedPreferences("mypref", 0);
                //now get Editor
                SharedPreferences.Editor editor = sharedPref.edit();
                //put your value
                editor.putInt("global", global.getCounter());
                //commits your edits
                editor.commit();
                finish();
                overridePendingTransition(0, 0);
                startActivity(getIntent());
                overridePendingTransition(0, 0);
            }
        });

        student = findViewById(R.id.StudentsButton);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Student.class);
                startActivity(myIntent);
            }
        });
        teacher = findViewById(R.id.TeacherButton);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Teacher.class);
                startActivity(myIntent);
            }
        });
        counselor = findViewById(R.id.TartanEvents);
        counselor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Calender.class);
                startActivity(myIntent);
            }
        });
        contact = findViewById(R.id.ContactButton);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Contact.class);
                startActivity(myIntent);
            }
        });
        other = findViewById(R.id.OtherButton);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, other.class);
                startActivity(myIntent);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        ShakeDetector.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        ShakeDetector.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ShakeDetector.destroy();
    }
}

