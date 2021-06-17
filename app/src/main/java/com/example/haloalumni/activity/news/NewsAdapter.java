package com.example.haloalumni.activity.news;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.haloalumni.R;
import com.example.haloalumni.model.NewsItem;

import java.io.Serializable;
import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsItem> {

    private Activity activity;

    public NewsAdapter(Activity activity, ArrayList<NewsItem> newsItems) {
        super(activity, 0, newsItems);
        this.activity = activity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.news_item, parent, false);
        }

        NewsItem newsItem = getItem(position);

        TextView tvNews = view.findViewById(R.id.tvNews);

        tvNews.setText(newsItem.getNews());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, DetailNewsActivity.class);
                intent.putExtra("image", newsItem.getImage());
                intent.putExtra("title", newsItem.getTitle());
                intent.putExtra("news", newsItem.getNews());
                activity.startActivity(intent);
            }
        });

        return view;
    }
}
