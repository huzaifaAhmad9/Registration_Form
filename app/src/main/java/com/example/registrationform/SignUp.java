package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class SignUp extends AppCompatActivity {
    LottieAnimationView animation;
    EditText username,pass,confpass,email;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        animation = findViewById(R.id.animation);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        confpass = findViewById(R.id.confpass);
        btn = findViewById(R.id.btn);

        animation.setAnimation(R.raw.signup);
        animation.playAnimation();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "You Have Successfully Signed Up!!!", Toast.LENGTH_LONG).show();
            }
        });


    }
}