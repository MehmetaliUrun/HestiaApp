package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityDashboardBinding;
import com.google.firebase.auth.FirebaseAuth;

public class dashboard extends AppCompatActivity {
    private ActivityDashboardBinding binding;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        mAuth=FirebaseAuth.getInstance();//





       



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menuler0){
            Intent intent = new Intent(this,Hakkimizda.class);
            startActivity(intent);


        }else if(item.getItemId()==R.id.menuler1){
            Intent intent = new Intent(this,misyonvizyon.class);
            startActivity(intent);


        }else if(item.getItemId()==R.id.menuler2){
            Intent intent = new Intent(this,Iletisim.class);

            startActivity(intent);


        }else if(item.getItemId()==R.id.menuler3){
            Intent intent = new Intent(this,urunler.class);
            startActivity(intent);
            


        }
        else if(item.getItemId()==R.id.menuler4){
            Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/EE493Bot"));
            startActivity(intent);
            



        }else{
            mAuth.signOut();
            Intent intent=new Intent(dashboard.this,logactivity.class);
            startActivity(intent);
            finish();


        }


        return super.onOptionsItemSelected(item);

    }




}