package com.example.bikesgerard;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class BicicletasViewModel extends AndroidViewModel {

    BicicletaRepository bicicletaRepository;
    public BicicletasViewModel(@NonNull Application application){
        super(application);

        bicicletaRepository = new BicicletaRepository(application);

    }

    LiveData<List<Bicicleta>> getBicicletas(){
        return bicicletaRepository.getBicicletas();
    }

    void insert(Bicicleta bicicleta){
        bicicletaRepository.insert(bicicleta);

    }


}
