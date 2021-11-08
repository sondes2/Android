package com.esprit.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.esprit.myapplication.MyDatabase.MyDatabase;
import com.esprit.myapplication.entities.salaire;
import com.esprit.myapplication.entities.user;
import com.esprit.myapplication.entities.salaire;

import java.util.List;

public class Salaire extends AppCompatActivity {
    private EditText salaire1;
    private EditText Autres;
    private EditText loisirs;
    private EditText Medicament;
    private EditText  Nourriture;
    private TextView interpritation;
    Button Valider;
    Button voir;

    MyDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salaire);
        salaire1 =(EditText) findViewById(R.id.salaire);
        Autres =(EditText) findViewById(R.id.Autres);
        loisirs =(EditText) findViewById(R.id.loisirs);
        Medicament =(EditText) findViewById(R.id.Médicament);
        Nourriture =(EditText) findViewById(R.id.Nourriture);
        interpritation =(TextView) findViewById(R.id.interpritation);
        Valider =(Button) findViewById(R.id.Valider);
        voir =(Button) findViewById(R.id.voir);
db=new MyDatabase(this);

 Valider.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         double sal= Double.parseDouble(salaire1.getText().toString());
         double aut= Double.parseDouble(Autres.getText().toString());
         double loi= Double.parseDouble(loisirs.getText().toString());
         double med= Double.parseDouble(Medicament.getText().toString());
         double nou= Double.parseDouble(Nourriture.getText().toString());

         double r=aut+loi+med+nou;
         double pourcentage= r*100/sal;
       String  res="";
       if(pourcentage<3){
           res="vous etes dans le bon chemain";

       }else if (pourcentage == 3){
           res="vous etes dans les limites de votre budget de jour";

       }else {
           res="vous devais diminuer les dépense,vous etes dans le rouge pour aujourd'hui ";
       }

         interpritation.setText(res);
        // salaire salaire = new salaire(salaire1.getText().toString(),Autres.getText().toString(),loisirs.getText().toString(),Medicament.getText().toString(),Nourriture.getText().toString());
       //  db.salaireDAO().addsalair(salaire);
     }
 });
 voir.setOnClickListener(new View.OnClickListener(){
 public void onClick(View view){
     String r=voir.getText().toString();
     if (!r.equals("") && db.insertData(r)){
         Toast.makeText(Salaire.this, "data added ", Toast.LENGTH_SHORT).show();

     }else{
         Toast.makeText(Salaire.this, "data NOT added", Toast.LENGTH_SHORT).show();
     }

 }
 });


        }


}

