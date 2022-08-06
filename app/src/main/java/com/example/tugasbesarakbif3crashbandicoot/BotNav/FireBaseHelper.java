package com.example.tugasbesarakbif3crashbandicoot.BotNav;
/*
    TANGGAL PENGERJAAN: 4 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119088 - LAURENTIUS BRYAN H. - IF3
                         2. 10119126 - DICKY SETIADI - IF3
                         3. 10119099 - SANDI KOMARA - IF3
                         4. 10119110 - BANI FAZA RASYADAN - IF3
                         5. 10119105 - RYNDRA PUTRA P.F. - IF3
*/
import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FireBaseHelper {
    private FirebaseDatabase fireBaseDatabase;
    private DatabaseReference databaseReference;
    List<Liburan> listLiburan = new ArrayList<Liburan>();

    public interface DataStatus{
        void dataIsLoaded(List<Liburan> listLiburan, List<String> keys);
        void dataIsInserted();
        void dataIsUpdated();
        void dataIsDeleted();
    }


    public FireBaseHelper() {
        fireBaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = fireBaseDatabase.getReference("liburan");
    }

    public void readLiburan(final DataStatus dataStatus){
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listLiburan.clear();
                List<String> keys = new ArrayList<String>();
                for (DataSnapshot keyNode: snapshot.getChildren()) {
                    keys.add(keyNode.getKey());
                    Liburan liburan = keyNode.getValue(Liburan.class);
                    listLiburan.add(liburan);
                }
                dataStatus.dataIsLoaded(listLiburan, keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}