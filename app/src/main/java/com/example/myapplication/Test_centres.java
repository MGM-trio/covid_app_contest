package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Test_centres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_centres);

        ImageButton button10 = (ImageButton) findViewById(R.id.imageButton4);

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent4 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://stopcorona.tn.gov.in/sample_collection_center.php"));
                startActivity(viewIntent4);
            }
        });

        ImageButton button11 = (ImageButton) findViewById(R.id.imageButton6);

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent4 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://vizianagaram.ap.gov.in/covid-testing-collection-centres/"));
                startActivity(viewIntent4);
            }
        });

        ImageButton button12 = (ImageButton) findViewById(R.id.imageButton8);

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent4 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://dhs.kerala.gov.in/wp-content/uploads/2020/10/LIST-OF-PRIVATE-TESTING-LABS-IN-KERALA-FOR-COVID-19-AS-ON-OCTOBER-22.pdf"));
                startActivity(viewIntent4);
            }
        });

        ImageButton button13 = (ImageButton) findViewById(R.id.imageButton9);

        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent4 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://covid19.karnataka.gov.in/page/Testing+Centers/COVID+Testing+Centers/en"));
                startActivity(viewIntent4);
            }
        });

        ImageButton button14 = (ImageButton) findViewById(R.id.imageButton10);

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent4 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://covid19.telangana.gov.in/health-facilities/testing-centres/\n"));
                startActivity(viewIntent4);
            }
        });




    }
}