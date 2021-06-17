package com.example.haloalumni.activity.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haloalumni.R;
import com.example.haloalumni.model.NewsItem;

public class DetailNewsActivity extends AppCompatActivity implements View.OnClickListener {

    private View appbar;
    private ImageView ivBack, ivImage;
    private TextView tvTitleAppBar, tvTitle, tvNews, tvNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);
        init();

        tvTitleAppBar.setText("Detail Berita Terkait");

        if (getIntent() != null) {
            int image = getIntent().getIntExtra("image", 0);
            String title = getIntent().getStringExtra("title");
            String news = getIntent().getStringExtra("news");

            ivImage.setImageResource(image);
            tvTitle.setText(title);
            tvNews.setText(news);
        }

        ivBack.setOnClickListener(this);
    }

    private void init() {
        appbar = findViewById(R.id.appbar);
        ivBack = appbar.findViewById(R.id.ivBack);
        tvTitleAppBar = appbar.findViewById(R.id.tvTitleAppBar);

        ivImage = findViewById(R.id.ivImage);
        tvTitle = findViewById(R.id.tvTitle);
        tvNews = findViewById(R.id.tvNews);
        tvNext = findViewById(R.id.tvNext);
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