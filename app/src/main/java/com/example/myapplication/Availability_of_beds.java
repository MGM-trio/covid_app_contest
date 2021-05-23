package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Availability_of_beds extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availability_of_beds);

            ImageButton button = (ImageButton) findViewById(R.id.imageButton);

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://tncovidbeds.tnega.org/"));
                    startActivity(viewIntent);
                }
            });

            ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);

            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent1 =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("http://dashboard.covid19.ap.gov.in/ims/hospbed_reports/"));
                    startActivity(viewIntent1);
                }
            });

            ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);

            button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent2 =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://covid19jagratha.kerala.nic.in/home/addHospitalDashBoard"));
                    startActivity(viewIntent2);
                }
            });
            ImageButton button4 = (ImageButton) findViewById(R.id.imageButton5);

            button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent3 =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://covid19.karnataka.gov.in/new-page/Designated%20Covid-19%20Hospitals/en"));
                    startActivity(viewIntent3);
                }
            });
            ImageButton button5 = (ImageButton) findViewById(R.id.imageButton7);

            button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0) {
                    Intent viewIntent4 =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://covidtelangana.com/"));
                    startActivity(viewIntent4);
                }
            });



    }
}