package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_form);
        String toastText="The application started";
        Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT).show();
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
    }

    public void envoyer(View v){
        Intent intent=new Intent(FormActivity.this,SmileActivity.class);
        Bundle bundle= new Bundle();
        bundle.putString("firstName",firstName.getText().toString());
        bundle.putString("lastName",lastName.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}