package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        String toastText="The application started";
        Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT).show();
    }
}