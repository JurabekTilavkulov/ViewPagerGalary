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

public class FragmentB extends Fragment {

    private RecycleViewAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<String>list;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmant_b,container,false);
        recyclerView = view.findViewById(R.id.imb);
        loaddata();
        adapter=new RecycleViewAdapter(list,inflater.getContext());
        LinearLayoutManager layoutManager=new LinearLayoutManager(inflater.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);



        return view;
    }
    public  void loaddata(){
        list=new ArrayList<>();
        list.add("https://www.wallpaperflare.com/static/957/597/115/torrent-white-water-force-nature-wallpaper.jpg");
        list.add("https://proprikol.ru/wp-content/uploads/2020/12/reki-krasivye-kartinki-25.jpg");
        list.add("https://proprikol.ru/wp-content/uploads/2020/12/reki-krasivye-kartinki-6.jpg");
        list.add("https://picfiles.alphacoders.com/318/318532.jpg");
        list.add("https://mobimg.b-cdn.net/v3/fetch/f0/f0d9ab6e26602cbfac31fcb4f3ea6d2e.jpeg");
        list.add("https://s1.1zoom.ru/b5050/370/332837-svetik_2880x1800.jpg");
        list.add("https://www.fonstola.ru/download.php?file=201309/1400x1050/fonstola.ru-115454.jpg");
        list.add("https://picfiles.alphacoders.com/279/279578.jpg");
        list.add("https://proprikol.ru/wp-content/uploads/2020/12/reki-krasivye-kartinki-24.jpg");
        list.add("https://img.fonwall.ru/o/s2/polya-reka-derevya-peyzazh.jpg?route=mid&amp;h=750");
        list.add("https://img.fonwall.ru/o/s2/polya-reka-derevya-peyzazh.jpg?route=mid&amp;h=750");
    }
}
