package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityHakkimizdaBinding;
import com.example.myapplication.databinding.ActivityHakkimizdaBinding;
import com.example.myapplication.databinding.ActivityMainBinding;

public class Hakkimizda extends AppCompatActivity {
    private ActivityHakkimizdaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHakkimizdaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Toast.makeText(Hakkimizda.this,"hakkımız bölümüne hoş geldiniz",Toast.LENGTH_LONG).show();

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dashboard.class);
                startActivity(intent);
            }
        });
    }
}