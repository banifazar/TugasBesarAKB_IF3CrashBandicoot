package com.example.tugasbesarakbif3crashbandicoot.BotNav;
/*
    TANGGAL PENGERJAAN: 4 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119110 - BANI FAZA RASYADAN - IF3
*/
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.tugasbesarakbif3crashbandicoot.R;
import com.example.tugasbesarakbif3crashbandicoot.SplashScreenActivity;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LiburanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiburanFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LiburanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LiburanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LiburanFragment newInstance(String param1, String param2) {
        LiburanFragment fragment = new LiburanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//         Inflate the layout for this fragment
        View view =LayoutInflater.from(getContext()).inflate(R.layout.fragment_liburan, container, false);

        RecyclerView recyclerView =(RecyclerView) view.findViewById(R.id.recyclerViewList);
        new FireBaseHelper().readLiburan(new FireBaseHelper.DataStatus() {
            @Override
            public void dataIsLoaded(List<Liburan> listLiburan, List<String> keys) {
                new RecycleView_Config().setConfig(recyclerView, getContext(), listLiburan, keys);
            }

            @Override
            public void dataIsInserted() {

            }

            @Override
            public void dataIsUpdated() {

            }

            @Override
            public void dataIsDeleted() {

            }
        });
        return view;
    }
}