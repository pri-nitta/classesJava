package com.java;

public class Conta {
	int numero;
	int agencia;
	double saldo;
	
	//atributo está declarado no escopo da classe
	//classe dentro de outra, usar hierarquia
	//conta, tem um cliente, pode criar uma referência dentro
	
	Cliente cliente = new Cliente();
	
	public Conta () {
	}
	
	public Conta (int numero) {
		this.numero = numero;
		this.saldo = 0;
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	//sobrecarga de metodos (assinatura nome mais tipo diferentes! tipos de parametros diferentes)
	
	public void retirar(double valor) {
		saldo = saldo - valor;
	}
	
	public void retirar(double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	//this - referencia ao atributo agencia daquela conta
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
