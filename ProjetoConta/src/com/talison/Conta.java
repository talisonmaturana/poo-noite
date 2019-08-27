package com.talison;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;
    public int retorno;

    public int sacar(double v){
        if(saldo < v){
            retorno = 0;
        } else {
            retorno = 1;
        }
        return retorno;
    }

    public void depositar( double v){
        saldo += v;
    }

    public void imprimir() {
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nomeCliente = " + nomeCliente);
    }
}
