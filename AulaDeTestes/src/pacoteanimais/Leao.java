package pacoteanimais;

import java.util.Objects;

public class Leao {
	
	private String nome;
	private int idade;
	private double peso;
	
	public Leao(String nome, int idade, double peso) {
		if(nome == null || "".equals(nome.trim())) {
			throw new IllegalArgumentException("Nome nulo para o leao.");
		}
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	public String ruge(){
		return "RRUUAAAUU";
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
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
		Leao other = (Leao) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Leao [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}
	
	public static void main(String args[]) {
		String nome = "";
		Leao simba = null;
		
		try {
			simba = new Leao(nome, 11, 150);
		} catch(IllegalArgumentException iae) {
			System.err.println(iae.getMessage());
			simba = new Leao("generico", 11, 150);
		}
		System.out.println(simba.ruge());
		System.out.println(simba);
		
	}
	
	

}
