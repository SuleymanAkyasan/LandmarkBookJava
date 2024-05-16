package com.example.landmarkbookjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.landmarkbookjava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    ArrayList<informationsData> informationsArrayList;

    public LandmarkAdapter(ArrayList<informationsData> informationsArrayList) {
        this.informationsArrayList = informationsArrayList;
    }

    //xml'i bağlama işlemi burada yapılır
    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerRowBinding);
    }
        //bu görünümlerimizi tutan yardımcı sınıf bağandığında ne olacak kısaca hangi verileri göstericez onları
            //göstermeye yarıyo
    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerViewTextView.setText(informationsArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),InformationsActivity.class);
                intent.putExtra("landmark",informationsArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }
        //bu kaç eleman varsa o kadar döndürücek 4 tane var mesela 4 yazarız return'e
    @Override
    public int getItemCount() {
        return informationsArrayList.size();
    }

    //görünümlerimizi tutan yardımcı bir sınıf:
    public class LandmarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;
        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
