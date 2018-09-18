package br.com.ingatech.trabalho.models;

public class Cliente {

    private int codigo;
    private String nome;
    private int cpf;
    private int rg;

    public Cliente() {
    }

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
