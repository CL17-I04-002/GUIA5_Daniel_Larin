package com.example.guia5_daniel_larin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_login;
    private Button btn_datos;
    private Button btn_calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        btn_login = (Button)findViewById(R.id.btn_login);
    }
    public void Login(View view){
        startActivity(new Intent(MainActivity.this, login.class));
    }
    public void VerDatos(View view){
        startActivity(new Intent(MainActivity.this, datos.class));
    }
    public void Calculator(View view){
        startActivity(new Intent(MainActivity.this, calculator.class));
    }
    public void Conversation(View view){
        startActivity(new Intent(MainActivity.this, conversation.class));
    }
}