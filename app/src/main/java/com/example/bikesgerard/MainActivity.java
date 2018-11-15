package com.example.bikesgerard;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.nio.charset.MalformedInputException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btnFAB;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.RV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        btnFAB = findViewById(R.id.FAB);

        final MyAdapter myAdapter = new MyAdapter();

        recyclerView.setAdapter(myAdapter);

        btnFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NewActivity.class);
                startActivity(intent);
            }
        });



        BicicletasViewModel bicicletasViewModel = ViewModelProviders.of(MainActivity.this).get(BicicletasViewModel.class);
        bicicletasViewModel.getBicicletas().observe(this, new Observer<List<Bicicleta>>() {
            @Override
            public void onChanged(@Nullable List<Bicicleta> bicicletas) {
                myAdapter.setList(bicicletas);
                myAdapter.notifyDataSetChanged();
            }
        });
    }
}
