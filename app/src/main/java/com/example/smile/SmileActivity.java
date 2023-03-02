package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class SmileActivity extends AppCompatActivity {
    private TextView message;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_smile);
        Bundle b = getIntent().getExtras();
        String firstName = b.getString("firstName");
        String lastName = b.getString("lastName");
        message = findViewById(R.id.textMessage);
        String hey = getString(R.string.hi);
        String sentence=getString(R.string.mes);
        message.setText(hey+firstName+" "+lastName+sentence);
    }
    public void retour(View view){
        Intent intent = new Intent(SmileActivity.this,FormActivity.class);
        startActivity(intent);
        finish();
    }
}