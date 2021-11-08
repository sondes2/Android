package com.esprit.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
public class fragment2Activity extends AppCompatActivity {
    private EditText login;
    private EditText password;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button start11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first1);
  login =(EditText) findViewById(R.id.login);
  password =(EditText) findViewById(R.id.password);
   start11 =(Button) findViewById(R.id.start11);

      sharedPreferences = getSharedPreferences( "my_pref", MODE_PRIVATE);
      editor = sharedPreferences.edit();
       start11.setOnClickListener(view -> {
       editor.putString("login", login.getText().toString());
       editor.putString("password", password.getText().toString());
       editor.apply();
       Intent intent = new Intent(fragment2Activity.this, Salaire.class);

       startActivity(intent);
   });
    }

}