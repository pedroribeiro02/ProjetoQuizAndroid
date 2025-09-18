package com.example.projetoquiz;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    TextView txvPergunta;
    RadioGroup rdgPrincipal;
    Button btnResponder;
    int pontuacao = 0;
    int indicePergunta = 0;


    String[] perguntas = {
            "Minha pergunta 1",
            "Minha pergunta 2",
            "Minha pergunta 3",
            "Minha pergunta 4",
            "Minha pergunta 5"
    };
    int []respostasCorretas = {
            R.id.rb_a,
            R.id.rb_a,
            R.id.rb_b,
            R.id.rb_d,
            R.id.rb_c
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txvPergunta = findViewById(R.id.txv_perguntas);
        rdgPrincipal = findViewById(R.id.rbg_principal);
        btnResponder = findViewById(R.id.btn_responder);

        //Nosso metodo
        //carregarPerguntas();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}