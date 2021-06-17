package com.example.haloalumni.model;

public class NewsItem {

    int image;
    String title, news;

    public NewsItem(int image, String title, String news) {
        this.image = image;
        this.title = title;
        this.news = news;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getNews() {
        return news;
    }
}
