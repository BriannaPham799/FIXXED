package com.example.fixxed.login_registerpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixxed.R;
import com.example.fixxed.customerhomepage.consumerpg3;
import com.example.fixxed.customerhomepage.consumerpg5;

public class InforPage extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor_page);


        button=(Button)findViewById(R.id.submitBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(InforPage.this, DocumentUploadPage.class);

                startActivity(intent);

            }
        });



        //submitBtn



    }
}