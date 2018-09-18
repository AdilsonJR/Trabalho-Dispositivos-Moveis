package br.com.ingatech.trabalho.cad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.ingatech.trabalho.R;

public class CadCidadeActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_cidade);
        btnCancelar = findViewById(R.id.btnCancelarCadCidade);
        btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
