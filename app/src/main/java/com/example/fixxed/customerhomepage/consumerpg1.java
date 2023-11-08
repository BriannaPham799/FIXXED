package com.example.fixxed.customerhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fixxed.R;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class consumerpg1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumerpg1);

        //For Customer button
        Button btn_consumer_customer = findViewById(R.id.btn_consumer_customer);
        btn_consumer_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to open the next activity
                Intent intent = new Intent(consumerpg1.this, consumerpg2.class);
                startActivity(intent);
            }
        });

        //For a guest login
        TextView link_guest = findViewById(R.id.link_guest);
        link_guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to open the next activity
                Intent intent = new Intent(consumerpg1.this, consumerpg2.class);
                startActivity(intent);
            }
        });
    }
}