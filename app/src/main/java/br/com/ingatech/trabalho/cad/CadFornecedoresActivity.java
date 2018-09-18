package br.com.ingatech.trabalho.cad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.ingatech.trabalho.R;

public class CadFornecedoresActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_fornecedor);
        btnCancelar = findViewById(R.id.btnCancelarCadFornecedor);
        btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
