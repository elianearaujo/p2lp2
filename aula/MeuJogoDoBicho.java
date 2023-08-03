package aula;

import java.util.*;

public class MeuJogoDoBicho {
	
	public static String[] bichos = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro","Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", "Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
	public static final int TAMANHO = 5;

	public static void main(String[] args) {		
		int[] cartela = new int[TAMANHO];
		fazAposta(cartela);
		Arrays.sort(cartela);
		imprimeAposta(cartela);
	}

	public static void imprimeAposta(int[] cartela) {
		for(int bicho : cartela) {
			//System.out.print(bicho + " ");
			System.out.print(pegaBicho(bicho)+ " ");
		}
		
	}

	public static void fazAposta(int[] cartela) {
		Random rd = new Random();
		for(int i = 0; i < TAMANHO; i++) {
			cartela[i] = rd.nextInt(bichos.length)+1;
		}
	}

	public static String pegaBicho(int numero) {
		
		if( numero > 0 && numero <= 25) {
			return bichos[numero - 1];
		} else {
			return "Numero invalido";
		}
	}

}
