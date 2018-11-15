package com.example.bikesgerard;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;



    @Database(entities = {Bicicleta.class}, version = 1)

    public abstract class BicicletaDatabase extends RoomDatabase {

        public abstract BicicletaDAO bicicletaDAO();

        private static volatile BicicletaDatabase INSTANCE;

        static BicicletaDatabase getDatabase(final Context context) {
            if (INSTANCE == null) {
                synchronized (BicicletaDatabase.class) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                BicicletaDatabase.class, "poem_database")
                                .build();
                    }
                }
            }
            return INSTANCE;
        }
    }



