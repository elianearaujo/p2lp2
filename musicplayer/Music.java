package musicplayer;

import java.util.Objects;

public class Music {
	
	private String titulo;
	private String artista;
	private String album;
	private int dur;
	
	public Music(String titulo, String artista, String album, int dur) {
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.dur = dur;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getDur() {
		return dur;
	}

	public void setDur(int dur) {
		this.dur = dur;
	}

	@Override
	public String toString() {
		return "Music [titulo=" + titulo + ", artista=" + artista + ", album=" + album + ", dur=" + dur + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	

}
