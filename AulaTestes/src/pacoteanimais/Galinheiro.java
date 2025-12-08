package pacoteanimais;

import java.util.ArrayList;

public class Galinheiro {

	private ArrayList<Galinha> galinhas;
	
	public Galinheiro() {
		galinhas = new ArrayList<>();
	}
	
	public String adicionaGalinha(Galinha nova) {
		
		if( nova == null) {
			throw new IllegalArgumentException("Galinha inválida");
		}
			
		if(existeGalinha(nova)) {
			return "Galinha existente";
		}
		galinhas.add(nova);
		return "Galinha adicionada";
		
	}

	private boolean existeGalinha(Galinha nova) {
		
		for( Galinha g : galinhas) {
			if(g.equals(nova)) {
				return true;
			}
		}
		return false;
	}
	
	
	public String mostra() {
		StringBuffer out = new StringBuffer();
		
		galinhas.forEach(g->{ out.append(g.toString() + "\n\n");});
		
//		for(int i = 0; i< galinhas.size(); i++) {
//			out += galinhas.get(i).toString();
//		}
//		System.out.println(galinhas.size());

		return out.toString();
			
	}
	
	public static void main (String[] args) {
		Galinha g1 = new Galinha("Fatima", 5, 2);
		Galinha g2 = new Galinha("Rosa", 4.5, 1);
		Galinha g3 = null;
		
		Galinheiro ga = new Galinheiro();

		ga.adicionaGalinha(g1);
		ga.adicionaGalinha(g2);
		//ga.adicionaGalinha(g3);
		
		System.out.println(ga.mostra());

	}
	
}
