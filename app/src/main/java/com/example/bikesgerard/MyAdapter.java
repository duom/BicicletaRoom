package com.example.bikesgerard;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemPoem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_itembicicleta, viewGroup, false);
        return new MyViewHolder(itemPoem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Bicicleta bicicleta = list.get(i);
        myViewHolder.BicicletaAuthor.setText(bicicleta.marca);
        myViewHolder.BicicletaAuthor.setText(bicicleta.precio);

    }

    @Override
    public int getItemCount() {
        return (list != null ? list.size() : 0);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView BicicletaTitle;
        private TextView BicicletaAuthor;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             BicicletaTitle = itemView.findViewById(R.id.bici_title);
             BicicletaAuthor = itemView.findViewById(R.id.bici_author);

        }
    }
        List<Bicicleta> list;

    }


