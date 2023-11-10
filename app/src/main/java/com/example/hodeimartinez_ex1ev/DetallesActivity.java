package com.example.hodeimartinez_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hodeimartinez_ex1ev.Objetos.Lugar;



public class DetallesActivity extends AppCompatActivity {
    private String titulo;
    private String descripcion;
    private String img;
    private int puntuacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        //recoger la informacion
        titulo = getIntent().getStringExtra("Nombre");
        descripcion = getIntent().getStringExtra("Descripcion");
        img = getIntent().getStringExtra("img");
        puntuacion = getIntent().getIntExtra("puntuacion", 0);

        //declarar los textviews
        ImageView imgIrudia = findViewById(R.id.imgDetalles);
        TextView txtTitulo = findViewById(R.id.txtTituloDetalles);
        TextView txtDetalles = findViewById(R.id.txtDescripcionDetalles);
        TextView txtPuntuacion = findViewById(R.id.txtNumPuntuacionDetalle);

        //setear los textviews en base a la ciudad escogida
        txtDetalles.setText(descripcion);
        txtPuntuacion.setText(String.valueOf(puntuacion));
        txtTitulo.setText(titulo);

        Button buttonVolver = findViewById(R.id.btnVolver);
        buttonVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetallesActivity.this, LugaresActivity.class);
                intent.putExtra("nuevaPuntuacion", puntuacion);
                startActivity(intent);
                finish();
            }
        });

        Button buttonPuntuar = findViewById(R.id.btnPuntuar);
        buttonPuntuar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                puntuacion++;
                Intent intent = new Intent(DetallesActivity.this, LugaresActivity.class);
                intent.putExtra("nuevaPuntuacion", puntuacion);
                startActivity(intent);
                finish();
            }
        });
    }
}