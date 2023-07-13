package com.example.ppt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ///////////*SELEÇÕES DO JOGADOR*/////////////

    public int selecaoPedra(View view){
        TextView escolha = findViewById(R.id.escolha);
        escolha.setText("VOCÊ ESCOLHEU PEDRA");
        int r = selecaoComputador(view);
        Resultado(0, r);
        return 0;
    }

    public int selecaoPapel(View view){
        TextView escolha = findViewById(R.id.escolha);
        escolha.setText("VOCÊ ESCOLHEU PAPEL");
        int r = selecaoComputador(view);
        Resultado(1, r);
        return 1;
    }

    public int selecaoTesoura(View view){
        TextView escolha = findViewById(R.id.escolha);
        escolha.setText("VOCÊ ESCOLHEU TESOURA");
        int r = selecaoComputador(view);
        Resultado(2, r);
        return 2;
    }

    ///////////*SELEÇÕES DO COMPUTADOR*/////////////

    public int selecaoComputador(View view){
        int i = new Random().nextInt(3);
        if(i == 0){
            ImageView icon_selec_com = findViewById(R.id.icone_selec_com);
            icon_selec_com.setImageResource(R.drawable.com_pedra);
            TextView escolha = findViewById(R.id.escolha_com);
            escolha.setText("O COMPUTADOR ESCOLHEU PEDRA");
        }else if(i == 1){
            ImageView icon_selec_com = findViewById(R.id.icone_selec_com);
            icon_selec_com.setImageResource(R.drawable.com_papel);
            TextView escolha = findViewById(R.id.escolha_com);
            escolha.setText("O COMPUTADOR ESCOLHEU PAPEL");
        }else{
            ImageView icon_selec_com = findViewById(R.id.icone_selec_com);
            icon_selec_com.setImageResource(R.drawable.com_tesoura);
            TextView escolha = findViewById(R.id.escolha_com);
            escolha.setText("O COMPUTADOR ESCOLHEU TESOURA");
        }
        return i;
    }

    ///////////*RESULTADOS*/////////////

    public void Resultado(int jogador, int computador){
        TextView resultado = findViewById(R.id.resultado);
        if(jogador == computador){
            resultado.setText("EMPATE!");
            resultado.setTextColor(getResources().getColor(R.color.black));
        }else if(jogador == 0){
            if(computador == 1){
                resultado.setText("VOCÊ PERDEU.");
                resultado.setTextColor(getResources().getColor(R.color.derrota));
            }else{
                resultado.setText("VOCÊ GANHOU!");
                resultado.setTextColor(getResources().getColor(R.color.vitoria));
            }
        }else if(jogador == 1){
            if(computador == 2){
                resultado.setText("VOCÊ PERDEU.");
                resultado.setTextColor(getResources().getColor(R.color.derrota));
            }else{
                resultado.setText("VOCÊ GANHOU!");
                resultado.setTextColor(getResources().getColor(R.color.vitoria));

            }
        }else{
            if(computador == 0){
                resultado.setText("VOCÊ PERDEU.");
                resultado.setTextColor(getResources().getColor(R.color.derrota));
            }else{
                resultado.setText("VOCÊ GANHOU!");
                resultado.setTextColor(getResources().getColor(R.color.vitoria));
            }
        }
    }

}