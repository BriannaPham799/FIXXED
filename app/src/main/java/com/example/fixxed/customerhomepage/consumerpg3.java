package com.example.fixxed.customerhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixxed.R;

public class consumerpg3 extends AppCompatActivity {



    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumerpg3);


        button=(Button)findViewById(R.id.buttonSubmit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(consumerpg3.this, consumerpg4.class);

                startActivity(intent);

            }
        });

    }
}