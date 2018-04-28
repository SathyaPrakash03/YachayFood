package com.example.hugo.yachayfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Autentificacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autentificacion);
    }

    public void goToHome(View view){
        Intent intent = new Intent(this, LateralMenu.class);
        startActivity(intent);
    }

    public void goToRegister(View view){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }

}
