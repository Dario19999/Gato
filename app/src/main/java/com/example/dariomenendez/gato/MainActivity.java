package com.example.dariomenendez.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno, cont, cont0=0;
    String letra;
    EditText tGanador;

    //Botones
    Button B1_F1, B2_F1, B3_F1, B1_F2, B2_F2 , B3_F2, B1_F3, B2_F3, B3_F3, B_Exit, B_Replay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        B1_F1 = (Button) findViewById(R.id.boton1Fila1);
        B2_F1 = (Button) findViewById(R.id.boton2Fila1);
        B3_F1 = (Button) findViewById(R.id.boton3Fila1);
        B1_F2 = (Button) findViewById(R.id.boton1Fila2);
        B2_F2 = (Button) findViewById(R.id.boton2Fila2);
        B3_F2 = (Button) findViewById(R.id.boton3Fila2);
        B1_F3 = (Button) findViewById(R.id.boton1Fila3);
        B2_F3 = (Button) findViewById(R.id.boton2Fila3);
        B3_F3 = (Button) findViewById(R.id.boton3Fila3);

        tGanador = (EditText) findViewById(R.id.textGanador);

        B1_F1.setOnClickListener(this);
        B2_F1.setOnClickListener(this);
        B3_F1.setOnClickListener(this);
        B1_F2.setOnClickListener(this);
        B2_F2.setOnClickListener(this);
        B3_F2.setOnClickListener(this);
        B1_F3.setOnClickListener(this);
        B2_F3.setOnClickListener(this);
        B3_F3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        cont++;
        turno = cont%2;

        //Jugador 1
        if(turno == 1){
            imprimirXO('X', v);
        }

        //Jugador 2
        else{
            imprimirXO('O', v);
        }
    }

    public void imprimirXO(char letra, View v){

        if(v.getId() == R.id.boton1Fila1){
            B1_F1.setText(letra+"");
            B1_F1.setEnabled(false);
        }
        else if(v.getId() == R.id.boton2Fila1){
            B2_F1.setText(letra+"");
            B2_F1.setEnabled(false);
        }
        else if(v.getId() == R.id.boton3Fila1){
            B3_F1.setText(letra+"");
            B3_F1.setEnabled(false);
        }
        else if(v.getId() == R.id.boton1Fila2){
            B1_F2.setText(letra+"");
            B1_F2.setEnabled(false);
        }
        else if(v.getId() == R.id.boton2Fila2){
            B2_F2.setText(letra+"");
            B2_F2.setEnabled(false);
        }
        else if(v.getId() == R.id.boton3Fila2){
            B3_F2.setText(letra+"");
            B3_F2.setEnabled(false);
        }
        else if(v.getId() == R.id.boton1Fila3){
            B1_F3.setText(letra+"");
            B1_F3.setEnabled(false);
        }
        else if(v.getId() == R.id.boton2Fila3){
            B2_F3.setText(letra+"");
            B2_F3.setEnabled(false);
        }
        else {
            B3_F3.setText(letra+"");
            B3_F3.setEnabled(false);
        }
    }
}
