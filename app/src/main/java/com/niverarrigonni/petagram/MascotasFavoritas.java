package com.niverarrigonni.petagram;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;


import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    Adapter adaptador;
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro5,"Pacha", 3));
        mascotas.add(new Mascota(R.drawable.perro4,"Tor", 4));
        mascotas.add(new Mascota(R.drawable.perro2,"Osa", 5));
        mascotas.add(new Mascota(R.drawable.perro3,"Toby", 2));
        mascotas.add(new Mascota(R.drawable.perro1,"Catty", 2));
    }

    public void onClick (View view){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }
}
