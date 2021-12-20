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

public class FragmentC extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<String>list;
    private RecycleViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmant_c,container,false);
        recyclerView=view.findViewById(R.id.imc);
        loaddata();
        adapter=new RecycleViewAdapter(list,inflater.getContext());
        LinearLayoutManager layoutManager=new LinearLayoutManager(inflater.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }
    public  void  loaddata(){
        list=new ArrayList<>();
        list.add("https://wallpaperboat.com/wp-content/uploads/2020/10/28/58431/desert-14.jpg");
        list.add("https://www.serenityreflections.com/wp-content/uploads/2016/03/desert-image.jpg");
        list.add("https://w-dog.ru/wallpapers/10/13/438740707348992/pustynya-rub-al-chali-pustynya-sledy-pesok.jpg");
        list.add("https://static.vecteezy.com/system/resources/previews/001/308/655/original/grass-on-the-sahara-desert-free-photo.jpeg");
        list.add("https://i1.wallbox.ru/wallpapers/main/201129/pustynya-pesok-nebo-5dba69e.jpg");
        list.add("https://proprikol.ru/wp-content/uploads/2019/12/pustynya-krasivye-kartinki-na-rabochij-stol-8.jpg");
    }
}
