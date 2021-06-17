package com.example.haloalumni.activity.chat;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.haloalumni.R;
import com.example.haloalumni.model.ChatItem;

import java.util.ArrayList;

public class ChatAdapter extends ArrayAdapter<ChatItem>  {

    public ChatAdapter(Activity activity, ArrayList<ChatItem> workItems) {
        super(activity, 0, workItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.chat_item, parent, false);
        }

        ChatItem chatItem = getItem(position);

        ImageView ivChat = view.findViewById(R.id.ivChat);
        TextView tvSubject = view.findViewById(R.id.tvSubject);
        TextView tvJoin = view.findViewById(R.id.tvJoin);

        ivChat.setImageResource(chatItem.getImage());
        tvSubject.setText(chatItem.getSubject());
        tvJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }
}
