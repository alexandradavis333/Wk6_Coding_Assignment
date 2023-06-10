package gameOfWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
List<Card> cards = new ArrayList<Card>();
	
	
	Deck () {
		String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		for(String suit:suits) {
			int value = 2;
			for (String name:numbers) {
				cards.add(new Card(name, suit, value));		
				value++;
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void describe() {
		for(Card card:this.cards) {
			card.describe();
		}		
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card drawingFromDeck() {
		Card cardDrawn = this.cards.remove(0);
		return cardDrawn;
	}
}
