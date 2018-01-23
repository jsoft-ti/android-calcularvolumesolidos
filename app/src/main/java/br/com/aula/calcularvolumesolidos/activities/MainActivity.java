package br.com.aula.calcularvolumesolidos.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.aula.calcularvolumesolidos.R;
import br.com.aula.calcularvolumesolidos.solidos.PrismaTriangular;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirPrismaRetangular(View view){
        Intent it = new Intent(this,PrismaRetangularActivity.class);
        startActivity(it);
    }

    public void abrirPrismaTriangular(View view){
        Intent it = new Intent(this, PrismaTriangularActivity.class);
        startActivity(it);
    }

    public void abrirEsfera(View view){
        Intent it = new Intent(this,EsferaActivity.class);
        startActivity(it);
    }

    public void abrirCilindro(View view){
        Intent it = new Intent(this,CilindroActivity.class);
        startActivity(it);
    }

    public void abrirPiramide(View view) {
        Intent it = new Intent(this,PiramideActivity.class);
        startActivity(it);
    }
}
