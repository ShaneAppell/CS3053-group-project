package model;

import java.util.ArrayList;
import java.util.Stack;

public class Game {
	
	private Deck deck;
	private Stack<Card> discardPile;
	private ArrayList<Player> players;
	private int turn;
	
	public Game() {
		this.deck = new Deck();
		this.discardPile = new Stack<Card>();
		this.players = new ArrayList<Player>();
		this.turn = 0;
	}
	
	public void executeTurn() {
		Player player = players.get(turn);
		Card topPileCard = discardPile.peek();
		
		if (player.canPlayCard(topPileCard)) {
			// Add a card to the discard pile
			discardPile.push(player.playCard(topPileCard));
		} else {
			// Draw a card from the deck
			player.getCards().add(deck.getCards().pop());
		}
	}
}