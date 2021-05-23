package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vac_centres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vac_centres);

        ImageButton button20 = (ImageButton) findViewById(R.id.imageButton11);

        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent1 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://stopcorona.tn.gov.in/vaccine_center.php"));
                startActivity(viewIntent1);
            }
        });

        ImageButton button21 = (ImageButton) findViewById(R.id.imageButton12);

        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent1 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://dashboard.covid19.ap.gov.in/ims/covidvaccine_centers/"));
                startActivity(viewIntent1);
            }
        });

        ImageButton button22 = (ImageButton) findViewById(R.id.imageButton13);

        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent1 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://dhs.kerala.gov.in/wp-content/uploads/2021/03/CGHS_list.pdf"));
                startActivity(viewIntent1);
            }
        });

        ImageButton button23 = (ImageButton) findViewById(R.id.imageButton14);

        button23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent1 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://covid19.karnataka.gov.in/storage/pdf-files/COVID-VAC-CENTRES/BELAGAVI.pdf\n"));
                startActivity(viewIntent1);
            }
        });

        ImageButton button24 = (ImageButton) findViewById(R.id.imageButton15);

        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent1 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.ghmc.gov.in/announcements/List%20of%20Vaccine%20Centers.pdf"));
                startActivity(viewIntent1);
            }
        });


    }


}