package com.example.haloalumni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.haloalumni.activity.AuthActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnVisit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnVisit.setOnClickListener(this);
    }

    private void init() {
        btnVisit = findViewById(R.id.btnVisit);
    }

    @Override
    public void onClick(View v) {
        if (v == btnVisit) {
            Intent intent = new Intent(this, AuthActivity.class);
            startActivity(intent);
            finish();
        }
    }
}