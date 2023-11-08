package com.example.fixxed.customerhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.fixxed.R;

public class consumerpg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumerpg2);


        //For Plumber option
        Button btn_plumber = findViewById(R.id.btn_plumber);
        btn_plumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to open the next activity
                Intent intent = new Intent(consumerpg2.this, consumerpg3.class);
                startActivity(intent);
            }
        });

        //For Electrician option
        Button btn_electrician = findViewById(R.id.btn_electrician);
        btn_electrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to open the next activity
                Intent intent = new Intent(consumerpg2.this, consumerpg3.class);
                startActivity(intent);
            }
        });

                //Use the name of the buttons to display in the confirmation
                Button btnPlumber = findViewById(R.id.btn_plumber);
                Button btnElectrician = findViewById(R.id.btn_electrician);

                btnPlumber.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // When "Find a Plumber" button is clicked
                        openNextActivity("Plumber");
                    }
                });

                btnElectrician.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // When "Find an Electrician" button is clicked
                        openNextActivity("Electrician");
                    }
                });
            }

            private void openNextActivity(String focusCareer) {
                Intent intent = new Intent(this, consumerpg5.class);
                intent.putExtra("focusCareer", focusCareer);
                startActivity(intent);




    }
}