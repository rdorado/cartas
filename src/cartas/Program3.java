package cartas;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		Juego juego = new Juego(2);

		boolean cont = true;
		while(cont){
			System.out.println("Su juego actual es: ");
			juego.getMano(1).print();

			System.out.println("Desea otra carta? S/N");
			String line = br.readLine();

			if(line.equals("S")){
				juego.getMano(1).otraCarta();
				int calc = juego.getMano(1).calcular();
				if(calc > 21){
					juego.getMano(1).print();
					System.out.println("Has perdido...");
					cont = false;
				}
			}
			else if(line.equals("N")){
				break;
			}
			else System.out.println("Entrada invalida, las opciones permitidas son S o N.");;
		}

		
		if(cont){
			System.out.println("\nMi juego es:");
			juego.getMano(0).print();

			System.out.println("\nSu juego es:");
			juego.getMano(1).print();

			System.out.println("\nResultado:");
			int calcComp = juego.getMano(0).calcular();
			int calcUser = juego.getMano(1).calcular();
			if( calcComp >= calcUser ){
				System.out.println("Gana el computador");
			}
			else{
				System.out.println("Gana el usuario");
			}

		}
		
		
	}

}
