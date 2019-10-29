package com.talison;

import java.time.LocalDate;

public class GerenciarControlePonto {

    public static void main(String[] args) {
	// write your code here
        Gerente gerente = new Gerente();
        gerente.setLogin("talison");
        gerente.setSenha("123");
        gerente.setIdFunc(1);
        gerente.setEmail("tdm@hotmail.com");
        gerente.setDocumento("1234");
        gerente.setNome("Talison Maturana");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setEmail("aaa@hotmail.com");
        secretaria.setDocumento("58585");
        secretaria.setNome("Maria Ap");

        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setEmail("vbbb@hotmail.com");
        operador.setDocumento("99009");
        operador.setNome("Andre");

        RegistroPonto rp = new RegistroPonto();

        //ENTRADA GERENTE
        rp.setFunc(gerente);
        rp.setDataRegistro(LocalDate.now());
        rp.setHoraEntrada(LocalDate.now());
        rp.apresentarRegistroPonto();

        //ENTRADA SECRETARIA
        rp.setFunc(secretaria);
        rp.setDataRegistro(LocalDate.now());
        rp.setHoraEntrada(LocalDate.now());
        rp.apresentarRegistroPonto();

        //ENTRADA OPERADOR
        rp.setFunc(operador);
        rp.setDataRegistro(LocalDate.now());
        rp.setHoraEntrada(LocalDate.now());
        rp.apresentarRegistroPonto();

        //SAIDA GERENTE
        rp.setHoraSaida(LocalDate.now());
        rp.apresentarRegistroPonto();

        //SAIDA SECRETARIA
        rp.setHoraSaida(LocalDate.now());
        rp.apresentarRegistroPonto();

        //SAIDA OPERADOR
        rp.setHoraSaida(LocalDate.now());
        rp.apresentarRegistroPonto();
    }
}
