package player.modelo;

public class Audio {
	private String titulo;
	private int totalReproducoes;
	private int curtidas;
	private int classificacao;

	
	public int getClassificacao() {
		return classificacao;
	}

	public void curtir() {
		this.curtidas++;
	}
	
	public void reproduzir() {
		this.totalReproducoes++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

}