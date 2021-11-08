package com.esprit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button LogIn;
   Button SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
        LogIn=findViewById(R.id.buttonlogin);
        LogIn.setOnClickListener(view -> {
            Intent intent= new Intent(this,fragment2Activity.class);
            startActivity(intent);
        });
        SignIn=findViewById(R.id.buttonsignein);
        SignIn.setOnClickListener(view -> {
            Intent intent= new Intent(this,Signin.class);
            startActivity(intent);
        });
    }
}