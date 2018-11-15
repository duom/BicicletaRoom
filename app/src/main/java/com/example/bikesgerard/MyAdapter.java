package com.example.bikesgerard;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Bicicleta> list;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemBicicleta = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bicicleta, viewGroup, false);
        return new MyViewHolder(itemBicicleta);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Bicicleta bicicleta = list.get(i);
        myViewHolder.bicicletaMarca.setText(bicicleta.marca);
        myViewHolder.bicicletaPrecio.setText(bicicleta.precio);

    }

    @Override
    public int getItemCount() {
        return (list != null ? list.size() : 0);
    }

    public void setList(List<Bicicleta> bicilist){
        list = bicilist;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView bicicletaMarca;
        private TextView bicicletaPrecio;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             bicicletaMarca = itemView.findViewById(R.id.bici_marca);
             bicicletaPrecio = itemView.findViewById(R.id.bici_precio);
        }
    }
}


