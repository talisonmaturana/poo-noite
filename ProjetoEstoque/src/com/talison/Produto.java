package com.talison;

public class Produto {
    public int id;
    public String nome;
    public double valor;
    public double qtdEstoque;

    public int regEntrada(double qtd){
        qtdEstoque += qtd;
    }

    public boolean regSaida(double qtd){
        if(qtd <= qtdEstoque) {
            qtdEstoque -= qtd;
            return true;
        }
        return false;
    }

    public void imprimir(){
        System.out.println("id = " + id);
        System.out.println("nome = " + nome);
        System.out.println("valor = " + valor);
        System.out.println("qtdEstoque = " + qtdEstoque);
    }
}
