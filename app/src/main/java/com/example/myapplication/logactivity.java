package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityDashboardBinding;
import com.example.myapplication.databinding.ActivityLogactivityBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class logactivity extends AppCompatActivity {
    private ActivityLogactivityBinding binding;
    private FirebaseAuth mAuth;//bu objeyi olışturmamız gerekiyor AUthtrotion ( kayır-giriş) işlemleri için


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLogactivityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();


        //giriş yapan biri çıkış yapmadıysa şayet tekrar giriş yapmasın diye uygulamayı oturumu açık bırakmaya yarıyor
        FirebaseUser user=mAuth.getCurrentUser();
        if (user != null){
            Intent intent =new Intent(logactivity.this,dashboard.class);
            startActivity(intent);
            finish();



        }
        //çıkış butonu

        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(logactivity.this,"Güle Güle :)",Toast.LENGTH_LONG).show();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });


    }




    //giriş işlemleri
    public void gırısyap (View view) {
        String email = binding.Emailtext.getText().toString();
        String password = binding.paswordtext.getText().toString();

        if (email.equals("") || password.equals("")) {

            Toast.makeText(this,"Email ve Şifrenizi girin",Toast.LENGTH_LONG).show();



        }else{
            mAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {

                    Intent intent=new Intent(logactivity.this,dashboard.class);
                    startActivity(intent);
                    finish();


                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(logactivity.this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }
            });





        }
    }


}