package com.counter.tasbeeh.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.counter.tasbeeh.Model.Favourite;
import com.counter.tasbeeh.Model.FavouriteDao;


@Database(entities = {Favourite.class}, version = 1)

public abstract class  FavouriteAppDatabase extends RoomDatabase
{

    public abstract FavouriteDao FavouriteDao();

}