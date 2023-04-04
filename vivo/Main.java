package vivo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = ("Ze clovis");
		String numero = ("9999 8686");
		
		Linha l = new Linha(numero, nome);
		
		System.out.println(l);
		
		Plano p = new Plano("Familia", 500, 0.6);
		p.adicionaLinha(l);
		
		System.out.println(p);
		System.out.println(l);
		
	}
	public static String leEntrada(Scanner input, String msg) {
		System.out.println(msg);
		return input.nextLine();
	}

}
