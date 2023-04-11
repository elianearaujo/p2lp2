package kingoftokyo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nJogadores = Integer.parseInt(leEntrada("Quantos jogadores? ", sc));
		
		//Iniciando o Jogo
		Jogo koT = new Jogo(nJogadores);
			
		int i = 0;
		String nome ="";
		while(i < nJogadores) {
			i+=1;
			nome = leEntrada("Informe nome de personagem " + i , sc);
			koT.escolherPersonagem(nome);	
		}	
		
		System.out.println(koT);
	}

	private static String leEntrada(String msg, Scanner sc) {
		System.out.println(msg);
		return sc.nextLine();
	}
}
	
