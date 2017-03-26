package model;

public class Card {

	public enum Color {
		RED, YELLOW, GREEN, BLUE, NONE
	}
	
	public enum Type {
		NUMERIC, SKIP, DRAW_TWO, REVERSE, WILD, WILD_DRAW_FOUR
	}
	
	private Color color;
	private Type type;
	private int value;
	
	public Card(Color color, Type type) {
		this.color = color;
		this.type = type;
		switch (type) {
			case SKIP:
			case DRAW_TWO:
			case REVERSE:
				value = 20;
			case WILD:
			case WILD_DRAW_FOUR:
				value = 50;
				this.color = Color.NONE;
			case NUMERIC:
				System.out.println("Attempt to instantiate numeric card without providing value");
		}
	}
	
	public Card(Color color, Type type, int value) {
		this.color = color;
		this.type = type;
		this.value = value;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		String result = this.color.toString() + this.type.toString();
		if (type == Type.NUMERIC) {
			result += this.value;
		}
		return result;
	}
}
