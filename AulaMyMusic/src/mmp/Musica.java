package mmp;

import java.util.Objects;

public class Musica {
	
	private String titulo;
	private String album;
	private String data;
	private int duracao;
	
	public Musica( String titulo, String album, String data, int duracao) {
		this.titulo = titulo;
		this.album = album;
		this.data = data;
		this.duracao = duracao;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAlbum() {
		return album;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(album, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		return Objects.equals(album, other.album) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Música " + titulo 
				+ "\n album=" + album + "\n data=" + data + "\n duracao=" + duracao;
	}

}

