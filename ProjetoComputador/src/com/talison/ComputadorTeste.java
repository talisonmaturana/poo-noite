package com.talison;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador computador = new Computador();

        computador.marca = "HP";
        computador.preco = 100.00;
        computador.cor = "Cinza";
        computador.modelo = "PE3d4ad1";
        computador.numeroSerie = 91992191;

        computador.imprimir();
        System.out.println("-----------------------------");

        computador.calcularValor();

        computador.imprimir();
        System.out.println("-----------------------------");

        Computador computador2 = new Computador();

        computador2.marca = "IBM";
        computador2.preco = 100.00;
        computador2.cor = "Preto";
        computador2.modelo = "RE3392ED";
        computador2.numeroSerie = 838282023;

        computador2.imprimir();
        System.out.println("-----------------------------");

        computador2.calcularValor();

        computador2.imprimir();
        System.out.println("-----------------------------");

        computador2.alterarValor(1.3);

        if (computador2.retorno == 1) {
            System.out.println("Valor alterado");
        } else if(computador2.retorno == 0){
            System.out.println("Valor nao alterado");
        }

        computador2.imprimir();
    }
}
