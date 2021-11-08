package com.esprit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.esprit.myapplication.DAO.UserDAO;
import com.esprit.myapplication.MyDatabase.MyDatabase;
import com.esprit.myapplication.entities.user;

public class Signin extends AppCompatActivity {
    private EditText name;
    private EditText lastname;
    private EditText email;
    private EditText password;
    Button signin;
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscrit);
        name =(EditText) findViewById(R.id.name);
        lastname =(EditText) findViewById(R.id.lastname);
        email =(EditText) findViewById(R.id.email);
        password =(EditText) findViewById(R.id.Passwordinscrit);
        signin =(Button) findViewById(R.id.buttonsignin);

//db = MyDatabase.getDatabase(this);

signin.setOnClickListener(view -> {
   user user = new user(name.getText().toString(),lastname.getText().toString(),email.getText().toString(),password.getText().toString());
//db.userDAO().addUser(user);
            Toast.makeText(this, "vous etes inscrit",Toast.LENGTH_SHORT).show();

}

);
    }
}