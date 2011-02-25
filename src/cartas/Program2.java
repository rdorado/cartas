package cartas;

import java.util.ArrayList;

/*
 * Programa que imprime una carta al azar
 * 
 * Hace uso de la clase Carta (Ver documentacion mas abajo)
 */
public class Program2 {

	/*
	 * Selecciona una carta al azar haciendo uso de la clase
	 * Carta y de la funcion estatica random().
	 * 
	 * Luego imprime la carta con la funcion print 
	 * de la carta.
	 */
	public static void main(String[] args) {
		
		Mano manoUsuario = Mano.random(2);
		Mano manoComputador = Mano.random(2);
		
		System.out.println("La mano del usuario es:");
		manoUsuario.print();
		
		System.out.println("\nLa mano del computador es:");
		manoComputador.print();
		
		System.out.println("\nEl ganador es:");
		
	}
	
	 
}

