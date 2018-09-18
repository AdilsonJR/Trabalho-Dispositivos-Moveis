package br.com.ingatech.trabalho.models;

public class Fornecedor {

    private int codigo;
    private String nome;

    public Fornecedor() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Fornecedores{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
