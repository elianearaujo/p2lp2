package pacoteanimais;

import java.util.Objects;

public class Gato {
	
	private String nome;
	private int idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		
		if("".equals(nome.trim())|| nome == null) {
			throw new IllegalArgumentException("Nome nulo para o gato!");			
		}
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String mia() {
		
		return "miau";
	}
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
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
		Gato other = (Gato) obj;
		return Objects.equals(nome, other.nome);
	}
	
	public static void main(String[] args) {
		String nome="";
		Gato mingau;
		try {
			mingau = new Gato(nome, 2, "branco");
		}catch(IllegalArgumentException iae ){
			System.err.println(iae.getMessage());
			mingau = new Gato("generico", 2, "branco");
			
		}
		System.out.println(mingau);
		
	}

}
