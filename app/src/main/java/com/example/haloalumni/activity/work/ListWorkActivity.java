package com.example.haloalumni.activity.work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.haloalumni.R;
import com.example.haloalumni.model.WorkItem;

import java.util.ArrayList;

public class ListWorkActivity extends AppCompatActivity implements View.OnClickListener {

    private View appbar;
    private ImageView ivBack;
    private TextView tvTitleAppBar;
    private ListView lvWork;

    private ArrayList<WorkItem> workItems;
    private WorkAdapter workAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_work);
        init();

        tvTitleAppBar.setText("Lowongan Pekerjaan");

        workItems = new ArrayList<WorkItem>();
        workItems.add(new WorkItem(R.drawable.work1, "Business Analyst Staff","PT PADA IDI","Jakarta Pusat","Rp.13.000.000","Rp.18.000.000"));
        workItems.add(new WorkItem(R.drawable.work1, "IT System Analyst","PT The Master Steel MFc","Jakarta Pusan","Rp.8.000.000","Rp.10.000.000"));
        workItems.add(new WorkItem(R.drawable.work1, "Administration & Accounts Assistant","CTC.COM.AU Pty Ltd","Jakarta Pusat","Rp.5.000.000","Rp.10.000.000"));

        workAdapter = new WorkAdapter(this, workItems);
        lvWork.setAdapter(workAdapter);

        ivBack.setOnClickListener(this);
    }

    private void init(){
        appbar = findViewById(R.id.appbar);
        ivBack = appbar.findViewById(R.id.ivBack);
        tvTitleAppBar = appbar.findViewById(R.id.tvTitleAppBar);
        lvWork = findViewById(R.id.lvWork);
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