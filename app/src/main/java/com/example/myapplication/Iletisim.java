package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityIletisimBinding;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class Iletisim extends AppCompatActivity {
    private ActivityIletisimBinding binding;

    ArrayList <ıletısımler> ıletısımlerArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIletisimBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dashboard.class);
                startActivity(intent);
            }
        });
        ıletısımlerArrayList= new ArrayList<>();


        // ulaşım bilgileri burada giriliyor
        ıletısımler ali =new ıletısımler("Mehmet Ali Ürün","urun.mehmet@metu.edu.tr","engineer", "5459327973",R.drawable.ali);
        ıletısımler mertsemiz =new ıletısımler("Mert Semiz","mert.semiz@metu.edu.tr","engineer", "5374045914",R.drawable.mertsemiz);
        ıletısımler mert =new ıletısımler("Mert Pıçakcı","mert.picakci@metu.edu.tr","engineer", "5445362859",R.drawable.mert);
        ıletısımler utku =new ıletısımler("Utku Kepir","kepir.utku@metu.edu.tr","engineer", "05365472296",R.drawable.utku);
        ıletısımler gokcer =new ıletısımler("Gökçer Sönmezocak","gokcer.sonmezocak@metu.edu.tr","engineer", "5380508386",R.drawable.gokcer);

        ıletısımlerArrayList.add(ali);
        ıletısımlerArrayList.add(mertsemiz);
        ıletısımlerArrayList.add(mert);
        ıletısımlerArrayList.add(utku);
        ıletısımlerArrayList.add(gokcer);



        binding.RecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        ıletısımlerAdapter ıletısımlerAdapter =new ıletısımlerAdapter(ıletısımlerArrayList);
        binding.RecyclerView.setAdapter(ıletısımlerAdapter);









    }

}