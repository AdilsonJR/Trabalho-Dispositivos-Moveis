package br.com.ingatech.trabalho.listas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.ingatech.trabalho.R;
import br.com.ingatech.trabalho.adapters.FornecedoresAdapter;
import br.com.ingatech.trabalho.cad.CadFornecedoresActivity;
import br.com.ingatech.trabalho.models.Fornecedor;

public class ListaFornecedoresActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnCadFornecedores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_fornecedores);

        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        for( int i=0; i<5; i++){

            Fornecedor fornecedor = new Fornecedor();

            fornecedor.setCodigo(i);
            fornecedor.setNome("Fornecedor " + i);

            fornecedores.add(fornecedor);
        }

        ListView lvFornecedores = findViewById(R.id.lvFornecedores);

        ArrayAdapter ad = new FornecedoresAdapter(this,R.layout.lista_fornecedores, fornecedores);

        lvFornecedores.setAdapter(ad);

        btnCadFornecedores = findViewById(R.id.btnNovoFornecedor);

        btnCadFornecedores.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, CadFornecedoresActivity.class);
        startActivity(it);
    }
}
