/*COMP 3450: <Adam Burke – T00572139
              Kumari Herath – T00655616
              Uyen Pham – T00654338 >*/

package com.example.fixxed.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixxed.OpenPage;
import com.example.fixxed.R;
import com.example.fixxed.customerhomepage.consumerpg3;
import com.example.fixxed.login_registerpage.LoginPage;

public class HomePage extends AppCompatActivity {


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //starts the fixer lifecycle
        button=(Button)findViewById(R.id.btn_consumer_customer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomePage.this, LoginPage.class);

                startActivity(intent);

            }
        });




        button=(Button)findViewById(R.id.btn_customer_guest);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomePage.this, consumerpg3.class);

                startActivity(intent);

            }
        });



    }
}