package org.rdorado.cartas;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.UUID;

public class Deck {

	public Hashtable<String,CardGroup> groups = new Hashtable<String,CardGroup>();
	public UUID id; // = UUID.randomUUID();		
	
	Deck(){
		addCardGroup("");
	}
	
	public CardGroup addCardGroup(String name) {
		CardGroup cg = new CardGroup();
		groups.put(name, cg);		
		return cg;
	}

	public void addSingleCard(String cardstr) {		
		CardGroup cg = groups.get("");
		cg.addCard(cardstr);
	} 
	
}
