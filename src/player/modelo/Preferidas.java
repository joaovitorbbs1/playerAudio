package player.modelo;

public class Preferidas {
	public void favoritas(Audio audio) {
		if (audio.getClassificacao() > 8) {
			System.out.println(audio.getTitulo()+" é sucesso!");
		} else {
			System.out.println(audio.getTitulo()+" é muito bom!");
		}
	}
}
