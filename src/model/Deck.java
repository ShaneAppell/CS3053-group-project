package model;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>(108);
	}
	
	public ArrayList<Card> getCards() {
		return this.cards;
	}
}
