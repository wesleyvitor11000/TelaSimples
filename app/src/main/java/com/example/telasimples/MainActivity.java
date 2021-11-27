package com.example.telasimples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar topBar = findViewById(R.id.topBar);

        FloatingActionButton add_button = findViewById(R.id.add_button);

        setSupportActionBar(topBar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("");
        }

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formScreen();
            }
        });
    }

    public void formScreen(){
        Intent telaFormulario = new Intent(MainActivity.this, formularioInscricao.class);
        startActivity(telaFormulario);
        finish();
    }
}