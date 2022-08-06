package com.example.tugasbesarakbif3crashbandicoot.ViewPager;
/*
    TANGGAL PENGERJAAN: 3 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119099 - SANDI KOMARA - IF3
*/
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tugasbesarakbif3crashbandicoot.MainActivity;
import com.example.tugasbesarakbif3crashbandicoot.R;

public class ViewPagerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ViewPager viewPager;
        ViewPagerAdapter viewPagerAdapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
    }
    public void onClick(View view){
        Intent intent = new Intent(ViewPagerActivity.this, MainActivity.class);
        startActivity(intent);
    }
    }
