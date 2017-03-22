package model;

public class Card {

	enum Color {
		RED, YELLOW, GREEN, BLUE
	}
	
	enum Type {
		NUMERIC, SKIP, DRAW_TWO, REVERSE, WILD, WILD_DRAW_FOUR
	}
	
	private Color color;
	private Type type;
	private int value;
	
	public Card(Color color, Type type) {
		this.color = color;
		this.type = type;
		this.value = -1;
	}
	
	public Card(Color color, Type type, int value) {
		this.color = color;
		this.type = type;
		this.value = value;
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
