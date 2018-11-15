package com.example.bikesgerard;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface BicicletaDAO {
    @Insert
    void insert(Bicicleta bicicleta);

    @Query("SELECT * FROM Bicicleta")
    LiveData<List<Bicicleta>>getBicicletas();

}
