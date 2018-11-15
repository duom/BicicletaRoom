package com.example.bikesgerard;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Bicicleta {

    @PrimaryKey
    int id;

    String marca;
    int pulgadas;
    boolean carbono;
    int precio;


}
