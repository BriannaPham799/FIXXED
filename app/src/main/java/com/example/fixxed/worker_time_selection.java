package com.example.fixxed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixxed.customerhomepage.consumerpg6;
import com.example.fixxed.customerhomepage.consumerpg9;

public class worker_time_selection extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_time_selection);

        button=(Button)findViewById(R.id.findLocation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(worker_time_selection.this, worker_job_confirmation.class);

                startActivity(intent);

            }
        });

    }
}