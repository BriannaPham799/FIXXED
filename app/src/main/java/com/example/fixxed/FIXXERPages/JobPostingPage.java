/*COMP 3450: <Adam Burke – T00572139
              Kumari Herath – T00655616
              Uyen Pham – T00654338 >*/

package com.example.fixxed.FIXXERPages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fixxed.R;
import com.example.fixxed.customerhomepage.consumerpg3;
import com.example.fixxed.customerhomepage.consumerpg5;
import com.example.fixxed.customerhomepage.consumerpg6;
import com.example.fixxed.login_registerpage.LoginPage;
import com.example.fixxed.worker_time_selection;

public class JobPostingPage extends AppCompatActivity {



    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_posting_page);

        imageView = findViewById(R.id.acceptBtn);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(JobPostingPage.this, worker_time_selection.class);
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
                Intent intent = new Intent(JobPostingPage.this, LoginPage.class);
                startActivity(intent);
            }
        });





    }
}