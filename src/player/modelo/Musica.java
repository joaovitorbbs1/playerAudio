package player.modelo;

public class Musica extends Audio {
	String nomeInterprete;
	String nomeProdutor;
	
	
	public String getNomeInterprete() {
		return nomeInterprete;
	}
	public void setNomeInterprete(String nomeInterprete) {
		this.nomeInterprete = nomeInterprete;
	}
	public String getNomeProdutor() {
		return nomeProdutor;
	}
	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}
	
	public int getClassificacao() {
		if (getTotalReproducoes()> 200) {
			return 10;
		} else if(getTotalReproducoes()> 100 && getTotalReproducoes() < 199) {
			return 7;
		} else {
			return 5;
		}
	}
}
