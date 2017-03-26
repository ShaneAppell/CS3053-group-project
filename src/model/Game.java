package model;

import java.util.ArrayList;
import java.util.Stack;

public class Game {
	
	private static int NUM_INITIAL_CARDS_IN_HAND = 7;
	
	private Deck deck;
	private Stack<Card> discardPile;
	private ArrayList<Player> players;
	private int turn;
	
	public Game(int numPlayers) {
		deck = new Deck();
		discardPile = new Stack<Card>();
		players = new ArrayList<Player>();
		turn = 1;
		initializeGame(numPlayers);
	}
	
	private void initializeGame(int numPlayers) {
		for (int i = 0; i < numPlayers; i++) {
			players.add(new Player());
		}
		deal();
		discardPile.push(deck.getCards().pop());
	}
	
	public void deal() {
		for (Player player : players) {
			for (int i = 0; i < NUM_INITIAL_CARDS_IN_HAND; i++) {
				player.getCards().add(deck.getCards().pop());
			}
		}
	}
	
	public void executeTurn() {
		System.out.println("Player " + turn + "'s turn...");
		
		Player player = players.get(turn - 1);
		Card topPileCard = discardPile.peek();
		
		if (player.canPlayCard(topPileCard)) {
			// Add a card to the discard pile
			Card cardToPlay = player.playCard(topPileCard);
			discardPile.push(cardToPlay);
			System.out.println("Plays card " + cardToPlay + ".");
		} else {
			// Draw a card from the deck
			Card cardToDraw = deck.getCards().pop();
			System.out.println("Draws card " + cardToDraw + ".");
			player.getCards().add(cardToDraw);
		}
		
		if (turn == players.size()) {
			turn = 1;
		} else {
			turn++;
		}
	}
}