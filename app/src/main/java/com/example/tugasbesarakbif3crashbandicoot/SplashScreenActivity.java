package com.example.tugasbesarakbif3crashbandicoot;
/*
    TANGGAL PENGERJAAN: 3 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119110 - BANI FAZA RASYADAN - IF3
                         2. 10119105 - RYNDRA PUTRA P.F. - IF3
*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.tugasbesarakbif3crashbandicoot.ViewPager.ViewPagerActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, ViewPagerActivity.class));
                finish();
            }
        }, 3000);
    }
}