package com.example.hodeimartinez_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Botoia declaratu
        Button btnAtzera = findViewById(R.id.btnAurrera);
        //botoiaren funtzioa
        btnAtzera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Sortu intent bat login hasteko
                Intent intent = new Intent(MainActivity.this, LugaresActivity.class);
                startActivity(intent);
                finish(); // Cerrar el activity
            }
        });

    }
}