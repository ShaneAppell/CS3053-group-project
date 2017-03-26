package model;

import java.util.Stack;

public class Deck {

	private Stack<Card> cards;
	
	public Deck() {
		cards = new Stack<Card>();
		// TODO: Populate deck with cards
	}
	
	public Stack<Card> getCards() {
		return this.cards;
	}
}
