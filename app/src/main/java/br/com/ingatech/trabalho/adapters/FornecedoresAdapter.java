package br.com.ingatech.trabalho.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.ingatech.trabalho.R;
import br.com.ingatech.trabalho.listas.ListaFornecedoresActivity;
import br.com.ingatech.trabalho.models.Fornecedor;


public class FornecedoresAdapter extends ArrayAdapter {

    private final LayoutInflater inflater;
    private final int resourceId;

    public FornecedoresAdapter(ListaFornecedoresActivity  activity, int listaModeloFornecedores, List<Fornecedor> fornecedores){
        super(activity, listaModeloFornecedores, fornecedores);
        this.inflater = LayoutInflater.from(activity);
        this.resourceId = listaModeloFornecedores;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Fornecedor fornecedores = (Fornecedor) getItem(position);
        convertView = inflater.inflate(resourceId, parent, false);

        TextView txvCodigo = convertView.findViewById(R.id.edtCodigoFornecedor);
        txvCodigo.setText(String.valueOf(fornecedores.getCodigo()));

        TextView txvNome = convertView.findViewById(R.id.edtNomeFornecedor);
        txvNome.setText( fornecedores.getNome());

        return convertView;
    }
}
