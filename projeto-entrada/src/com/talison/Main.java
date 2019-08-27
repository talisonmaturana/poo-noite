package com.talison;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Scanner scan =  new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String name = scan.nextLine();
        System.out.println("Nome inserido: " + name);
        //Exemplos de conversao de tipo
        int a;
        double b;
        System.out.print("Insira um valor inteiro para a: ");
        a = Integer.parseInt(scan.nextLine());
        System.out.print("Insira um valor para b: ");
        b = Double.parseDouble(scan.nextLine());
        System.out.println("a = " + a);
        System.out.println("b = " + b);*/

        Produto p1 = new Produto();
        p1.codigo = 1;
        p1.nome = "Caderno";
        p1.valor = 10.90;

        p1.toString();


    }
}
