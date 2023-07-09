package com.example.ppt;

import androidx.appcompat.app.AppCompatActivity;

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

    public int selecaoPedra(View view){
        TextView escolha = findViewById(R.id.escolha);
        escolha.setText("VOCÊ ESCOLHEU PEDRA!");
        TextView resultado = findViewById(R.id.resultado);
        resultado.setText("");
        int r = selecaoComputador(view);
        return 1;
    }

    public int selecaoPapel(View view){
        TextView escolha = findViewById(R.id.escolha);
        escolha.setText("VOCÊ ESCOLHEU PAPEL!");
        TextView resultado = findViewById(R.id.resultado);
        resultado.setText("");
        int r = selecaoComputador(view);
        return 2;
    }

    public int selecaoTesoura(View view){
        TextView escolha = findViewById(R.id.escolha);
        escolha.setText("VOCÊ ESCOLHEU TESOURA!");
        TextView resultado = findViewById(R.id.resultado);
        resultado.setText("");
        int r = selecaoComputador(view);
        return 3;
    }

    public int selecaoComputador(View view){
        int i = new Random().nextInt(3);
        if(i == 1){
            ImageView icon_selec_com = findViewById(R.id.icone_selec_com);
            icon_selec_com.setImageResource(R.drawable.com_pedra);
            TextView escolha = findViewById(R.id.escolha_com);
            escolha.setText("O COMPUTADOR ESCOLHEU PEDRA!");
        }else if(i == 2){
            ImageView icon_selec_com = findViewById(R.id.icone_selec_com);
            icon_selec_com.setImageResource(R.drawable.com_papel);
            TextView escolha = findViewById(R.id.escolha_com);
            escolha.setText("O COMPUTADOR ESCOLHEU PAPEL!");
        }else{
            ImageView icon_selec_com = findViewById(R.id.icone_selec_com);
            icon_selec_com.setImageResource(R.drawable.com_tesoura);
            TextView escolha = findViewById(R.id.escolha_com);
            escolha.setText("O COMPUTADOR ESCOLHEU TESOURA!");
        }
        return i;
    }

}