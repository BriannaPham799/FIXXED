/*COMP 3450: <Adam Burke – T00572139
              Kumari Herath – T00655616
              Uyen Pham – T00654338 >*/

package com.example.fixxed.customerhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fixxed.R;

public class consumerpg11 extends AppCompatActivity {


    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumerpg11);

        //Accept button
        imageView = findViewById(R.id.acceptBtn);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(consumerpg11.this, consumerpg12.class);
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
                Intent intent = new Intent(consumerpg11.this, consumerpg3.class); //go back to the description page if you decline your current page 6 view
                startActivity(intent);
            }
        });
    }
}