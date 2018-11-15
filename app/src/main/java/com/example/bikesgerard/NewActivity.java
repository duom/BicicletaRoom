package com.example.bikesgerard;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        btn=findViewById(R.id.btnAdd);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BicicletasViewModel bicicletasViewModel = ViewModelProviders.of(NewActivity.this).get(BicicletasViewModel.class);
                Bicicleta bici = new Bicicleta();
                bici.marca=((EditText)findViewById(R.id.et1)).getText().toString();



                bicicletasViewModel.insert(bici);

            }
        });
    }
}
