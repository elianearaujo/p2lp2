package vivo;

public class Plano {
	private String nome;
	private int bonusMinutos;
	private double valorMinutos;
	private Linha linha;
	
	public Plano(String nome, int bonus, double valor) {
		this.nome = nome;
		this.bonusMinutos= bonus;
		this.valorMinutos = valor;
		this.linha = null;
	}
	
	public void adicionaLinha(Linha l) {
		this.linha = l;
		
		//Exemplo de violação ao principio da ocultação de informação. 
		//Resolva :)
		this.linha.setCredito(this.bonusMinutos);
		this.linha.setCusto(this.valorMinutos);
	}
	
	public String toString() {
		String out = "Plano\n";
		out += this.nome + " " + this.bonusMinutos + " " + this.valorMinutos;
		if(this.linha != null ) {
			out += "\n" + this.linha.getId()  + " " + this.linha.getNumero();
		}
		return out; 
	}

}
