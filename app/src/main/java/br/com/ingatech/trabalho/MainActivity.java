package br.com.ingatech.trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.ingatech.trabalho.listas.ListaCidadesActivity;
import br.com.ingatech.trabalho.listas.ListaClienteActivity;
import br.com.ingatech.trabalho.listas.ListaFornecedoresActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCidades;

    Button btnClientes;

    Button btnFornecedores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCidades = findViewById(R.id.btnCidades);
        btnCidades.setOnClickListener(this);

        btnClientes = findViewById(R.id.btnClientes);
        btnClientes.setOnClickListener(this);

        btnFornecedores = findViewById(R.id.btnFornecedores);
        btnFornecedores.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == btnCidades){
            Intent it = new Intent(this, ListaCidadesActivity.class);
            startActivity(it);
        }

        if(v == btnClientes){
            Intent it = new Intent(this, ListaClienteActivity.class);
            startActivity(it);
        }

        if(v == btnFornecedores){
            Intent it = new Intent(this, ListaFornecedoresActivity.class);
            startActivity(it);
        }
    }
}
