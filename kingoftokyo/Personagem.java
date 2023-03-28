package kingoftokyo;

public class Personagem {
	
	private int energy;
	private int life;
	private int succes;
	private String name;
	
	public String getName() {
		return name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getSucces() {
		return succes;
	}

	public void setSucces(int succes) {
		this.succes = succes;
	}

	public Personagem(String name) {
		this.name = name;
		energy = 0;
		life = 10;
		succes = 0;
	}
	public String toString() {
		return this.getName()+ " " + this.getLife() + " " + this.getSucces() +" " + this.getEnergy();
	}
	public void attack(Personagem p, int patadas) {
		int dano = p.getLife() - patadas;
		p.setLife(dano);
	}

	public static void main(String[] args) {
		Personagem p1 = new Personagem("Cyber Kitty");
		Personagem p2 = new Personagem("The King");
				
		p1.attack(p2, 5);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());	
	}
}
