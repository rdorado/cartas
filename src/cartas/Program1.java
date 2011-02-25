package cartas;

import java.util.ArrayList;

/*
 * Programa que imprime una carta al azar
 * 
 * Hace uso de la clase Carta (Ver documentacion mas abajo)
 */
public class Program1 {

	/*
	 * Selecciona una carta al azar haciendo uso de la clase
	 * Carta y de la funcion estatica random().
	 * 
	 * Luego imprime la carta con la funcion print 
	 * de la carta.
	 */
	public static void main(String[] args) {
		
		Carta carta = Carta.random();
		System.out.print("Su carta es: ");
		carta.print();
				
	}
	
	 
}

