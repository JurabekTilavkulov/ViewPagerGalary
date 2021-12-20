package com.example.viewpagergalary.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpagergalary.Adapters.RecycleViewAdapter;
import com.example.viewpagergalary.R;

import java.util.ArrayList;

public class FragmentE extends Fragment {
    private RecyclerView recyclerView;
    private RecycleViewAdapter adapter;
    private ArrayList<String>list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmant_e,container,false);
        recyclerView=view.findViewById(R.id.ime);
        loaddata();
        adapter=new RecycleViewAdapter(list,inflater.getContext());
        LinearLayoutManager layoutManager=new LinearLayoutManager(inflater.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
    public  void loaddata(){
        list=new ArrayList<>();
        list.add("https://w-dog.ru/wallpapers/10/10/514646732457551/rossiya-les-derevya-eli-tajga-zelen.jpg");
        list.add("https://www.culture.ru/storage/images/bab1ddcc0713875c174b044b475d0fee/4b6b5bcdd71efa4e8e0242be42f3a9bb.jpeg");
        list.add("https://www.culture.ru/storage/images/b149b666059330b81b359f04af4c9c7c/828efa2944c6063b551cecdf43ed0a22.jpeg");
        list.add("https://w-dog.ru/wallpapers/2/99/547153149393024/derevya-les-priroda.jpg");
        list.add("https://zagadki-dlya-detej.ru/wp-content/uploads/2020/08/les.jpg");
        list.add("https://www.1zoom.ru/big2/43/182264-mavr.jpg");
        list.add("https://w-dog.ru/wallpapers/10/12/320337126535496/les-derevya-solnce-osen.jpg");
        list.add("https://on-desktop.com/wps/2018Nature_View_of_the_green_coniferous_forest_and_the_tops_of_the_mountains_in_the_rays_of_the_rising_sun_124903_.jpg");
        list.add("https://attuale.ru/wp-content/uploads/2018/11/002.jpg");

    }
}
