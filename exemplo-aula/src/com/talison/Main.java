package com.talison;

public class Main {

    public static void main(String[] args) {
	    Conta conta1, conta2;
	    conta1 = new Conta();
	    conta2 = new Conta();
	    conta1.nome = "Ze";
	    conta2.nome = "Chico";
        System.out.println("Nome da conta 1: " + conta1.nome);
        System.out.println("Nome da conta 2: " + conta2.nome);

    }
}
