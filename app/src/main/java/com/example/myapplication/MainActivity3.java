package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button bed, test, vac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bed = (Button) findViewById(R.id.button4);

        bed.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity3.this, Availability_of_beds.class));
            }
        });

        test = (Button) findViewById(R.id.button5);

        test.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity3.this, Test_centres.class));
            }
        });

        vac = (Button) findViewById(R.id.button6);

        vac.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity3.this, vac_centres.class));
            }
        });


    }
}