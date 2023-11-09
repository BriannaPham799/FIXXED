package com.example.fixxed.login_registerpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fixxed.R;
import com.example.fixxed.homepage.HomePage;

public class LoginPage extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        //Takes you to the register page

        textView=(TextView) findViewById(R.id.registerLink);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LoginPage.this, RegisterPage.class);

                startActivity(intent);

            }
        });




    }
}