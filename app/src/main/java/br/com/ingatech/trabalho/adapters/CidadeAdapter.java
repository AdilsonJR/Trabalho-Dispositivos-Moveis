package br.com.ingatech.trabalho.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.ingatech.trabalho.R;
import br.com.ingatech.trabalho.listas.ListaCidadesActivity;
import br.com.ingatech.trabalho.models.Cidade;

public class CidadeAdapter  extends ArrayAdapter {

    private final LayoutInflater inflater;
    private final int resourceId;

    public CidadeAdapter(ListaCidadesActivity  activity, int listaModeloCidade, List<Cidade> cidades){
        super(activity, listaModeloCidade, cidades);
        this.inflater = LayoutInflater.from(activity);
        this.resourceId = listaModeloCidade;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cidade cidade = (Cidade) getItem(position);
        convertView = inflater.inflate(resourceId, parent, false);

        TextView txvCodigo = convertView.findViewById(R.id.edtCodigoCidade);
        txvCodigo.setText(String.valueOf(cidade.getCodigo()));

        TextView txvNome = convertView.findViewById(R.id.edtNomeCidade);
        txvNome.setText( cidade.getNome());

        return convertView;
    }
}
