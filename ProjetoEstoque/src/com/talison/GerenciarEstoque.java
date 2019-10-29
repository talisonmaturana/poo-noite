package com.talison;

import java.util.Scanner;

public class GerenciarEstoque {

    Produto produto = new Produto();

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        GerenciarEstoque ge = new GerenciarEstoque();

        int opc = 0;

        do{
            System.out.println("MENU");
            System.out.println("1.. Cadastrar Produto");
            System.out.println("2.. Entrada em Estoque");
            System.out.println("3.. Saida do Estoque");
            System.out.println("4.. Consultar estoque do produto");
            System.out.println("9.. Sair");

            switch (opc){
                case 1:
                    ge.execCadastrarProduto();
                    break;
                case 2:
                    ge.entrarProduto();
                    break;
                case 3:
                    ge.sairProduto();
                    break;
                case 4:
                    ge.consutarProduto();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opc != 9);

    }

    public void entrarProduto() {

    }

    public void sairProduto() {
        Scanner scan = new Scanner(System.in);
        int qtd;
    }

    public void consutarProduto() {
        produto.imprimir();
    }

    public void execCadastrarProduto() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o id do produto: ");
        produto.id = Integer.parseInt(scan.nextLine());
        System.out.print("Digite o nome do produto: ");

        System.out.print("Digite o valor do produto: ");
    }
}
