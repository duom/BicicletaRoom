package com.example.bikesgerard;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class BicicletaRepository {

        BicicletaDAO mBicicletaDao;

        BicicletaRepository(Application application){

            mBicicletaDao = BicicletaDatabase.getDatabase(application).bicicletaDAO();
        }

        LiveData<List<Bicicleta>> getBicicletas(){
            return mBicicletaDao.getBicicletas();
        }
        
        
    public void insert(Bicicleta Bicicleta) {
        new insertAsyncTask(mBicicletaDao).execute(Bicicleta);
    }

    private static class insertAsyncTask extends AsyncTask<Bicicleta, Void, Void> {

        private BicicletaDAO mAsyncTaskDao;

        insertAsyncTask(BicicletaDAO dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Bicicleta... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
