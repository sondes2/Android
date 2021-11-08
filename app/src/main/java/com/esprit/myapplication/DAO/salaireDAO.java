package com.esprit.myapplication.DAO;

import android.widget.EditText;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.myapplication.entities.salaire;

import java.util.List;

@Dao
public interface salaireDAO {
    @Insert
    void  addsalair(salaire salaire);
    @Query("SELECT * FROM salaire")
    List<salaire> getAllSalaire();
}
