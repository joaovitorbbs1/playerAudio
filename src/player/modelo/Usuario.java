package player.modelo;

public class Usuario {
	String user;
	Audio[] playlist = new Audio[10];

	
	//metodo para adicionar 1 audio na playlist do usuario com 'for'
	public void alimentarPlaylist(Audio audio) {
		for (int i = 0; 10> i; i++) {
			if (playlist[i] == null) {
				playlist[i] = audio;
				System.out.println(audio.getTitulo()+" foi adicionado na playlist!");
				break;
			} 
		}
		if (playlist[9] != null) {
			System.out.println("Playlist cheia");
		}

	}
}
