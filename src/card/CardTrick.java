/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * Student NAme: Nick Damor
 * Student Number : 991781470
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        // Fill magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1); // random number between 1 and 13
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // random suit (0-3)
            magicHand[i] = c; // add card to magicHand array
        }
        
        // Asking user for their card
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();
        
        Card userCard = new Card();
        userCard.setValue(userValue);  // set user's card value
        userCard.setSuit(userSuit);  // set user's card suit
        
        // Search magicHand for the user's card
        boolean found = false;
        for (Card c : magicHand)
        {
            if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;  // card found
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
        
        // Add a lucky card (2 of Clubs)
        Card luckyCard = new Card();
        luckyCard.setValue(2);  // hardcoded lucky card value
        luckyCard.setSuit("Clubs");  // hardcoded lucky card suit
        
        // Check if lucky card is in magic hand
        boolean luckyFound = false;
        for (Card c : magicHand)
        {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyFound = true;
                break;
            }
        }
        
        // Report if lucky card was found
        if (luckyFound) {
            System.out.println("Lucky card (2 of Clubs) found in the magic hand!");
        } else {
            System.out.println("Lucky card not found in the magic hand.");
        }
        
        // Print the magic hand (optional)
        System.out.println("Magic Hand contains:");
        for (Card c : magicHand)
        {
            System.out.println(c);  // print each card in magic hand
        }
    }
}
