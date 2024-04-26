package player.principal;

import player.modelo.Musica;
import player.modelo.Podcast;
import player.modelo.Preferidas;
import player.modelo.Usuario;

public class Principal {
	public static void main(String[] args) {
		Usuario vitor = new Usuario();
		Preferidas avaliar = new Preferidas();
		
		Musica cancao = new Musica();
		cancao.setTitulo("All I Need");
		
		//simular reproduções
		for (int i = 0; 300 > i; i++) {
			cancao.reproduzir();
		}

		//simular curtidas
		for (int i = 0; 30 > i; i++) {
			cancao.curtir();
		}


		Podcast podSer = new Podcast();
		podSer.setTitulo("PodSer");

		//simular reproduções
		for (int i = 0; 80 > i; i++) {
			podSer.reproduzir();
		}

		//simular curtidas
		for (int i = 0; 10 > i; i++) {
			podSer.curtir();
		}
		
		avaliar.favoritas(podSer);
		avaliar.favoritas(cancao);
		
		vitor.alimentarPlaylist(cancao);
		vitor.alimentarPlaylist(podSer);
		
	}

}
