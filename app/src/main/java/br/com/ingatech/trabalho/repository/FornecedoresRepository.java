package br.com.ingatech.trabalho.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ingatech.trabalho.models.Fornecedor;

public class FornecedoresRepository implements IPadraoRepository {

    List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

    @Override
    public void insert(Object o) {
        fornecedores.add( (Fornecedor) o );
    }

    @Override
    public void update(Object o) {
        if ( fornecedores.contains( (Fornecedor) o  ) ){
            fornecedores.remove((Fornecedor) o);
            fornecedores.add((Fornecedor) o);
        }
    }

    @Override
    public void delete(Object o) {
        fornecedores.remove((Fornecedor) o);
    }

    @Override
    public List getAll() {
        return fornecedores;
    }
}
