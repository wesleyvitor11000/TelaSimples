package com.example.telasimples;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class formularioInscricao extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_inscricao);

        RadioButton[] opcoes = new RadioButton[]{findViewById(R.id.solteiro_radio),
                findViewById(R.id.casado_radio),
                findViewById(R.id.separado_radio),
                findViewById(R.id.divorciado_radio)};

        RadioGroup opcoesGroup = findViewById(R.id.opcoes_group);

        ColorStateList colorStateList = new ColorStateList(
                new int[][]
                        {
                                new int[]{-android.R.attr.state_checked}, // Disabled
                                new int[]{android.R.attr.state_checked}   // Enabled
                        },
                new int[]
                        {
                                Color.BLACK// disabled
                                , Color.parseColor("#E91E63")// enabled
                        }
        );

        opcoesGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                for(RadioButton r: opcoes){
                    r.setButtonTintList(colorStateList);
                }
            }
        });



    }
}