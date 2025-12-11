package mmp;

import java.util.ArrayList;
import java.util.List;

public class MyMusicPlayer {
	
	private List<Playlist> lindasMusicas;
	
	
	public MyMusicPlayer() {
		this.lindasMusicas = new ArrayList<>();
	}

	public void adicionarPlaylist(String titulo, String descricao) {
		Playlist nova = new Playlist(titulo, descricao);
		this.lindasMusicas.add(nova);
	}
	
	public void adicionaMusicaPlaylist(int pos, String titulo, String album, String data, int duracao) {
		this.lindasMusicas.get(pos).adicionaMusica(titulo, album, data, duracao);
	}
	
	public static void main(String[] args) {
		
		MyMusicPlayer mmp = new MyMusicPlayer();
		mmp.adicionarPlaylist("Para Animar os Animos", "Musicas animadas");
		mmp.adicionaMusicaPlaylist(0, "Happy", "Happy.vol1", "2025", 342);
		

	}

}
