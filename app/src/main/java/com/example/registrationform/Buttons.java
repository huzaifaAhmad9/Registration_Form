package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class Buttons extends AppCompatActivity {
    Button btn1,btn2;
    LottieAnimationView animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        animation = findViewById(R.id.animation);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        animation.setAnimation(R.raw.hello);
        animation.playAnimation();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Buttons.this,SignUp.class);
                startActivity(intent);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Buttons.this,SignIn.class);
                startActivity(intent);
            }
        });
    }
}