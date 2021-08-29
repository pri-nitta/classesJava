package com.java;

public class TesteConta {
	public static void main(String[] args) {
		
		//new: gerar um novo objeto em memória
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.50;
		contaCorrente.cliente.nome = "Fulano";
		contaCorrente.cliente.sobrenome = "de Tal";
		contaCorrente.cliente.cpf = 12345566;
		contaCorrente.cliente.idade = 40;

		
		System.out.println("Numero da conta corrente: " +contaCorrente.numero);
		System.out.println("Proprietário da conta corrente: " +contaCorrente.cliente.nome);
		System.out.println(contaCorrente.recuperarSaldo());
		contaCorrente.depositar(500.00);
		System.out.println("Saldo atual: R$" +contaCorrente.saldo);
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 50.00;
		contaPoupanca.cliente.nome = "Fulano";
		contaPoupanca.cliente.sobrenome = "de Tal";
		contaPoupanca.cliente.cpf = 12345566;
		contaPoupanca.cliente.idade = 40;
		
	}

}
