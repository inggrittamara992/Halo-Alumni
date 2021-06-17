package com.example.haloalumni.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.haloalumni.R;
import com.example.haloalumni.activity.chat.ListChatActivity;
import com.example.haloalumni.activity.news.ListNewsActivity;
import com.example.haloalumni.activity.work.ListWorkActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private LinearLayout llWork, llNews, llChat;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        init(view);

        llWork.setOnClickListener(this);
        llNews.setOnClickListener(this);
        llChat.setOnClickListener(this);

        return view;
    }

    private void init(View view) {
        llWork = view.findViewById(R.id.llWork);
        llNews = view.findViewById(R.id.llNews);
        llChat = view.findViewById(R.id.llChat);
    }

    @Override
    public void onClick(View v) {
        if (v == llWork) {

            Intent intent = new Intent(getActivity(), ListWorkActivity.class);
            startActivity(intent);

        } else if (v == llNews) {

            Intent intent = new Intent(getActivity(), ListNewsActivity.class);
            startActivity(intent);

        } else if (v == llChat) {

            Intent intent = new Intent(getActivity(), ListChatActivity.class);
            startActivity(intent);

        }
    }
}