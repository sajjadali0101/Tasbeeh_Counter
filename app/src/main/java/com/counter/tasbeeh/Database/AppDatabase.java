package com.counter.tasbeeh.Database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.counter.tasbeeh.Model.Product;
import com.counter.tasbeeh.Model.ProductDao;

@Database(entities = {Product.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase

{

    public abstract ProductDao ProductDao();


}
