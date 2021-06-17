package com.example.haloalumni.model;

public class ChatItem {

    int image;
    String subject;

    public ChatItem(int image, String subject) {
        this.image = image;
        this.subject = subject;
    }

    public int getImage() {
        return image;
    }

    public String getSubject() {
        return subject;
    }
}
