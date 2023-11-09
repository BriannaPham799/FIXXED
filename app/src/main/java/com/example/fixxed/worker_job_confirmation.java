package com.example.fixxed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fixxed.FIXXERPages.JobPostingPage;
import com.example.fixxed.customerhomepage.consumerpg11;
import com.example.fixxed.customerhomepage.consumerpg3;
import com.example.fixxed.customerhomepage.consumerpg9;

public class worker_job_confirmation extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_job_confirmation);

        //Accept button
        imageView = findViewById(R.id.acceptBtn);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(worker_job_confirmation.this, last_page.class);
                startActivity(intent);
            }
        });

        //Decline button
        imageView = findViewById(R.id.rejectBtn);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(worker_job_confirmation.this, JobPostingPage.class); //go back to the description page if you decline your current page 6 view
                startActivity(intent);
            }
        });
    }
}