package com.example.haloalumni.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haloalumni.R;
import com.google.android.material.textfield.TextInputLayout;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    private View appbar;
    private ImageView ivBack;
    private TextView tvTitleAppBar;
    private TextInputLayout tilEmail, tilPassword;
    private Button btnSignIn, btnFacebook, btnGmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        init();

        ivBack.setVisibility(View.GONE);
        tvTitleAppBar.setText("Masuk ke Halo Alumni");

        btnSignIn.setOnClickListener(this);
    }

    private void init() {
        appbar = findViewById(R.id.appbar);
        ivBack = appbar.findViewById(R.id.ivBack);
        tvTitleAppBar = appbar.findViewById(R.id.tvTitleAppBar);

        tilEmail = findViewById(R.id.tilEmail);
        tilPassword = findViewById(R.id.tilPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnFacebook = findViewById(R.id.btnFacebook);
        btnGmail = findViewById(R.id.btnGmail);
    }

    @Override
    public void onClick(View v) {
        if (v == btnSignIn) {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }
}