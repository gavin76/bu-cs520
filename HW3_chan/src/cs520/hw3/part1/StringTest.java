package cs520.hw3.part1;

/*
 * Author: Gavin Chan
 * Assignment 3 Part 1
 */

import javax.swing.JOptionPane;

public class StringTest {

	public static void main(String[] args) {
		try {
			// Ask user for input
			String input = JOptionPane.showInputDialog("Please enter data using the format CourseId,CourseName,Tuition");
			
			// Trim input and display trimmed data to the console
			input = input.trim();
			System.out.println(input);
			
			// Find index of first comma and extract the courseId
			int firstComma = input.indexOf(',');
			
			String courseId = input.substring(0, firstComma);
			System.out.println("First Comma Position:" + firstComma 
					+ ", CourseId:" + courseId
					+ ", Length:" + courseId.length());
			
			
			// Try to find index of second comma and extract the courseName
			int secondComma = input.indexOf(',', firstComma + 1);
			
			String courseName = input.substring(firstComma + 1, secondComma);
			System.out.println("Second Comma Position:" + secondComma
					+ ", CourseName:" + courseName
					+ ", Length:" + courseName.length());
			
			// Try to extract the tuition
			int tuition = Integer.parseInt(input.substring(secondComma + 1));
			
			// Throw exception if number is a negative number
			if (tuition < 0) throw new Exception("Error: Tuition must not be a negative number");
			System.out.println("Regular tuition $" + tuition
					+ ", Discount Tuition $" + (int)(tuition * 0.75));
	
		} catch (NullPointerException e) {
			System.err.println("\nError: User input cancelled. Program terminated.");
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("\nError in user input: Program terminated. Please use the correct format to input the values.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("\nError in user input: Program terminated. Please enter an integer for tuition.");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println(e.getMessage() + " Program terminated.");
			System.exit(0);
		}
	}
}
