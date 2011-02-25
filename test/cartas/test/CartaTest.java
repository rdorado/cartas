package cartas.test;

import static org.junit.Assert.*;

import org.junit.Test;
import cartas.Carta;


public class CartaTest {

	@Test
	public void testGeneratePalo() {
		Carta c = Carta.random();
		assertEquals("El test falla", 0, c.getNumero(), 13);		
	}

}
