package com.example.baby;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class BottleFeedingActivity extends AppCompatActivity {
    EditText editTextTime,editTextMeasure;
    TimePickerDialog timePickerDialog;
    RadioGroup radioGroup;
    ImageButton buttonBack,buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle_feeding);

        editTextTime = findViewById(R.id.et_time);
        editTextMeasure = findViewById(R.id.et_measure);
        radioGroup = findViewById(R.id.rg_milkType);
        buttonBack = findViewById(R.id.cancel_button);
        buttonSubmit = findViewById(R.id.confirm_button);

      //radio button

      radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(RadioGroup group, int checkedId) {
              RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
          }
      });


        //submit button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonID = radioGroup.getCheckedRadioButtonId();
                if (radioButtonID == -1){
                    Toast.makeText(BottleFeedingActivity.this, "Select what you are feeding...", Toast.LENGTH_SHORT).show();
                }
                else {
                    RadioButton radioButton = (RadioButton)radioGroup.findViewById(radioButtonID);
                    Toast.makeText(BottleFeedingActivity.this,radioButton.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
//time
        editTextTime.setOnClickListener(new View.OnClickListener() {
            Calendar calendar = Calendar.getInstance();
            int hourOfDay=calendar.get(Calendar.HOUR);
            int minute=calendar.get(Calendar.MINUTE);

            @Override
            public void onClick(View v) {
                timePickerDialog = new TimePickerDialog(BottleFeedingActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        String am_pm;
                        if (hourOfDay<12) {
                            am_pm = "AM";
                            editTextTime.setText(hourOfDay + ":" + minute + " " + am_pm);
                        }
                        else if (hourOfDay == 12){
                            am_pm = "PM";
                            editTextTime.setText(hourOfDay + ":" + minute + " " + am_pm);

                        }
                        else {
                            am_pm = "PM";
                            editTextTime.setText(hourOfDay + ":" + minute + " " + am_pm);

                        }
                    }
                },hourOfDay,minute,false);
                timePickerDialog.show();
            }
        });

    }
}
