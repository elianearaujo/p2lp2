package musicplayer;

import java.util.ArrayList;

public class Playlist {
	
	private String nome;
	private String desc;
	private int likes;
	
	private ArrayList <Music> musicas;
	
	public Playlist(String nome, String desc) {
		this.nome = nome;
		this.desc = desc;
		
		this.likes = 0;
		musicas = new ArrayList<Music>();
		
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaMusica(String musica, int dur, String art) {
		Music m = new Music(musica,art, "", dur);
		if( !this.musicas.contains(m) ) {
			this.musicas.add(m);
		}
	}

	public void favoritar() {
		this.likes += 1;
	}

	public void removeMusica(int i) {
		if(i >= this.musicas.size() || i < 0) {
			throw new IllegalArgumentException("Índice inválido para Remover musica");
		}
		this.musicas.remove(i);
	}

	public String pegarMusica(int i) {
		if(i >= this.musicas.size() || i < 0) {
			throw new IllegalArgumentException("Índice invalido para Pegar Musica.");
		}
		return this.musicas.get(i).toString();
	}

	@Override
	public String toString() {
		return "Playlist [nome=" + nome + ", desc=" + desc + ", likes=" + likes + ", musicas=" + musicas + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
