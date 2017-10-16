package org.rdorado.cartas;

import java.util.Hashtable;
import java.util.Set;

public class CardGroup {

	Hashtable<String, Integer> cardQuantity = new Hashtable<String, Integer>();
	
	public CardGroup(){ }
	
	public CardGroup(CardGroup cardGroup) {
		Set<String> keys = cardGroup.cardQuantity.keySet();
		for(String key: keys){
			cardQuantity.put(key, new Integer(cardGroup.cardQuantity.get(key)));
		}	
	}

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
