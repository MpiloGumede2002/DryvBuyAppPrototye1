package com.example.dryvbuympiloversion;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.window.SplashScreen;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {
ProgressBar progressBar;
int count = 0;
Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                 finish();
             }
         },2000);

         progressBar = findViewById(R.id.pb);
         timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                progressBar.setProgress(count);
                if(count == 100){
                    timer.cancel();
                }

            }
        };
        timer.schedule(timerTask,0,100);



    }
}