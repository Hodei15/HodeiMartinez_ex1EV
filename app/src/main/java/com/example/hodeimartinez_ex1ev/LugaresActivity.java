package com.example.hodeimartinez_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hodeimartinez_ex1ev.Objetos.Lugar;

import java.util.List;

public class LugaresActivity extends AppCompatActivity {
    TextView txtPuntuacionBilbao;
    TextView txtPuntuacionDonosti;
    TextView txtPuntuacionGazteiz;
    TextView txtPuntuacionIruna;
    int sitio;
    int nuevaPuntuacion;
    //Iniciar Objetos
    Lugar bilbao = new Lugar ("bilbao", "Bilbao", 0, "Bilbao es un municipio situado en el norte de España y una villa de dicho municipio");
    Lugar donostia = new Lugar ("donostia", "Donostia", 0, "San Sebastián es una ciudad y municipio español situado en la costa del mar Cantábrico");
    Lugar gazteiz = new Lugar ("gazteiz", "Gazteiz", 0, "Vitoria-Gasteiz es una ciudad y municipio español, capital de la provincia de Álava");
    Lugar iruna = new Lugar ("iruna", "Iruna", 0, "Pamplona es un municipio y ciudad española, capital de Navarra.");
    private void actualizarPuntuacion(int nuevaPuntuacion) {
        switch (sitio) {
            case 1:
                nuevaPuntuacion = getIntent().getIntExtra("nuevaPuntuacion", 0);
                bilbao.setPuntuacion(nuevaPuntuacion);
                txtPuntuacionBilbao.setText(String.valueOf(nuevaPuntuacion));
                break;
            case 2:
                nuevaPuntuacion = getIntent().getIntExtra("nuevaPuntuacion", 0);
                donostia.setPuntuacion(nuevaPuntuacion);
                txtPuntuacionDonosti.setText(String.valueOf(nuevaPuntuacion));
                break;
            case 3:
                nuevaPuntuacion = getIntent().getIntExtra("nuevaPuntuacion", 0);
                gazteiz.setPuntuacion(nuevaPuntuacion);
                txtPuntuacionGazteiz.setText(String.valueOf(nuevaPuntuacion));
                break;
            case 4:
                nuevaPuntuacion = getIntent().getIntExtra("nuevaPuntuacion", 0);
                iruna.setPuntuacion(nuevaPuntuacion);
                txtPuntuacionIruna.setText(String.valueOf(nuevaPuntuacion));
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
        sitio = -1;

        txtPuntuacionBilbao = findViewById(R.id.txtNumPuntuacionBilbao);
        txtPuntuacionDonosti = findViewById(R.id.txtNumPuntuacionDonosti);
        txtPuntuacionGazteiz = findViewById(R.id.txtNumPuntuacionGazteiz);
        txtPuntuacionIruna = findViewById(R.id.txtNumPuntuacionIruna);

        //Iniciar Botones y su funcion
        Button buttonBilbao = findViewById(R.id.btnBilbao);
        buttonBilbao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int nuevaPuntuacion = getIntent().getIntExtra("nuevaPuntuacion",0);
                bilbao.setPuntuacion(nuevaPuntuacion);
                txtPuntuacionBilbao.setText(String.valueOf(nuevaPuntuacion));
                sitio = 1;
                // Crear el intent
                Intent intent = new Intent(LugaresActivity.this, DetallesActivity.class);
                intent.putExtra("Nombre", bilbao.getTitulo());
                intent.putExtra("Descripcion", bilbao.getDescripcion());
                intent.putExtra("img", bilbao.getImg());
                intent.putExtra("puntuacion", bilbao.getPuntuacion());
                startActivity(intent);
                finish(); // Cerrar el activity
            }
        });
        Button buttonDonostia = findViewById(R.id.btnDonostia);
        buttonDonostia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                actualizarPuntuacion(nuevaPuntuacion);
                sitio = 2;
                // Crear el intent
                Intent intent = new Intent(LugaresActivity.this, DetallesActivity.class);
                intent.putExtra("Nombre", donostia.getTitulo());
                intent.putExtra("Descripcion", donostia.getDescripcion());
                intent.putExtra("img", donostia.getImg());
                intent.putExtra("puntuacion", donostia.getPuntuacion());
                startActivity(intent);
                finish(); // Cerrar el activity
            }
        });
        Button buttonGazteiz = findViewById(R.id.btnGazteiz);
        buttonGazteiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sitio = 3;
                // Crear el intent
                Intent intent = new Intent(LugaresActivity.this, DetallesActivity.class);
                intent.putExtra("Nombre", gazteiz.getTitulo());
                intent.putExtra("Descripcion", gazteiz.getDescripcion());
                intent.putExtra("img", gazteiz.getImg());
                intent.putExtra("puntuacion", gazteiz.getPuntuacion());
                startActivity(intent);
                finish(); // Cerrar el activity
            }
        });
        Button buttonIruna = findViewById(R.id.btnIruna);
        buttonIruna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sitio = 4;
                // Crear el intent
                Intent intent = new Intent(LugaresActivity.this, DetallesActivity.class);
                intent.putExtra("Nombre", iruna.getTitulo());
                intent.putExtra("Descripcion", iruna.getDescripcion());
                intent.putExtra("img", iruna.getImg());
                intent.putExtra("puntuacion", iruna.getPuntuacion());
                startActivity(intent);
                finish(); // Cerrar el activity
            }
        });


    }

}
