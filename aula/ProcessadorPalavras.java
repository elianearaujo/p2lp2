package aula;

public class ProcessadorPalavras {

	public static void main(String[] args) {
		//contaPalavras("Na casa do vovô tem uva algodão doce.");
		substituiPalavra("Na casa do vovô tem uva algodão doce.", "vovô");
	}
	
	private static void substituiPalavra(String frase, String palavra) {
		String[] palavras = frase.split(" ");
		StringBuilder out = new StringBuilder();
		
		for(String p: palavras) {
			if(p.equals(palavra)) {
				out.append("*** ");
			} else {
				out.append(p + " ");
			}
		}
		System.out.println(out);		
	}

	private static void contaPalavras(String texto) {
		String[] palavras = texto.split(" ");
		int numPalavras = palavras.length;

		String out = String.format("O seu texto tem %d palavras:", numPalavras);
		System.out.println(out);
		
		for(String p : palavras) {
			System.out.println(p);
		}
		
	}

}
