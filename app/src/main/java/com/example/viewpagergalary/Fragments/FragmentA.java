package com.example.viewpagergalary.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewpagergalary.Adapters.RecycleViewAdapter;
import com.example.viewpagergalary.R;

import java.util.ArrayList;

public class FragmentA  extends Fragment {

   private ArrayList<String> list;
   private RecycleViewAdapter adapter;



    private RecyclerView layout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmant_a,container,false);

        layout=view.findViewById(R.id.ima);
        loaddata();
        adapter=new RecycleViewAdapter(list,inflater.getContext());

        LinearLayoutManager layoutManager=new LinearLayoutManager(inflater.getContext());
        layout.setLayoutManager(layoutManager);
        layout.setAdapter(adapter);



        return view;
    }
    public  void loaddata(){
        list=new ArrayList<>();
        list.add("https://wallbox.ru/wallpapers/main/201238/priroda-80537d81a2b7.jpg");
        list.add("https://w-dog.ru/wallpapers/9/7/429341253522326/gory-sneg-pejzazh-dolina.jpg");
        list.add("https://i.artfile.ru/2048x1570_704033_[www.ArtFile.ru].jpg");
        list.add("https://i.pinimg.com/736x/68/fd/b8/68fdb836daf0a2284e2a9c73df31771a.jpg");
        list.add("https://wallup.net/wp-content/uploads/2016/02/186037-mountain-nature.jpg");
        list.add("https://cdn.britannica.com/21/102121-050-DCA84B12/Mountains-Glacier-National-Park-Montana.jpg");
        list.add("https://www.wallpaperflare.com/static/199/738/538/mountains-clouds-forest-field-wallpaper.jpg");
    }
}
