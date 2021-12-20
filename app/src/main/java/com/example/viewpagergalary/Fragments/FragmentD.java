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

public class FragmentD extends Fragment {

    private RecyclerView recyclerView ;
    private ArrayList<String> list;
    private RecycleViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmant_d,container,false);

        recyclerView=view.findViewById(R.id.imd);
        loaddata();
        adapter=new RecycleViewAdapter(list,inflater.getContext());
        LinearLayoutManager layoutManager=new LinearLayoutManager(inflater.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



        return view;
    }
    public void loaddata(){
        list=new ArrayList<>();
        list.add("https://img3.goodfon.ru/wallpaper/nbig/1/80/seascape-sunset-beach-sand.jpg");
        list.add("https://sfwallpaper.com/images/sea-image-12.jpg");
        list.add("https://www.fonstola.ru/download.php?file=201604/1440x900/fonstola.ru-229437.jpg");
        list.add("https://www.fonstola.ru/download.php?file=201408/2560x1600/fonstola.ru-148044.jpg");
        list.add("https://proprikol.ru/wp-content/uploads/2019/10/krasivye-kartinki-okeana-16.jpg");
        list.add("https://s1.1zoom.ru/big0/448/356696-admin.jpg");
        list.add("https://w-dog.ru/wallpapers/9/19/379323357749247/bereg-pesok-okean-gorizont-nebo-oblaka-goluboj.jpg");
        list.add("https://hddesktopwallpapers.in/wp-content/uploads/2015/09/sea-images-hd.jpg");
        list.add("https://w-dog.ru/wallpapers/9/17/422459918751823/more-bereg-volny-plyazh-skaly-nebo-zakat.jpg");
    }
}
