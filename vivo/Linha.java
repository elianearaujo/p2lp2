package vivo;

public class Linha {
	
	private String numero;
	private String id;
	private int credito;
	private double custo;
	
	public Linha(String numero, String id) {
		this.numero = numero;
		this.id = id;
		this.credito = 0;
		this.custo = 1.2;
	}

	public String getNumero() {
		return numero;
	}

	public String getId() {
		return id;
	}

	public int getCredito() {
		return credito;
	}

	public double getCusto() {
		return custo;
	}
	
	public void adicionaCredito(double valor) {
		this.credito += valor/this.custo;
	}
	public int ligar(int minutos) {
		if(minutos > this.credito) {
			return -1;
		}
		this.credito -=minutos;
		return this.credito;
	}
	
	public String toString() {
		return this.id + " " + this.numero + " " + this.credito + " " + this.custo;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

}
