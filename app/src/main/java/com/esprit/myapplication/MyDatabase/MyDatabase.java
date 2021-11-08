package com.esprit.myapplication.MyDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.esprit.myapplication.DAO.UserDAO;
import com.esprit.myapplication.DAO.salaireDAO;
import com.esprit.myapplication.entities.salaire;
import com.esprit.myapplication.entities.user;

/*@Database(entities ={user.class, salaire.class},version=1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
 private  static MyDatabase Instance;
 public abstract UserDAO userDAO();
 public abstract salaireDAO salaireDAO();

    public static MyDatabase getDatabase(Context context){
     if(Instance == null){
         Instance= Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class,"my_db")
                 .allowMainThreadQueries()
                 .build();

     }
     return Instance;
 }



}*/
public class MyDatabase extends SQLiteOpenHelper {
    private static final String DB_NAME="salaire";
    private static final String DB_TABLE="salaire_table";
    private static final String ID="ID";
    private static final String NAME="total";
    private static final String Create_table="CREATE TABLE "+DB_TABLE+" ( "+ID+ "INTEGER PRIMARY KEY AUTOINCREMENT " +
            NAME+" TEXT " +") ";




    public MyDatabase( Context context) {
        super(context,DB_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
sqLiteDatabase.execSQL(Create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS "+DB_TABLE);
    onCreate(sqLiteDatabase);
    }
    public boolean insertData(String total){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();

        contentValues.put(NAME,total);
    long resultat= db.insert(DB_TABLE,null,contentValues);
    return resultat !=-1;
    }


    public Cursor voir(){
        SQLiteDatabase db=this.getReadableDatabase();
        String query="Select * from "+DB_TABLE;
        Cursor cursor= db.rawQuery(query,null);
        return cursor;
    }
}


