package com.talison;

import java.util.Scanner;

public class ContaTeste {

    Conta cc = new Conta();

    public static void main(String[] args) {
	// write your code here
        ContaTeste ct = new ContaTeste();
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("MENU");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Sacar");
            System.out.println("3.. Depositar");
            System.out.println("4.. Consultar");
            System.out.println("9.. Sair");
            System.out.print("Digite sua opção: ");
            opc = Integer.parseInt(scan.nextLine());
            switch (opc){
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execSacar();
                    break;
                case 3:
                    ct.execDepositar();
                    break;
                case 4:
                    ct.execConsultar();
            }
        }while (opc != 9);
    }

    public void execCadastrar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDigite o numero da conta: ");
        cc.conta = scan.nextLine();
        System.out.print("\nDigite o nome da agencia: ");
        cc.agencia = scan.nextLine();
        System.out.print("\nDigite o nome do cliente: ");
        cc.nomeCliente= scan.nextLine();
        System.out.println("Cadastrado com sucesso");
    }

    public void execConsultar(){
        System.out.println("Dados da conta");
        cc.imprimir();
    }

    public void execSacar() {
        double valor;
        Scanner scan  = new Scanner(System.in);
        System.out.print("Digite o valor para saque: ");
        valor = Double.parseDouble(scan.nextLine());
        int r = cc.sacar(valor);
        if(r == 1) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Sem saldo para executar a operacao");
        }
    }

    public void execDepositar() {
        double valor;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor para deposito: ");
        valor = Double.parseDouble(scan.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }
}
