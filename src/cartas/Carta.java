package cartas;

/*
 * Clase carta representa una carta
 * 
 * Contiene un arreglo de tipo String para definir los
 * palos
 * 
 * Contiene funciones para 
 * 		- seleccionar una carta al azar
 *      - imprimir la carta
 *      
 *      
 */
public class Carta{
	int palo;
	int numero;	

	String[] PALO = {"Corazones", "Treboles", "Espadas", "Picas"};
	String[] NUMERO = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	/*
	 * Selecciona una carta al azar.
	 * 
	 * Funcion estatica debe ser llamada Carta.random();
	 */
	public static Carta random(){
		Carta resp = new Carta();
		resp.palo = (int)(Math.random()*4);
		resp.numero = (int)(Math.random()*13);
		return resp;
	}

	/*
	 * Imprime la carta
	 */
	public void print() {		
		System.out.println(NUMERO[numero]+" de "+PALO[palo]);		
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
