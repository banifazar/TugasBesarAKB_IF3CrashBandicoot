package com.example.tugasbesarakbif3crashbandicoot;
/*
    TANGGAL PENGERJAAN: 3 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119088 - LAURENTIUS BRYAN H. - IF3
                         2. 10119126 - DICKY SETIADI - IF3
                         3. 10119099 - SANDI KOMARA - IF3
*/
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugasbesarakbif3crashbandicoot.BotNav.LiburanFragment;
import com.example.tugasbesarakbif3crashbandicoot.BotNav.ProfilFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.botnav);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                new LiburanFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.liburan:
                        selectedFragment = new LiburanFragment();
                        break;
                    case R.id.profile:
                        selectedFragment = new ProfilFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                        selectedFragment).commit();

                return true;
            }
        });
    }
}