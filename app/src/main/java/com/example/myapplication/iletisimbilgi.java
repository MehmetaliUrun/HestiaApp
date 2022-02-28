package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityIletisimbilgiBinding;
import com.example.myapplication.databinding.ActivityHakkimizdaBinding;
import com.example.myapplication.databinding.ActivityIletisimbilgiBinding;
import com.example.myapplication.databinding.ActivityMainBinding;

public class iletisimbilgi extends AppCompatActivity {
    private ActivityIletisimbilgiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIletisimbilgiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Iletisim.class);
                startActivity(intent);
            }
        });

        Intent intent =getIntent();

        ıletısımler selectedıletısımler= (ıletısımler)  intent.getSerializableExtra("ıletısımler");

        binding.textView3.setText(selectedıletısımler.isim);
        binding.textView6.setText(selectedıletısımler.mail);
        binding.textView8.setText(selectedıletısımler.numara);
        binding.textView7.setText(selectedıletısımler.Gorev);
        binding.imageView3.setImageResource(selectedıletısımler.image);


    }
}