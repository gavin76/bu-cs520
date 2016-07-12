package cs520.hw2.part1;

/* Name: Gavin Chan
 * CS520 Assignment 2 Part 1
 * 
 * A "procedural style" program to compare the tuition costs of two courses
 */

import javax.swing.JOptionPane;

public class TuitionProceduralStyle {

	public static int getIntInput(String messagePrompt)
	{
		String input = JOptionPane.showInputDialog(messagePrompt);
		return Integer.parseInt(input);
	}
	
	public static int computeTuition(int numCredits, int costPerCredit)
	{
		return (numCredits * costPerCredit);
	}

	public static void displayFee(String courseName, int tuitionFee)
	{
		JOptionPane.showMessageDialog(null, courseName + ":\nTuition Fee is "
				+ tuitionFee + " dollars");
	}
		
	public static void main(String[] args) {
		
		// Get values for the first course via user prompt
		String firstName = JOptionPane.showInputDialog("Enter name of the first course:");
		
		int firstNumCredits = getIntInput("Enter number of credits for " + firstName + " (in dollars):");
		
		int firstCostPerCredit = getIntInput("Enter cost per credit for " + firstName + " (in dollars):");
		
		// Get values for the second course via user prompt
		String secondName = JOptionPane.showInputDialog("Enter name of the second course:");
		
		int secondNumCredits = getIntInput("Enter number of credits for " + secondName + " (in dollars):");

		int secondCostPerCredit = getIntInput("Enter cost per credit for " + secondName + " (in dollars):");
		
		// Compute tuition fee for the first course and store in variable
		int firstFee = computeTuition(firstNumCredits, firstCostPerCredit);
		
		// Display the first course name and tuition fee in a dialog box
		displayFee(firstName, firstFee);
		
		// Compute tuition fee for the second course and store in variable
		int secondFee = computeTuition(secondNumCredits, secondCostPerCredit);
		
		// Display the second course name and tuition fee in a dialog box
		displayFee(secondName, secondFee);
		
		// Check which tuition is greater or if they are the same and display info and the difference
		
		// Calculate the absolute difference
		int costDifference = Math.abs(firstFee - secondFee);
		
		// Initialize summary String for both courses
		String summary = "First course: " + firstName + " (" 
				+ firstNumCredits + " credits @ $" + firstCostPerCredit + "/credit)\n"
				+ "Second course: " + secondName + " ("
				+ secondNumCredits + " credits @ $" + secondCostPerCredit + "/credit)\n---\n";
		

		if (firstFee > secondFee)
		{
			// If first course is more expensive than the second course
			JOptionPane.showMessageDialog(null, summary + firstName
					+ " is $" + costDifference + " more expensive than "
					+ secondName);
		}
		else if (firstFee < secondFee)
		{
			// If second course is more expensive than the first course
			JOptionPane.showMessageDialog(null, summary + secondName
					+ " is $" + costDifference + " more expensive than "
					+ firstName);
		}
		else
		{
			// If firstFee is neither greater or less than secondFee, then they are equal
			JOptionPane.showMessageDialog(null, "The two courses, "
					+ firstName + " (" + firstNumCredits + " credits) and "
					+ secondName + " (" + secondNumCredits + " credits) cost the same.");
		}
	}
}