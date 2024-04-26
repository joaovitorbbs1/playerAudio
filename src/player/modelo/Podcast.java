package player.modelo;

public class Podcast extends Audio {
	String host;
	String descricao;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getClassificacao() {
		if (getCurtidas()> 50) {
			return 10;
		} else {
			return 7;
		}
	}
}
