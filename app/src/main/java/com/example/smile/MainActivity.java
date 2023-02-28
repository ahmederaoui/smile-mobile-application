package com.example.smile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5500;
    Animation topAnimation, bottomAnimation;
    TextView logo, copyRight;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        // animation
        topAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_animation);
        // hooks
        imageView = findViewById(R.id.imageView);
        logo = findViewById(R.id.smileApplication);
        copyRight = findViewById(R.id.textView2);

        imageView.setAnimation(topAnimation);
        logo.setAnimation(bottomAnimation);
        copyRight.setAnimation(bottomAnimation);
        // finishing the splashScreen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,FormActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}