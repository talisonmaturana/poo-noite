package com.talison;

public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo() {
        if(idade >= 6 && idade <= 10) {
            equipe = 'A';
        } else if (idade >= 11 && idade <= 20) {
            equipe = 'B';
        } else if (idade >= 21) {
            equipe = 'C';
        }
    }
}
