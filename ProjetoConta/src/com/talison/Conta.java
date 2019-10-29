package com.talison;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public int sacar(double v){
        if(v <= saldo) {
            saldo -= v;
            return 1;
        }
        return 0;
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
