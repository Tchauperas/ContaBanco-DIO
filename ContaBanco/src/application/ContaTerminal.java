package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaTerminal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do cliente: ");
		String name = sc.nextLine();
		System.out.print("Numero da conta: ");
		int num = sc.nextInt();
		System.out.print("Agência: ");
		sc.nextLine();
		String agc = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		Conta ct = new Conta(num, agc, name, saldo);
		System.out.println(ct.toString());
		
		sc.close();
	}
}