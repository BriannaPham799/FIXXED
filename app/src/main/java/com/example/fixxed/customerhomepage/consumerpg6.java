package com.example.fixxed.customerhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.fixxed.R;

import java.util.Calendar;

public class consumerpg6 extends AppCompatActivity {

    Button button;
    TextView fromTime, toTime;
    int fromTimeHour, fromTimeMin, toTimeHour, toTimeMin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumerpg6);

        fromTime = findViewById(R.id.fromTime);
        toTime = findViewById(R.id.toTime);
        button=(Button)findViewById(R.id.findLocation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(consumerpg6.this, consumerpg9.class);

                startActivity(intent);

            }
        });

        fromTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        consumerpg6.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        fromTimeHour = hourOfDay;
                        fromTimeMin = minute;
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(0,0,0,fromTimeHour,fromTimeMin);
                        fromTime.setText(DateFormat.format("hh:mm aa", calendar));
                    }
                }, 12,0,false
                );
                timePickerDialog.updateTime(fromTimeHour, fromTimeMin);
                timePickerDialog.show();
            }
        });

        toTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        consumerpg6.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        toTimeHour = hourOfDay;
                        toTimeMin = minute;
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(0,0,0,toTimeHour,toTimeMin);
                        toTime.setText(DateFormat.format("hh:mm aa", calendar));
                    }
                }, 12,0,false
                );
                timePickerDialog.updateTime(toTimeHour, toTimeMin);
                timePickerDialog.show();
            }
        });

    }
}