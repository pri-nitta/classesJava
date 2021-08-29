package br.com.fiap.banco;

public class Conta {
	
	int agencia;
	int numero;
	double saldo;
	
    //construtor padrão	
	public Conta() {
		
	}
	
	//construtor de classe
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public double consultar() {
		return this.saldo;
	}
	
}
