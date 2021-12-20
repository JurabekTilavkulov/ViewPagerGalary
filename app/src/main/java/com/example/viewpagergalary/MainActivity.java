package com.example.viewpagergalary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpagergalary.Adapters.MyAdapter;
import com.example.viewpagergalary.Fragments.FragmentA;
import com.example.viewpagergalary.Fragments.FragmentB;
import com.example.viewpagergalary.Fragments.FragmentC;
import com.example.viewpagergalary.Fragments.FragmentD;
import com.example.viewpagergalary.Fragments.FragmentE;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Fragment> list=new ArrayList<>();
        list.add(new FragmentA());
        list.add(new FragmentB());
        list.add(new FragmentC());
        list.add(new FragmentD());
        list.add(new FragmentE());

        viewPager=findViewById(R.id.vp);
        adapter=new MyAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
    }
}