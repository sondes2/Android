package com.esprit.myapplication.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;

import com.esprit.myapplication.entities.user;

@Dao
public interface UserDAO {
    @Insert
    void  addUser(user user);

}
