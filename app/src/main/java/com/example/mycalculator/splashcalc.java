package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splashcalc extends AppCompatActivity {
 TextView txtabove , txtdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashcalc);
        txtabove = findViewById(R.id.txtabove);
        txtdown = findViewById(R.id.txtdown);
        Animation animation =AnimationUtils.loadAnimation(this,R.anim.scale);
        Animation anm2 = AnimationUtils.loadAnimation(this,R.anim.loop);
        txtabove.setAnimation(animation);
        txtdown.setAnimation(anm2);


        Intent home = new Intent(splashcalc.this, MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish();
            }
        },3000);
    }
}