package org.rdorado.cartas;

import java.util.Set;

public class DeckBuilder {
	
	Deck currentDeck = new Deck();

	public Deck build() {
		Deck newDeck = new Deck(currentDeck);
		
		Set<String> keys = newDeck.groups.keySet();
		for(String key: keys){
			System.out.println("Value of "+key+" is: "+newDeck.groups.get(key));
		}
				
		return newDeck;
	}

	public void addClass(String name, String... cards) {
		CardGroup cg = currentDeck.addCardGroup(name);
		for(String card : cards){			
		   cg.addCard(card);
		}
	}

	public void addCard(String card) {
		// TODO Auto-generated method stub
		currentDeck.addSingleCard(card);
	}

}
