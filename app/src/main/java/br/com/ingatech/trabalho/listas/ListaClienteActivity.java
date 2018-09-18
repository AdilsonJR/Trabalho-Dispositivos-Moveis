package br.com.ingatech.trabalho.listas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;


import br.com.ingatech.trabalho.R;
import br.com.ingatech.trabalho.models.Cliente;
import br.com.ingatech.trabalho.adapters.ClienteAdapter;
import br.com.ingatech.trabalho.cad.CadClienteActivity;

public class ListaClienteActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnCadCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);

        List<Cliente> clientes = new ArrayList<Cliente>();

        for( int i=0; i<5; i++){
            Cliente cliente = new Cliente();
            Random rand = new Random();

            cliente.setCodigo(i);
            cliente.setNome("Cliente " + 1);
            cliente.setCpf(rand.nextInt(1000000000));
            cliente.setRg(rand.nextInt(1000000000));
            clientes.add(cliente);
        }

        ListView lvClientes = findViewById(R.id.lvClientes);

        ArrayAdapter ad = new ClienteAdapter(this,R.layout.lista_clientes, clientes);

        lvClientes.setAdapter(ad);

        btnCadCliente = findViewById(R.id.btnNovoCliente);

        btnCadCliente.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, CadClienteActivity.class);
        startActivity(it);
    }
}
