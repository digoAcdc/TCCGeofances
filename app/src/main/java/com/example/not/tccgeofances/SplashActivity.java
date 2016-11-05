package com.example.not.tccgeofances;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private TextView tvNome;
    private TextView tvNome1;
    private TextView tvNome2;
    private TextView tvGeofance;
    private LinearLayout layGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tvNome = (TextView) findViewById(R.id.tvNome);
        tvNome1 = (TextView) findViewById(R.id.tvNome1);
        tvNome2 = (TextView) findViewById(R.id.tvNome2);
        tvGeofance = (TextView) findViewById(R.id.tvGeofance);
        layGrupo = (LinearLayout) findViewById(R.id.layGrupo);

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fad_in);
        tvNome.startAnimation(animation1);
        tvNome1.startAnimation(animation1);
        tvNome2.startAnimation(animation1);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash);
        tvGeofance.startAnimation(animation);


        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, AllGeofencesActivity.class);
               // intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

                overridePendingTransition(R.anim.fad_in, R.anim.fad_out);
                finish();

            }
        }, 10100);

    }
}
