package com.java;

public class Conta {
	int numero;
	double saldo;
	
	//atributo está declarado no escopo da classe
	//classe dentro de outra, usar hierarquia
	//conta, tem um cliente, pode criar uma referência dentro
	
	Cliente cliente = new Cliente();
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
}
