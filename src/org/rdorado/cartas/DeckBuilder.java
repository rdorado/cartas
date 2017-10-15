package org.rdorado.cartas;


public class DeckBuilder {
	
	Deck currentDeck = new Deck();

	public Deck build() {
		return null;
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
