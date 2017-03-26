package model;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> cards;
	
	public Player() {
		this.cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCards() {
		return this.cards;
	}
	
	public boolean canPlayCard(Card topPileCard) {
		for (Card card : cards) {
			if ( card.getType() == Card.Type.WILD
					|| card.getType() == Card.Type.WILD
					|| card.getColor() == topPileCard.getColor()
					|| (card.getType() == Card.Type.NUMERIC 
						&& card.getValue() == topPileCard.getValue())) {
				return true;
			}
		}
		return false;
	}
	
	public Card playCard(Card topPileCard) {
		// TODO: Determine which card to play
		return null;
	}
	
	public int getScore() {
		int score = 0;
		for (Card card : cards) {
			score += card.getValue();
		}
		return score;
	}
}
