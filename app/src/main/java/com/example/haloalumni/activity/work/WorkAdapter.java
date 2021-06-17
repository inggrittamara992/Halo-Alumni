package com.example.haloalumni.activity.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.haloalumni.R;
import com.example.haloalumni.model.WorkItem;

import java.io.Serializable;
import java.util.ArrayList;

public class WorkAdapter extends ArrayAdapter<WorkItem> {

    private Activity activity;

    public WorkAdapter(Activity activity, ArrayList<WorkItem> workItems) {
        super(activity, 0, workItems);
        this.activity = activity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.work_item, parent, false);
        }

        WorkItem workItem = getItem(position);

        TextView tvPosition = view.findViewById(R.id.tvPosition);
        TextView tvOffice = view.findViewById(R.id.tvOffice);

        tvPosition.setText(workItem.getPosition());
        tvOffice.setText(workItem.getOffice());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, WorkDetailActivity.class);
                intent.putExtra("image", workItem.getImage());
                intent.putExtra("position", workItem.getPosition());
                intent.putExtra("office", workItem.getOffice());
                intent.putExtra("address", workItem.getAddress());
                intent.putExtra("minSallary", workItem.getMinSallary());
                intent.putExtra("maxSallary", workItem.getMaxSallary());
                activity.startActivity(intent);
            }
        });

        return view;
    }
}
