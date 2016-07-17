package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionObjectStyle {

	public static int getIntInput(String messagePrompt)
	{
		int inputValue;
		String errorMsg = "";
		// For the purposes of this program, this function will not accept negative numbers
		do
		{
			String input = JOptionPane.showInputDialog(errorMsg + messagePrompt);
			inputValue = Integer.parseInt(input);
			if (inputValue < 0)
				errorMsg = "A negative number is invalid. Please try again.\n";
		}
		while (inputValue < 0);
		return inputValue;
	}
	
	public static void main(String[] args) {
		
		// Initialize 2 course objects
		Course firstCourse = new Course(),
			   secondCourse = new Course();	
		
		// Get values for the first course via user prompt
		
		String input = JOptionPane.showInputDialog("Enter name of the first course:");
		firstCourse.setCourseName(input);
		
		
		firstCourse.setNumberOfCredits(getIntInput("Enter number of credits for " + firstCourse.getCourseName() + ":"));

		firstCourse.setCostPerCredit(getIntInput("Enter cost per credit for " + firstCourse.getCourseName() + " (in dollars):"));
		
		
		// Get values for the second course via user prompt
		input = JOptionPane.showInputDialog("Enter name of the second course:");
		secondCourse.setCourseName(input);
		
		secondCourse.setNumberOfCredits(getIntInput("Enter number of credits for " + secondCourse.getCourseName() + ":"));
		
		secondCourse.setCostPerCredit(getIntInput("Enter cost per credit for " + secondCourse.getCourseName() + " (in dollars):"));

		
		// Display tuition fee for the first course
		firstCourse.printTuitionDetails();
		
		// Display tuition fee for the second course
		secondCourse.printTuitionDetails();
				
		// Check which tuition is greater or if they are the same and display info and the difference
		
		// Calculate the absolute difference
		int costDifference = Math.abs(firstCourse.getTotalTuition() - secondCourse.getTotalTuition());
		
		// Initialize summary String for both courses
		String summary = "First course: " + firstCourse.toString()
				+ "\nSecond course: " + secondCourse.toString() +"\n---\n";

		if (firstCourse.getTotalTuition() > secondCourse.getTotalTuition())
		{
			// If first course is more expensive than the second course
			JOptionPane.showMessageDialog(null, summary + firstCourse.getCourseName()
					+ " is $" + costDifference + " more expensive than "
					+ secondCourse.getCourseName());
		}
		else if (firstCourse.getTotalTuition() < secondCourse.getTotalTuition())
		{
			// If second course is more expensive than the first course
			JOptionPane.showMessageDialog(null, summary + secondCourse.getCourseName()
					+ " is $" + costDifference + " more expensive than "
					+ firstCourse.getCourseName());
		}
		else
		{
			// If firstFee is neither greater or less than secondFee, then they are equal
			JOptionPane.showMessageDialog(null, "The two courses, "
					+ firstCourse.getCourseName() + " and "
					+ secondCourse.getCourseName() + " cost the same.");
		}
	}
}
