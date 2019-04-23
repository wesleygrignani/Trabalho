package com.example.trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirTelaVendas(View view){
        startActivity(new Intent(getBaseContext(),tela_vender.class));
    }

    public void abrirTelaCompras(View view){
        startActivity(new Intent(getBaseContext(),tela_comprar.class));
    }
}
