package com.example.haloalumni.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.haloalumni.R;

public class AuthActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        init();

        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    private void init() {
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);
    }

    @Override
    public void onClick(View v) {
        if (v == btnSignIn) {

            Intent intent = new Intent(this, SignInActivity.class);
            startActivity(intent);

        } else if (v == btnSignUp) {

            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);

        }
    }
}