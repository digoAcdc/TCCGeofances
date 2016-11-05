package com.example.not.tccgeofances;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                finish();
                Intent intent = new Intent(SplashActivity.this, AllGeofencesActivity.class);
                startActivity(intent);

            }
        }, 6600);

    }
}
