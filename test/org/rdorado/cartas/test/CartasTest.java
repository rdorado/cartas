package org.rdorado.cartas.test;

import org.rdorado.cartas.Deck;
import org.rdorado.cartas.DeckBuilder;

public class CartasTest {

	public static void main(String[] args) {
				
		DeckBuilder builder = new DeckBuilder();
		builder.addClass("Hearts","A","2","3","4","5","6","7","8","9","10","J","Q","K");
		builder.addCard("Joker:2");
		
		Deck deck1 = builder.build();

		deck1.shuffle();
		
		Card c1 = deck1.getNext();
		Card c2 = deck1.getNext();
		
		deck1.shuffle();
		Card c3 = deck1.getNext();
		
		deck1.reset();
		
	}

}
