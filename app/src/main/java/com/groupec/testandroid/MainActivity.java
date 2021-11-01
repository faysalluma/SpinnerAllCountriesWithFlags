package com.groupec.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountryCodePicker ccp = (CountryCodePicker) findViewById(R.id.ccp);
        Button read = (Button) findViewById(R.id.read);

        read.setOnClickListener(view -> {
            Toast.makeText(this, ccp.getSelectedCountryName()+ccp.getSelectedCountryCode(), Toast.LENGTH_LONG).show();
        });
    }
}