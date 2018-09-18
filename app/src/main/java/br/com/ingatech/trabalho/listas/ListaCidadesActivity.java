package br.com.ingatech.trabalho.listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.ingatech.trabalho.R;
import br.com.ingatech.trabalho.adapters.CidadeAdapter;
import br.com.ingatech.trabalho.cad.CadCidadeActivity;
import br.com.ingatech.trabalho.models.Cidade;

public class ListaCidadesActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnCadCidade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cidades);

        List<Cidade> cidades = new ArrayList<Cidade>();

        for( int i=0; i<8; i++){
            cidades.add(new Cidade(i,"Cidade "+i, "PR"));
        }

        ListView lvCidades = findViewById(R.id.lvCidades);

        ArrayAdapter ad = new CidadeAdapter(this,R.layout.lista_cidades, cidades);

        lvCidades.setAdapter(ad);

        btnCadCidade = findViewById(R.id.btnNovoCidade);

        btnCadCidade.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, CadCidadeActivity.class);
        startActivity(it);
    }
}
