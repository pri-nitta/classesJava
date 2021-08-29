package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		Conta cc = new Conta(0123, 45678, 100.0);
		System.out.print("AG: " + cc.agencia);
		System.out.print(" CP: " + cc.numero);
		System.out.print(" Saldo: " +cc.consultar());
		cc.sacar(25.0);
		System.out.println("Novo saldo: " +cc.saldo);
		
		Conta cp = new Conta();
		cp.agencia = 0123;
		cp.numero = 78945;
		cp.depositar(200.5);
		
		System.out.print("AG: " + cp.agencia);
		System.out.print(" CP: " + cp.numero);
		System.out.print(" Saldo: " + cp.saldo);

		
	}

}
