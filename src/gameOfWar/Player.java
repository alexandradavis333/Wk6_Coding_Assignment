package gameOfWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = score;
	}
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setCards(List<Card> hand) {
		this.hand = hand;
	}
	
	public void flip(List<Card> hand, int index) {
		this.hand.get(index).handDescribe();
	}
	
	public void draw(Deck deck) {
		hand.add(deck.drawingFromDeck());
	}

	public int incrementScore(int score) {
		return this.score = score + 1;
	}

	public void describe() {
		System.out.println("Player Info: ");
		System.out.println("Name: " + name);
		System.out.println("Player's current hand: ");
		for(Card card:this.hand) {
			card.handDescribe();
		}	
		System.out.println("Score: " + score);
	}

	
}
