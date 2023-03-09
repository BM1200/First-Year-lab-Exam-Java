//G00410478 Brendan McShane Lab Exam 2

import java.util.Scanner; //Required for reading input from console
import java.io.*; //Required for writing to a file
import javax.swing.JOptionPane; //Required for displaying GUI popus and input windows
import java.util.Random; //Required for generating a random number

public class McShaneBrendanLabExam2Q3
{
	public static void main(String[] args) throws IOException
	{
		//create instance of Random
		Random randomNumber = new Random();

		//create instance of Scanner
		Scanner keyboard = new Scanner(System.in);

	    //Declaring variables
	    int cardNo, suit;


	    System.out.println("This program will deal a card from a deck of 52 cards.");
	    cardNo = randomNumber.nextInt(13) + 1;
	    suit = randomNumber.nextInt(4) + 1;


        //create switch statement for the suit of card
	    switch(suit)
	    {

	      case 1:
             //create if/else statement to see if the card is a heart/club/spade/diamond
			 if (cardNo ==1)

			 {
			 System.out.println("Your card is the Ace of Hearts");
			 }

			  else if (cardNo ==11)
			 	 {
			 System.out.println("Your card is the Jack of Hearts");
					 }

			   else if (cardNo ==12)
				{
				 System.out.println("Your card is the Queen of Hearts");
				 }

			  else if (cardNo ==13)
					 			 	 {
					 System.out.println("Your card is the King of Hearts");
					 }
			 else
			 {
				 System.out.println("Your card is the " + cardNo + " of Hearts");
				 }
			 	break;







	      case 2:

	 if (cardNo ==1)

				 {
				 System.out.println("Your card is the Ace of Diamonds");
				 }

				  else if (cardNo ==11)
				 	 {
				 System.out.println("Your card is the Jack of Diamonds");
						 }

				   else if (cardNo ==12)
					{
					 System.out.println("Your card is the Queen of Diamonds");
					 }

				  else if (cardNo ==13)
						 			 	 {
						 System.out.println("Your card is the King of Diamonds");
						 }
				 else
				 {
					 System.out.println("Your card is the " + cardNo + " of Diamonds");
				 }
			  break;

		  case 3:
		 if (cardNo ==1)

					 {
		  System.out.println("Your card is the Ace of Clubs");
					 }

					  else if (cardNo ==11)
					 	 {
					 System.out.println("Your card is the Jack of Clubs");
							 }

					   else if (cardNo ==12)
						{
						 System.out.println("Your card is the Queen of Clubs");
						 }

					  else if (cardNo ==13)
							 			 	 {
							 System.out.println("Your card is the King of Clubs");
							 }
					 else
					 {
						 System.out.println("Your card is the " + cardNo + " of Clubs");
				 }
			  break;

		  case 4:
			 if (cardNo ==1)

						 {
						 System.out.println("Your card is the Ace of Spades");
						 }

						  else if (cardNo ==11)
						 	 {
						 System.out.println("Your card is the Jack of Spades");
								 }

						   else if (cardNo ==12)
							{
							 System.out.println("Your card is the Queen of Spades");
							 }

						  else if (cardNo ==13)
								 			 	 {
								 System.out.println("Your card is the King of Spades");
								 }
						 else
						 {
							 System.out.println("Your card is the " + cardNo + " of Spades");
				 }
			break;
		}
}
}





