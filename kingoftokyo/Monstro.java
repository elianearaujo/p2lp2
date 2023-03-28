package kingoftokyo;

public class Monstro {
	
	private String nome;
	private int vida;
	private int energia;
	private int estrela;
	
	public Monstro(String name) {
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
	public String exibeMonstro() {
		return getNome() + " " + getEnergia() + " " + getVida() + " " + getEstrela();
	}
	
	public void ataque(Monstro vitima, int dano) {
		int novoValor = vitima.getVida() - dano;
		vitima.setVida(novoValor);
	}
	public void cura(int vida) {
		this.setVida(this.getVida() + vida);
	}

	public static void main(String[] args) {
		Monstro j1 = new Monstro("Cyber Kitty");
		Monstro j2 = new Monstro("Space Penguin");
		
		j1.setEnergia(5);
		j2.setEstrela(1);
		
		j1.ataque(j2, 3);
		j2.cura(3);
		
		System.out.println(j1.exibeMonstro());
		System.out.println(j2.exibeMonstro());
	}

}
