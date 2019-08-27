package com.talison;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;
    public int retorno;



    public void imprimir() {
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }

    public void calcularValor() {
        if(marca == "HP"){
            preco += preco * 0.30;
        } else if(marca == "IBM"){
            preco += preco * 0.50;
        }
    }

    public int alterarValor(double v){
        if(v > 0){
            preco = v;
            retorno = 1;
            return retorno;
        } else {
            retorno = 0;
            return retorno;
        }
    }
}
