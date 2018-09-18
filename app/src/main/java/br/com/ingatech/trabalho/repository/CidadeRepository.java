package br.com.ingatech.trabalho.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ingatech.trabalho.models.Cidade;

public class CidadeRepository implements IPadraoRepository {

    List<Cidade> cidades = new ArrayList<Cidade>();

    @Override
    public void insert(Object o) {
        cidades.add( (Cidade) o );
    }

    @Override
    public void update(Object o) {
        if ( cidades.contains( (Cidade) o  ) ){
            cidades.remove((Cidade) o);
            cidades.add((Cidade) o);
        }
    }

    @Override
    public void delete(Object o) {
        cidades.remove((Cidade) o);
    }

    @Override
    public List getAll() {
        return cidades;
    }
}
