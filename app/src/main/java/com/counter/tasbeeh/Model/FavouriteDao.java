package com.counter.tasbeeh.Model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


@Dao
public interface FavouriteDao {

    @Insert
    void insertrecord(Favourite favourite);

    @Query("SELECT COUNT(*) FROM Favourite WHERE pid = :productid")
    Boolean is_exist(int productid);


    @Query("SELECT * FROM Favourite")
    List<Favourite> getallproduct();


    @Query("DELETE FROM Favourite WHERE pid = :id")
    void deleteById(int id);


    @Query("DELETE FROM Favourite")
    void deleteAll();




}
