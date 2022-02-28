package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityIletisimbilgiBinding;
import com.example.myapplication.databinding.ActivityMisyonvizyonBinding;

public class misyonvizyon extends AppCompatActivity {
    private ActivityMisyonvizyonBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMisyonvizyonBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dashboard.class);
                startActivity(intent);
            }
        });

    }
}