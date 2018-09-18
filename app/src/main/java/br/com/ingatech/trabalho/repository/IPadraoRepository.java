package br.com.ingatech.trabalho.repository;

import java.util.List;

public interface IPadraoRepository {

    public void insert(Object o);

    public void update(Object o);

    public void delete(Object o);

    public List getAll();

}
