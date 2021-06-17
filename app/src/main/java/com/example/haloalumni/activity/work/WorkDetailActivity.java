package com.example.haloalumni.activity.work;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haloalumni.R;
import com.example.haloalumni.model.WorkItem;

public class WorkDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private View appbar;
    private ImageView ivBack, ivImage;
    private TextView tvTitleAppBar, tvPosition, tvOffice, tvLocation, tvSallary;
    private Button btnDescWork, btnApplyJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_detail);
        init();

        tvTitleAppBar.setText("Detail Lowongan Pekerjaan");

        if (getIntent() != null) {
            int image = getIntent().getIntExtra("image", 0);
            String position = getIntent().getStringExtra("position");
            String office = getIntent().getStringExtra("office");
            String address = getIntent().getStringExtra("address");
            String minSallary = getIntent().getStringExtra("minSallary");
            String maxSallary = getIntent().getStringExtra("maxSallary");

            ivImage.setImageResource(image);
            tvPosition.setText(position);
            tvOffice.setText(office);
            tvLocation.setText(address);
            tvSallary.setText(minSallary+" - "+maxSallary);
        }

        ivBack.setOnClickListener(this);
    }

    private void init() {
        appbar = findViewById(R.id.appbar);
        ivBack = appbar.findViewById(R.id.ivBack);
        tvTitleAppBar = appbar.findViewById(R.id.tvTitleAppBar);

        ivImage = findViewById(R.id.ivImage);
        tvPosition = findViewById(R.id.tvPosition);
        tvOffice = findViewById(R.id.tvOffice);
        tvLocation = findViewById(R.id.tvLocation);
        tvSallary = findViewById(R.id.tvSallary);
        btnDescWork = findViewById(R.id.btnDescWork);
        btnApplyJob = findViewById(R.id.btnApplyJob);
    }

    @Override
    public void onClick(View v) {
        if (v == ivBack) {
            onBackPressed();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}