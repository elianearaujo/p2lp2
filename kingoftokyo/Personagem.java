package kingoftokyo;

public class Personagem {
	
	private String nome;
	private int vida;
	private int energia;
	private int estrela;
	
	public Personagem(String name) {
		this.nome = name;
		this.vida = 10;
		this.energia = 0;
		this.estrela = 0;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getEstrela() {
		return estrela;
	}
	public void setEstrela(int estrela) {
		this.estrela = estrela;
	}
	public String getNome() {
		return nome;
	}
	public String toString() {
		return getNome() + " " + getEnergia() + " " + getVida() + " " + getEstrela();
	}
	
	public void ataque(Personagem vitima, int dano) {
		int novoValor = vitima.getVida() - dano;
		vitima.setVida(novoValor);
	}
	public void cura(int vida) {
		this.setVida(this.getVida() + vida);
	}

}
