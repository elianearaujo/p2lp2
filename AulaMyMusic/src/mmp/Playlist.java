package mmp;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	private String titulo;
	private String descricao;
	private int likes;
	private List<Musica> musicas;
	
	public Playlist(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.likes = 0;
		this.musicas = new ArrayList<Musica>();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getLikes() {
		return likes;
	}
	
	public void darLike() {
		this.likes++;		
	}
	
	public String adicionaMusica(String titulo, String album, String data, int duracao) {
		Musica nova = new Musica(titulo, album, data, duracao);
		if (existeMusica(nova)) {
			return "Musica já adicionada";
		}
		this.musicas.add(nova);
		return "Musica adicionada com sucesso!";
	}
	
	public String removeMusica(int posicao) {
		if(posicao > this.musicas.size() || posicao < 1 ) {
			return "Posição não existe na playlist";
		}
		this.musicas.remove(posicao-1);
		return "Música removida da playlist";
	}
	
	
	private boolean existeMusica(Musica nova) {
		for (Musica n: this.musicas) {
			if (nova.equals(n)) {
				return true;
			}
		}
		return false;

	}
}