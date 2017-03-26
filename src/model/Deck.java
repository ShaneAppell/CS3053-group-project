package model;

import java.util.Collections;
import java.util.Stack;

public class Deck {

	private Stack<Card> cards;
	
	public Deck() {
		cards = new Stack<Card>();
		// TODO: Populate deck with cards
		populateDeck();
		Collections.shuffle(cards);
	}
	
	private void populateDeck() {
		
		Card.Color[] colors = {
				Card.Color.RED, 
				Card.Color.YELLOW, 
				Card.Color.GREEN, 
				Card.Color.BLUE
		};
		
		// Add numeric cards
		for (int i = 0; i <= 9; i++) {
			int j;
			if (i == 0) {
				j = 1; // Add one of each color for value 0
			} else {
				j = 0; // Add two of each color for values 1-9
			}
			
			while (j < 2) {
				for (Card.Color color : colors) {
					cards.add(new Card(color, Card.Type.NUMERIC, i));
				}
				j++;
			}
		}
		
		// Add special cards
		Card.Type[] types = {
				Card.Type.SKIP, 
				Card.Type.REVERSE, 
				Card.Type.DRAW_TWO,
				Card.Type.WILD, 
				Card.Type.WILD_DRAW_FOUR
		};
		for (Card.Type type : types) {
			if (type == Card.Type.WILD || type == Card.Type.WILD_DRAW_FOUR) {
				// Add four of each wild and wild draw four types
				for (int i = 0; i < 4; i++) {
					cards.add(new Card(Card.Color.NONE, type));
				}
			} else { // Add two of each color for special types
				for (int i = 0; i < 2; i++) {
					for (Card.Color color : colors) {
						cards.add(new Card(color, type));
					}
				}
			}
		}
	}
	
	public Stack<Card> getCards() {
		return this.cards;
	}
}
