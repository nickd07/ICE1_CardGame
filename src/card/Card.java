package card;

/**
 * Student Name : Nick Damor 
 * Student Number: 991781470
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (Clubs, Hearts, Spades, Diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 */
public class Card {

    private String suit; // Clubs, Spades, Diamonds, Hearts
    private int value;   // 1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Override the toString() method to return the card in a readable format
     * like "7 of Spades", "Ace of Hearts", "King of Clubs", etc.
     */
    @Override
    public String toString() {
        // Convert the numeric value to a human-readable string
        String cardValue;
        switch (value) {
            case 1:
                cardValue = "Ace";
                break;
            case 11:
                cardValue = "Jack";
                break;
            case 12:
                cardValue = "Queen";
                break;
            case 13:
                cardValue = "King";
                break;
            default:
                cardValue = String.valueOf(value);
                break;
        }
        return cardValue + " of " + suit;
    }
}
