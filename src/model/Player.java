package model;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> cards;
	
	public Player() {
		this.cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getHand() {
		return this.cards;
	}

}
