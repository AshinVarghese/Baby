/*
package com.example.baby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageButton;

public class BreastFeedingActivity extends AppCompatActivity {
    Chronometer chronometer_l,chronometer_2;
    ImageButton lBtStart,lBtStop,rBtStart,rBtStop;

    private  boolean isResume;
    Handler handler;
    long tMilliSec,tStart,tBuff,tUpdate = 0L;
    int sec,min,milliSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breast_feeding);

        //left
        chronometer_l = findViewById(R.id.chronometer_left);
        lBtStart = findViewById(R.id.left_start_bt);
        lBtStop = findViewById(R.id.left_stop_bt);

        //right
        chronometer_2 = findViewById(R.id.chronometer_right);
        rBtStart = findViewById(R.id.right_start_bt);
        rBtStop = findViewById(R.id.right_stop_bt);

        handler = new Handler();

        //left button
        lBtStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isResume){
                    tStart = SystemClock.uptimeMillis();
                    handler.postDelayed(runnableL,0);
                    chronometer_l.start();
                    isResume = true;
                    lBtStop.setVisibility(View.GONE);
                    lBtStart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_pause
                    ));
                }else {
                    tBuff +=tMilliSec;
                    handler.removeCallbacks(runnableL);
                    chronometer_l.stop();
                    isResume = false;
                    lBtStop.setVisibility(View.VISIBLE);
                    lBtStart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_play
                    ));
                }
            }
        });
        lBtStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isResume){
                    lBtStart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_play
                    ));
                    tMilliSec = 0L;
                    tStart = 0L;
                    tBuff = 0L;
                    tUpdate = 0L;
                    sec = 0;
                    min = 0;
                    milliSec = 0;
                    chronometer_l.setText("00:00:00");
                }
            }
        });

        //right button
        rBtStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isResume){
                    tStart = SystemClock.uptimeMillis();
                    handler.postDelayed(runnableR,0);
                    chronometer_l.start();
                    isResume = true;
                    rBtStop.setVisibility(View.GONE);
                    rBtStart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_pause
                    ));
                }else {
                    tBuff +=tMilliSec;
                    handler.removeCallbacks(runnableR);
                    chronometer_l.stop();
                    isResume = false;
                    rBtStop.setVisibility(View.VISIBLE);
                    rBtStart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_play
                    ));
                }
            }
        });
        rBtStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isResume){
                    rBtStart.setImageDrawable(getResources().getDrawable(
                            R.drawable.ic_play
                    ));
                    tMilliSec = 0L;
                    tStart = 0L;
                    tBuff = 0L;
                    tUpdate = 0L;
                    sec = 0;
                    min = 0;
                    milliSec = 0;
                    chronometer_2.setText("00:00:00");
                }
            }
        });
    }

    public Runnable runnableL = new Runnable() {
        @Override
        public void run() {
            tMilliSec = SystemClock.uptimeMillis() - tStart;
            tUpdate = tBuff + tMilliSec;
            sec = (int) (tUpdate/1000);
            min = sec/60;
            sec = sec%60;
            milliSec = (int) (tUpdate%100);
            chronometer_l.setText(String.format("%02d",min)+":"+String.format("%02d",sec)+":"+String.format("%02d",milliSec));
            handler.postDelayed(this,60);
        }
    };

    public Runnable runnableR = new Runnable() {
        @Override
        public void run() {
            tMilliSec = SystemClock.uptimeMillis() - tStart;
            tUpdate = tBuff + tMilliSec;
            sec = (int) (tUpdate/1000);
            min = sec/60;
            sec = sec%60;
            milliSec = (int) (tUpdate%100);
            chronometer_2.setText(String.format("%02d",min)+":"+String.format("%02d",sec)+":"+String.format("%02d",milliSec));
            handler.postDelayed(this,60);
        }
    };
}
*/
