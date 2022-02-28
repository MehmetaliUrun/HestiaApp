package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.RecyclerRowBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class ıletısımlerAdapter extends RecyclerView.Adapter<ıletısımlerAdapter.ıletısımHolder> {
    ArrayList<ıletısımler> ıletısımlerArrayList;

    public ıletısımlerAdapter(ArrayList<ıletısımler> ıletısımlerArrayList) {
        this.ıletısımlerArrayList = ıletısımlerArrayList;
    }

    @NonNull
    @Override
    public ıletısımHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerRowBinding recylerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);


        return new ıletısımHolder(recylerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ıletısımHolder holder, int position) {
        holder.binding.recyclerViewTextView.setText(ıletısımlerArrayList.get(position).isim);
        holder.binding.imageView111.setImageResource(ıletısımlerArrayList.get(position).image);



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(),iletisimbilgi.class);
                intent.putExtra("ıletısımler",ıletısımlerArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);



            }
        });

    }

    @Override
    public int getItemCount() {
        return ıletısımlerArrayList.size();
    }

    public class ıletısımHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;




        public ıletısımHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding =binding;

        }
    }


}
