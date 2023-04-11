package kingoftokyo;

public class Jogo {
	
	private int conta;
	private Personagem[] jogadores;
	
	public Jogo(int nJogadores) {
		this.conta = 0;
		this.jogadores = new Personagem[nJogadores];
	}
	
	public void escolherPersonagem(String nome) {
		Personagem p1 = new Personagem(nome);
		this.jogadores[conta] = p1;
		conta ++;
	}
	public String toString() {
		String out = "";
		for(int i = 0; i < conta; i++) {
			out += jogadores[i];
			out += "\n";
		}
		return out;
	}

}
