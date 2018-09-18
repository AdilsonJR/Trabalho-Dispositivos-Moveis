package br.com.ingatech.trabalho.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


import br.com.ingatech.trabalho.R;
import br.com.ingatech.trabalho.listas.ListaClienteActivity;
import br.com.ingatech.trabalho.models.Cliente;

public class ClienteAdapter extends ArrayAdapter {

    private final LayoutInflater inflater;
    private final int resourceId;

    public ClienteAdapter(ListaClienteActivity  activity, int listaModeloCliente, List<Cliente> clientes){
        super(activity, listaModeloCliente, clientes);
        this.inflater = LayoutInflater.from(activity);
        this.resourceId = listaModeloCliente;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cliente cliente = (Cliente) getItem(position);
        convertView = inflater.inflate(resourceId, parent, false);

        TextView txvCodigo = convertView.findViewById(R.id.edtCodigoCliente);
        txvCodigo.setText(String.valueOf(cliente.getCodigo()));

        TextView txvNome = convertView.findViewById(R.id.edtNomeCliente);
        txvNome.setText( cliente.getNome());

        TextView txvRg = convertView.findViewById(R.id.edtRgCliente);
        txvRg.setText( String.valueOf(cliente.getRg()));

        TextView txvCpf = convertView.findViewById(R.id.edtCpfCliente);
        txvCpf.setText( String.valueOf(cliente.getCpf()));
        return convertView;
    }
}
