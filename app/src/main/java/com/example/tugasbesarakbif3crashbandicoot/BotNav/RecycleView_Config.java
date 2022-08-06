package com.example.tugasbesarakbif3crashbandicoot.BotNav;
/*
    TANGGAL PENGERJAAN: 4 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119088 - LAURENTIUS BRYAN H. - IF3
                         2. 10119126 - DICKY SETIADI - IF3
                         3. 10119099 - SANDI KOMARA - IF3
                         4. 10119110 - BANI FAZA RASYADAN - IF3
                         5. 10119105 - RYNDRA PUTRA P.F. - IF3
*/
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasbesarakbif3crashbandicoot.R;

import java.util.List;

public class RecycleView_Config {
    private Context mcontext;
    private LiburanAdapter liburanAdapter;
    public void setConfig(RecyclerView recyclerView, Context context, List<Liburan> listLiburan, List<String> keys){
        mcontext = context;
        liburanAdapter = new LiburanAdapter(listLiburan, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(liburanAdapter);
    }

    class LiburanItemView extends RecyclerView.ViewHolder {

        private TextView txtNama;
        private TextView txtTempat;
        private TextView txtLongitude;
        private TextView txtLatitude;

        private String key;

        public LiburanItemView(ViewGroup parent) {
            super(LayoutInflater.from(mcontext).inflate(R.layout.liburan_list_item, parent, false));
            txtNama = (TextView) itemView.findViewById(R.id.nama_txtView);
            txtTempat = (TextView) itemView.findViewById(R.id.tempat_textView);
            txtLongitude = (TextView) itemView.findViewById(R.id.longitude_txtView);
            txtLatitude = (TextView) itemView.findViewById(R.id.latitude_txtView);

        }

        public void bind(Liburan liburan, String key){
            txtNama.setText(liburan.getNama());
            txtTempat.setText(liburan.getTempat());
            txtLongitude.setText(liburan.getLongitude());
            txtLatitude.setText(liburan.getLatitude());
            this.key = key;
        }
    }
    class LiburanAdapter extends RecyclerView.Adapter<LiburanItemView>{
        private List<Liburan> listLiburan;
        private List<String> keys;

        public LiburanAdapter(List<Liburan> listLiburan, List<String> keys) {
            this.listLiburan = listLiburan;
            this.keys = keys;
        }

        @NonNull
        @Override
        public LiburanItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new LiburanItemView(parent) ;
        }

        @Override
        public void onBindViewHolder(@NonNull LiburanItemView holder, int position) {
            holder.bind(listLiburan.get(position), keys.get(position));
        }

        @Override
        public int getItemCount() {
            return listLiburan.size();
        }
    }
}
