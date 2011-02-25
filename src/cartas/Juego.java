package cartas;

import java.util.ArrayList;

public class Juego {

	ArrayList<Mano> jugadores;
	
	/**
	 * @param nJug Numero de jugadores
	 */
	public Juego(int nJug) {
		jugadores = new ArrayList<Mano>();
		for (int j=0;j<nJug;j++) {
			jugadores.add(Mano.random(2));
		}
	}

	public Mano getMano(int i) {
		return jugadores.get(i);	
	}	
	
	
}
