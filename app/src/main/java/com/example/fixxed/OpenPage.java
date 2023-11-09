/*COMP 3450: <Adam Burke – T00572139
              Kumari Herath – T00655616
              Uyen Pham – T00654338 >*/

package com.example.fixxed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixxed.customerhomepage.consumerpg3;
import com.example.fixxed.customerhomepage.consumerpg5;
import com.example.fixxed.homepage.HomePage;

public class OpenPage extends AppCompatActivity {



    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_page);


        button=(Button)findViewById(R.id.startHereBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(OpenPage.this, HomePage.class);

                startActivity(intent);

            }
        });






    }
}