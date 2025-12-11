package pacoteanimais;

import java.util.*;

public class Zoo {
	//generics
	private List<Leao> felinos;
	
	public Zoo() {
		felinos = new ArrayList<Leao>();
	}
	public String adicionaLeao(Leao novo) {
		
		if(novo == null) {
			throw new IllegalArgumentException("Leão inválido.");
		}
		if(existeLeao(novo)) {
			return "Leão ja existe";
		}			
		this.felinos.add(novo);
		return "Leão adicionado";
	}
	private boolean existeLeao(Leao novo) {
		for(int i = 0 ; i < this.felinos.size(); i++) {
			if(novo.equals(this.felinos.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public String mostraFelinos() {
		String saida = "";
		
		for(Leao l: felinos) {
			saida += l.toString() + "\n";	
		}
			
		return saida;
	}
	
	
	public static void main(String[] args) {
		
		Zoo bica = new Zoo();
		Leao simba = new Leao("Simba", 18, 150);
		Leao mufasa = new Leao("Mufasa", 20, 100);
		Leao scar = null;

		bica.adicionaLeao(simba);
		bica.adicionaLeao(mufasa);
		try {
			bica.adicionaLeao(scar);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(bica.mostraFelinos());
		
	}
	
	

}
