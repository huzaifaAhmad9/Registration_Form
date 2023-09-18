package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class SignIn extends AppCompatActivity {
    LottieAnimationView animation;
    EditText pass,email;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = findViewById(R.id.email);
        animation = findViewById(R.id.animation);
        pass = findViewById(R.id.pass);
        btn = findViewById(R.id.btn);

        animation.setAnimation(R.raw.login_in);
        animation.playAnimation();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e = email.getText().toString();
                String p =pass.getText().toString();

                if (e.equals("admin") && p.equals("admin")){
                    Toast.makeText(SignIn.this, "Login Successfull", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(SignIn.this, "Invalid Credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}