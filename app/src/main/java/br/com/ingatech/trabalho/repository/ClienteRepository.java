package br.com.ingatech.trabalho.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ingatech.trabalho.models.Cidade;
import br.com.ingatech.trabalho.models.Cliente;

public class ClienteRepository implements IPadraoRepository {

    List<Cliente> clientes = new ArrayList<Cliente>();

    @Override
    public void insert(Object o) {
        clientes.add( (Cliente) o );
    }

    @Override
    public void update(Object o) {
        if ( clientes.contains( (Cliente) o  ) ){
            clientes.remove((Cliente) o);
            clientes.add((Cliente) o);
        }
    }

    @Override
    public void delete(Object o) {
        clientes.remove((Cliente) o);
    }

    @Override
    public List getAll() {
        return clientes;
    }
}
