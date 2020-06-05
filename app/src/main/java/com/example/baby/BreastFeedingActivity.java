package com.example.baby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;


public class BreastFeedingActivity extends AppCompatActivity {
    Chronometer chronometer_l, chronometer_r, chronometer_t;
    private long pauseOffSetLeft;
    private long pauseOffSetRight;
    private long pauseOffSetTotal;

    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breast_feeding);

        chronometer_l = findViewById(R.id.chronometer_left);
        chronometer_r = findViewById(R.id.chronometer_right);
        chronometer_t = findViewById(R.id.chronometer_total);


    }

        public void leftStartChronometer (View view){
            if (!running){
                chronometer_l.setBase(SystemClock.elapsedRealtime() - pauseOffSetLeft);
                chronometer_l.start();

                chronometer_t.setBase(SystemClock.elapsedRealtime() - pauseOffSetTotal);
                chronometer_t.start();
                running = true;
            }
        }

        public void leftPauseChronometer (View view){
            if (running){
                chronometer_l.stop();
                pauseOffSetLeft = SystemClock.elapsedRealtime() - chronometer_l.getBase();

                chronometer_t.stop();
                pauseOffSetTotal = SystemClock.elapsedRealtime() - chronometer_t.getBase();

                running=false;
            }
        }

        public void leftStopChronometer (View view){
            chronometer_l.setBase(SystemClock.elapsedRealtime());

            chronometer_t.setBase(chronometer_t.getBase() - pauseOffSetLeft);
            pauseOffSetLeft = 0;
        }

        public void rightStartChronometer (View view){
            if (!running){
                chronometer_r.setBase(SystemClock.elapsedRealtime() - pauseOffSetRight);
                chronometer_r.start();

                chronometer_t.setBase(SystemClock.elapsedRealtime() - pauseOffSetTotal);
                chronometer_t.start();
                running = true;
            }
        }

        public void rightPauseChronometer (View view){
            if (running){
                chronometer_r.stop();
                pauseOffSetRight = SystemClock.elapsedRealtime() - chronometer_r.getBase();

                chronometer_t.stop();
                pauseOffSetTotal = SystemClock.elapsedRealtime() - chronometer_t.getBase();
                running=false;
            }
        }

        public void rightStopChronometer (View view){
            chronometer_r.setBase(SystemClock.elapsedRealtime());
            pauseOffSetRight = 0;
        }

}