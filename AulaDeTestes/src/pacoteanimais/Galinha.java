package pacoteanimais;

import java.util.Objects;

public class Galinha {
	private String nome;
	private double peso;
	private int producao;

	public Galinha(String nome, double peso, int producao) {
		this.nome = nome;
		this.peso = peso;
		this.producao = producao;
	}
	
	public String fala() {
		return "cocoricó";
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getProducao() {
		return producao;
	}

	public void setProducao(int producao) {
		if(producao < 0) {
			throw new IllegalArgumentException("valor inválido");
		}
		this.producao = producao;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		Galinha other = (Galinha) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Galinha:"
				+ "\nnome=" + nome 
				+ "\npeso=" + peso
				+ "\neggs/day=" + producao ;
	}
	
	

}
