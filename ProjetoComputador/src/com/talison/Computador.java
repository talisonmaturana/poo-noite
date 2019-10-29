package com.talison;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;
    public int retorno;



    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor " + cor);
        System.out.println("Modelo " + modelo);
        System.out.println("Numero de serie: " + numeroSerie);
        System.out.println("Preco: " + preco);
    }

    public void calcularValor() {
        if(marca == "HP"){
            preco += preco * 0.30;
            /*
            * Outra forma de fazer...
            * preco *= 1.3
            */
        }
        if(marca == "IBM"){
            preco += preco * 0.50;
            /* Outra forma de fazer...
             * preco *= 1.5
             */
        }
    }

    public int alterarValor(double v){
        if(v > 0){
            preco = v;
            retorno = 1;
        } else {
            retorno = 0;
        }
        return retorno;
    }
}
