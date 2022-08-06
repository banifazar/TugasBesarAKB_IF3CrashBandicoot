package com.example.tugasbesarakbif3crashbandicoot.ViewPager;
/*
    TANGGAL PENGERJAAN: 3 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119088 - LAURENTIUS BRYAN H. - IF3
*/
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.tugasbesarakbif3crashbandicoot.R;

public class ViewPagerAdapter extends PagerAdapter {
    Context ctx;

    public ViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.view_pager_screen, container, false);

        ImageView logo = view.findViewById(R.id.logo);
        ImageView dot1 = view.findViewById(R.id.dot1);
        ImageView dot2 = view.findViewById(R.id.dot2);

        TextView judul = view.findViewById(R.id.judul);
        TextView deskripsi = view.findViewById(R.id.deskripsi);

        Button selesai = view.findViewById(R.id.btn_selesai);


        switch (position) {
            case 0:
                logo.setImageResource(R.drawable.welcome);
                dot1.setImageResource(R.drawable.dot_select);
                dot2.setImageResource(R.drawable.dot_unselect);

                deskripsi.setText("Geser layar untuk informasi aplikasi.");

                selesai.setVisibility(view.GONE);


                break;
            case 1:
                logo.setImageResource(R.drawable.operation);
                dot1.setImageResource(R.drawable.dot_unselect);
                dot2.setImageResource(R.drawable.dot_select);

                judul.setText("Informasi Aplikasi");
                deskripsi.setText("Pada aplikasi ini terdapat menu untuk menampilkan lokasi wisata favorit di Bandung Raya");

                selesai.setVisibility(view.VISIBLE);

                break;

        }

        container.addView(view);
        return view;
    }
}