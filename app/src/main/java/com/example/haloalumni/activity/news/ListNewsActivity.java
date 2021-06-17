package com.example.haloalumni.activity.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.haloalumni.R;
import com.example.haloalumni.activity.work.WorkAdapter;
import com.example.haloalumni.model.NewsItem;
import com.example.haloalumni.model.WorkItem;

import java.util.ArrayList;

public class ListNewsActivity extends AppCompatActivity implements View.OnClickListener {

    private View appbar;
    private ImageView ivBack;
    private TextView tvTitleAppBar;
    private ListView lvNews;

    private ArrayList<NewsItem> newsItems;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_news);
        init();

        tvTitleAppBar.setText("Berita Terkait");

        newsItems = new ArrayList<NewsItem>();
        newsItems.add(new NewsItem(R.drawable.school ,"Sebanyak 1.927 Peserta Lulus SNMPTN 2021","Sebanyak 1.927 peserta Seleksi Nasional Masuk Perguruan Tinggi Negeri (SNMPTN) dinyatakan lulus di Universitas Syiah Kuala (USK), Banda Aceh, Aceh. Jumlah tersebut berdasarkan hasil seleksi SNMPTN yang mendaftar di USK tahun 2021. Rektor USK Prof. Samsul Rizal mengatakan, informasi kelulusan jalur SNMPTN telah diumumkan oleh Lembaga Tes Masuk Perguruan Tinggi (LTMPT) pada hari Senin (22/3) pukul 15.00 WIB, melalui laman LTMPT dan 28 laman mirror PTN. Untuk USK, informasi kelulusan SNMPTN 2021 juga dapat diakses melalui laman https://snmptn.unsyiah.ac.id. Samsul menyebutkan, secara keseluruhan jumlah pendaftar SNMPTN untuk provinsi Aceh tahun ini berjumlah 15.290 orang. Dari jumlah tersebut, sebanyak 36,8 persen atau 5.626 orang berhasil lulus SNMPTN pada berbagai perguruan tinggi di Aceh."));
        newsItems.add(new NewsItem(R.drawable.school, "Hasil SNMPTN 2021 Unsyiah Banda Aceh dan Cara Cek Pengumuman Lolos", "Hasil SNMPTN 2021 Unsyiah Banda Aceh dan Cara Cek Pengumuman Lolos"));
        newsItems.add(new NewsItem(R.drawable.school, "Kabar Pengukuhan Guru Besar di Unviersitas Erlangga dan Universitas Syiah Kuala","Kabar Pengukuhan Guru Besar di Unviersitas Erlangga dan Universitas Syiah Kuala"));

        newsAdapter = new NewsAdapter(this, newsItems);
        lvNews.setAdapter(newsAdapter);

        ivBack.setOnClickListener(this);
    }

    private void init(){
        appbar = findViewById(R.id.appbar);
        ivBack = appbar.findViewById(R.id.ivBack);
        tvTitleAppBar = appbar.findViewById(R.id.tvTitleAppBar);
        lvNews = findViewById(R.id.lvNews);
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