package com.example.haloalumni.activity.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.haloalumni.R;
import com.example.haloalumni.activity.work.WorkAdapter;
import com.example.haloalumni.model.ChatItem;
import com.example.haloalumni.model.WorkItem;

import java.util.ArrayList;

public class ListChatActivity extends AppCompatActivity implements View.OnClickListener {

    private View appbar;
    private ImageView ivBack;
    private TextView tvTitleAppBar;
    private ListView lvChat;

    private ArrayList<ChatItem> chatItems;
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chat);
        init();

        tvTitleAppBar.setText("Forum Chat");

        chatItems = new ArrayList<ChatItem>();
        chatItems.add(new ChatItem(R.drawable.imgchat1,"KIP Bahasa leting 2014"));
        chatItems.add(new ChatItem(R.drawable.imgchat2,"Informatika leting 2018"));
        chatItems.add(new ChatItem(R.drawable.imgchat3,"KIP Biologi 2016"));

        chatAdapter = new ChatAdapter(this, chatItems);
        lvChat.setAdapter(chatAdapter);

        ivBack.setOnClickListener(this);
    }

    private void init(){
        appbar = findViewById(R.id.appbar);
        ivBack = appbar.findViewById(R.id.ivBack);
        tvTitleAppBar = appbar.findViewById(R.id.tvTitleAppBar);
        lvChat = findViewById(R.id.lvChat);
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