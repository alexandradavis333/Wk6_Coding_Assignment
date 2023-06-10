package gameOfWar;

public class Card {

	int value;
	String name;
	String suit;
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.value = value;
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Current card: ");
		System.out.println(name + " of " + suit);
		System.out.println(value);
	}
	
	public void handDescribe() {
		System.out.println(name + " of " + suit);
	}
}
