package musicplayer;

public class MyMusicPlayer {
	
	
	
	public static void main(String[] args) {
		Playlist p1 = new Playlist("SoAsAntigas", "Forro");
		Playlist p2 = new Playlist("SoAsNovinhas", "Funk");
		
		p1.adicionaMusica("Espumas ao Vento", 180, "Flávio José");
		p1.adicionaMusica("Espumas2", 100, "Flávio José");
		p1.adicionaMusica("Vento", 190, "Flávio José");
		p1.adicionaMusica("Vento2", 150, "Flávio José");
		
		p1.favoritar();
		p1.removeMusica(1);
		System.out.println(p1.pegarMusica(2));
		
		
		
		
		
		
		
		
		

	}

}
