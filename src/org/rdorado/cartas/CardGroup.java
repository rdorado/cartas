package org.rdorado.cartas;

import java.util.Hashtable;

public class CardGroup {

	Hashtable<String, Integer> cardQuantity = new Hashtable<String, Integer>();
	
	public void addCard(String cardstr) {
		String cardname = cardstr;
		int quantity = 1;
		if(cardstr.contains(":")){
			String[] splits = cardstr.split(":");
			cardname = splits[0];			
			quantity = Integer.parseInt(splits[0]);
		}
		cardQuantity.put(cardname, quantity);
	}

	//public Hashtable<String,Integer> cards = new Hashtable<>
	
}
