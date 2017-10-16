package org.rdorado.cartas;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.util.UUID;

public class Deck {

	public UUID id; // = UUID.randomUUID();
	
	public Hashtable<String,CardGroup> groups = new Hashtable<String,CardGroup>();		
	public ArrayList<Card> available = new ArrayList<Card>();
	public ArrayList<Card> used = new ArrayList<Card>();
	
	Deck(){
		addCardGroup("");
	}
	
	public Deck(Deck deck) {
		groups = new Hashtable<String,CardGroup>();
		Set<String> keys = deck.groups.keySet();
		for(String key: keys){
			groups.put(key, new CardGroup(groups.get(key)));
		}		
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
