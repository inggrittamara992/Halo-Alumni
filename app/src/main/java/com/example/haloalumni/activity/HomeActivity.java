package com.example.haloalumni.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.haloalumni.R;
import com.example.haloalumni.fragment.HomeFragment;
import com.example.haloalumni.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private final FragmentManager fm = getSupportFragmentManager();
    private BottomNavigationView bottomNavigationView;
    private final Fragment fragHome = new HomeFragment();
    private final Fragment fragProfile = new ProfileFragment();
    private Fragment fragActive = fragHome;

    private int page=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        pagination();
    }

    private void init() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.home_menu:

                    page = 1;
                    pagination();
                    return true;

                case R.id.profile_menu:

                    page = 2;
                    pagination();
                    return true;
            }

            return false;
        }
    };

    private void pagination() {
        if (page == 1) {

            if (fm.findFragmentByTag("fragHome") != null) {
                fm.beginTransaction().hide(fragActive).show(fragHome).commit();
            } else {
                fm.beginTransaction().hide(fragActive).show(fragHome).commit();
                fm.beginTransaction().add(R.id.flContainer, fragHome, "fragHome").commit();
            }

            fragActive = fragHome;
            bottomNavigationView.getMenu().getItem(0).setChecked(true);

        } else if (page == 2) {

            if (fm.findFragmentByTag("fragProfile") != null) {
                fm.beginTransaction().hide(fragActive).show(fragProfile).commit();
            } else {
                fm.beginTransaction().hide(fragActive).show(fragProfile).commit();
                fm.beginTransaction().add(R.id.flContainer, fragProfile, "fragProfile").commit();
            }

            fragActive = fragProfile;
            bottomNavigationView.getMenu().getItem(1).setChecked(true);

        }

    }


}