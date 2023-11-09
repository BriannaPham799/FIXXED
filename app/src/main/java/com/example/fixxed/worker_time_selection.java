package com.example.fixxed;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.fixxed.customerhomepage.consumerpg6;
import com.example.fixxed.customerhomepage.consumerpg9;

import java.util.Calendar;

public class worker_time_selection extends AppCompatActivity {

    Button button;
    TextView fromTime, toTime;
    int fromTimeHour, fromTimeMin, toTimeHour, toTimeMin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_time_selection);

        fromTime = findViewById(R.id.fromTimeWorker);
        toTime = findViewById(R.id.toTimeWorker);
        button=(Button)findViewById(R.id.findLocation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(worker_time_selection.this, worker_job_confirmation.class);

                startActivity(intent);

            }
        });
        fromTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        worker_time_selection.this, new TimePickerDialog.OnTimeSetListener() {
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
                        worker_time_selection.this, new TimePickerDialog.OnTimeSetListener() {
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