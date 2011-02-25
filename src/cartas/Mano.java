package cartas;

import java.util.ArrayList;

/*
 * Clase carta representa una mano
 * 
 * Contiene un arreglo de tipo ArrayList que contiene las cartas
 * 
 * Contiene funciones para 
 * 		- seleccionar una mano al azar
 *      - imprimir la mano
 *      
 *      
 */
public class Mano {
	
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	/**
	 * Seleccionar una mano al azar
	 * 
	 * @param nCartas
	 * @return
	 */
	static Mano random(int nCartas) {
		Mano result = new Mano();
		
		for (int i=0;i<nCartas;i++) {
			result.add(Carta.random());
		}

		return result;
	}

	/**
	 * @param carta
	 */
	private void add(Carta carta) {
		cartas.add(carta);		
	}

	/**
	 * 
	 */
	public void print() {
		for (int i=0;i<cartas.size();i++) {
			cartas.get(i).print();
		}
	}
	
	/**
	 * Calcula el valor de una mano. Verifica si los ases se pueden valer como 1 o como 11.
	 * 
	 * @return
	 */
	public int calcular(){
		int calculo = 0;
		int ases = 0;
		for (Carta carta : cartas) {
			
			/*
			 * Cuenta los ases, y suma el resto de cartas
			 */
			if(carta.numero == 0) ases++;
			else if(carta.numero > 9){
				calculo+=10;
			}
			else{
				calculo+=carta.numero;
			}		
			
			/*
			 * Verifica si los ases se pueden contar como 11 o como 1 
			 */
			if(ases*11+calculo <= 21) calculo+=ases*11;
			else calculo+=ases;
		}
		return calculo;
	}

	/**
	 * Añade una carta a la mano aleatoriamente.
	 */
	public void otraCarta() {
		cartas.add(Carta.random());		
	}
	
}
