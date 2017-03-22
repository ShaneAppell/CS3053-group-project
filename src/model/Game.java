package model;

import java.util.ArrayList;

public class Game {
	
	private Deck deck;
	private ArrayList<Player> players;
	private int turn;
	
	public Game() {
		this.deck = new Deck();
		this.players = new ArrayList<Player>();
		this.turn = 0;
	}
}
