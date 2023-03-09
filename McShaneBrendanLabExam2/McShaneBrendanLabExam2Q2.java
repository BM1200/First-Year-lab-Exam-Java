//G00410478 Brendan McShane Lab Exam 2

import java.util.Scanner; //Required for reading input from console
import java.io.*; //Required for writing to a file
import javax.swing.JOptionPane; //Required for displaying GUI popus and input windows
import java.util.Random; //Required for generating a random number

public class McShaneBrendanLabExam2Q2
{
	public static void main(String[] args) throws IOException
	{
		//create instance of Random
		Random randomNumber = new Random();

		//create instance of Scanner
		Scanner keyboard = new Scanner(System.in);

	    //Declaring variables
	    double dollar, conver;
	    String dollString;
	    int choice;



        JOptionPane.showMessageDialog(null,"Welcome to the Java Conversion Program.");

      do {

        dollString = JOptionPane.showInputDialog("Enter dollar amount to be converted:");
        dollar =  Double.parseDouble(dollString);
        conver = dollar * 0.88;
        choice = JOptionPane.showConfirmDialog(null, dollar + " dollars is " + conver + " euros.\n\n","Do you want to perform another conversion?", JOptionPane.YES_NO_OPTION);


	}while (choice == JOptionPane.YES_OPTION);



	}//main
}//class