package com.talison;

public class AcampamentoTeste {

    public static void main(String[] args) {

        Acampamento membro = new Acampamento();

        membro.nome = "Talison";
        membro.idade = 19;

        membro.imprimir();

        membro.separarGrupo();

        membro.imprimir();
    }
}
