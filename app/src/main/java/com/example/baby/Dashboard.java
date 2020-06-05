package com.example.baby;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    private CardView cardViewFeeding,cardViewDiaper,cardViewPumping,cardViewSleep,cardViewMedication,cardViewNotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //defining cards
        cardViewFeeding = (CardView) findViewById(R.id.feeding_card);
        cardViewDiaper = (CardView) findViewById(R.id.diaper_card);
        cardViewPumping = (CardView) findViewById(R.id.pumping_card);
        cardViewSleep = (CardView) findViewById(R.id.sleeping_card);
        cardViewMedication = (CardView) findViewById(R.id.medication_card);
        cardViewNotes = (CardView) findViewById(R.id.notes_card);

        //adding click listener to cards
        cardViewFeeding.setOnClickListener(this);
        cardViewDiaper.setOnClickListener(this);
        cardViewPumping.setOnClickListener(this);
        cardViewSleep.setOnClickListener(this);
        cardViewMedication.setOnClickListener(this);
        cardViewNotes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i ;

        switch (v.getId()) {
            case R.id.feeding_card:
                i = new Intent(this, BreastFeedingActivity.class);
                startActivity(i);
                break;

            case R.id.diaper_card:
                i = new Intent(this,DiaperActivity.class);
                startActivity(i);
                break;

            case R.id.pumping_card:
                i = new Intent(this,PumpingActivity.class);
                startActivity(i);
                break;

            case R.id.sleeping_card:
                i = new Intent(this,SleepActivity.class);
                startActivity(i);
                break;

            case R.id.medication_card:
                i = new Intent(this,MedicationActivity.class);
                startActivity(i);
                break;

            case R.id.notes_card:
                i = new Intent(this,NotesActivity.class);
                startActivity(i);
                break;

            default:break;

        }
    }
}
