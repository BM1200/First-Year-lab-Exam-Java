//G00410478 Brendan McShane Lab Exam 2

import java.util.Scanner; //Required for reading input from console
import java.io.*; //Required for writing to a file
import javax.swing.JOptionPane; //Required for displaying GUI popus and input windows
import java.util.Random; //Required for generating a random number

public class McShaneBrendanLabExam2Q1
{
	public static void main(String[] args) throws IOException
	{
		//create instance of Random
		Random randomNumber = new Random();

		//create instance of Scanner
		Scanner keyboard = new Scanner(System.in);

	    //Declaring variables

	    int num1, num2;

        //insert number to begin count from
	    System.out.println("Enter a number to count from: ");
	    num1 = keyboard.nextInt();
	    num2 = num1 + 10;

	    //for loop itterating in steps defined by user
		for(int i = num1; i <= num2; ++i)
		{

		   System.out.println( i);
		}//for


	}//main
}//class