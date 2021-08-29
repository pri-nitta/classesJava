package com.java;

public class TesteContaConstrutor {

	public static void main(String[] args) {
		
		Conta cc = new Conta(0654);
		//se criar o construtor, não precisa fazer o metodo para setar os valores
		
		System.out.println(cc.recuperarSaldo());


	}

}
