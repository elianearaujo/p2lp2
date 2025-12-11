package pacoteanimais;

import java.util.Objects;

public class Marreco {
	private String nome;
	private double peso;
	private int eggsday;
	
	public Marreco(String nome, double peso, int eggsday) {
		this.nome = nome;
		this.peso = peso;
		this.eggsday = eggsday;
	}
	public String fala() {
		return "có có";
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEggsday() {
		return eggsday;
	}

	public void setEggsday(int eggsday) {
		if(eggsday <= 0) {
			throw new IllegalArgumentException("valor invalido");
		}
		this.eggsday = eggsday;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eggsday, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marreco other = (Marreco) obj;
		return eggsday == other.eggsday && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Galinha \n"
				+ "nome=" + nome 
				+ ", peso=" + peso 
				+ ", Ovos por dia =" + eggsday;
		
	}
	
	

}
