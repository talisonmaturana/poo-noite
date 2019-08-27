package com.talison;

public class Produto {
    public int codigo;
    public String nome;
    public double valor;

    @Override
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("Codigo: ").append(codigo).append("/n");
        dados.append("Nome: ").append(nome).append("/n");
        dados.append("Valor: ").append(valor).append("/n");

        return dados.toString();
    }
}
