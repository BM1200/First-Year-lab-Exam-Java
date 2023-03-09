//G00410478 Brendan McShane Lab Exam 2

import java.util.Scanner; //Required for reading input from console
import java.io.*; //Required for writing to a file
import javax.swing.JOptionPane; //Required for displaying GUI popus and input windows
import java.util.Random; //Required for generating a random number

public class McShaneBrendanLabExam2Q4
{
	public static void main(String[] args) throws IOException
	{
		//create instance of Random
		Random randomNumber = new Random();

		//create instance of Scanner
		Scanner keyboard = new Scanner(System.in);

	    //Declaring variables
	    String filename, lines, content;
	    int lineNo;

        //entering filename
	    filename = JOptionPane.showInputDialog("Enter file name:");
	    filename = keyboard.nextLine();

	   PrintWriter outputFile = new PrintWriter("\\LabExam\\"filename);

	   int choice = JOptionPane.showConfirmDialog(null, "Do you want to overwrite file?", "(Click YES to overwrite, NO to append)", JOptionPane.YES_NO_CANCEL_OPTION);

	   if(choice == 0)
	   {
		   lines = JOptionPane.showInputDialog(null, "How many lines of text would you like to add?");
		   lineNo =  Integer.parseInt(lines);

		//for loop for how many lines is needed
		for (int i = 0; i < lineNo; i++)
		  {
		   content = JOptionPane.showInputDialog("Enter content:");
		   outputFile.println(content);
		   JOptionPane.showMessageDialog(null,"Program complete.");
		   }
	   }
	   else if (choice ==1)
	   {
       FileWriter fwriter = new FileWriter(filename, true);
       lines = JOptionPane.showInputDialog(null, "How many lines of text would you like to add?");
	   lineNo =  Integer.parseInt(lines);

	   		//for loop for how many lines is needed
	   		for (int i = 0; i < lineNo; i++)
	   		  {
	   		   content = JOptionPane.showInputDialog("Enter content:");
	   		   PrintWriter appendFile = new PrintWriter("LabExam/", filename);
	   		   appendFile.println(content);
	   		   JOptionPane.showMessageDialog(null,"Program complete.");
		   }

		   }





	}//main
}//class