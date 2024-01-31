package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

  public static void main(String[] args) {

    Card[] hand = new Card[7];
    Random rand = new Random();
    
    for (int i = 0; i < hand.length; i++) {
      Card card = new Card();  
      card.setValue(rand.nextInt(13) + 1);
      card.setSuit(Card.SUITS[rand.nextInt(4)]);    
      hand[i] = card;
    }
    
    
    // Create user card
    System.out.println("Pick a card value between 1 and 13");
    int value = new Scanner(System.in).nextInt();
    
    System.out.println("Enter suit: 1. Hearts 2. Diamonds 3. Spades 4. Clubs"); 
    int suit = new Scanner(System.in).nextInt();
    
    Card userCard = new Card();
    userCard.setValue(value);
    userCard.setSuit(Card.SUITS[suit]);
    
    
    boolean match = false;
    for(Card c : hand) {
      if(c.getValue() == userCard.getValue() && c.getSuit()== (userCard.getSuit())) {
        match = true;
        break;  
      }
    }
    
    
    if(match) {
      printInfo();
    }
    else{
        System.out.println("Better luck next time!!!!");
    }
  }
  
  /**
  * A simple method to print out personal information. Follow the instructions to  
  * replace this information with your own.
  * @author Paul Bonenfant Jan 2022
  */
  // I am done
  private static void printInfo() {
    
    System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Aryan Dhir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();

    // Add your own info here
    
  }

}
