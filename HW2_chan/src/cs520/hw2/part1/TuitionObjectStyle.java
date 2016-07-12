package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionObjectStyle {

	public static void main(String[] args) {
		
		// Initialize 2 course objects
		Course firstCourse = new Course(),
			   secondCourse = new Course();	
		
		// Get values for the first course via user prompt
		
		
		String input = JOptionPane.showInputDialog("Enter name of the first course:");
		firstCourse.setCourseName(input);
		
		input = JOptionPane.showInputDialog("Enter number of credits for " + firstCourse.getCourseName() + " (in dollars):");
		firstCourse.setNumberOfCredits(Integer.parseInt(input));
		
		input = JOptionPane.showInputDialog("Enter cost per credit for " + firstCourse.getCourseName() + " (in dollars):");
		firstCourse.setCostPerCredit(Integer.parseInt(input));
		
		
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

}
