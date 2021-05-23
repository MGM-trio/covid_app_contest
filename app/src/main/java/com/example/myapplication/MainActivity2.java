package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private String array_spinner[];

    EditText name, age, contact;
    RadioButton female, male;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name  = (EditText) findViewById(R.id.textInputEditText);
        age = (EditText) findViewById(R.id.AgeText);
        contact = (EditText) findViewById(R.id.contactText);
        female = (RadioButton) findViewById(R.id.radioButton);
        male = (RadioButton) findViewById(R.id.radioButton2);



        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });



    }
}