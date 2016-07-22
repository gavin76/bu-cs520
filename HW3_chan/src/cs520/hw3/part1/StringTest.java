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
			System.out.println("SecondCommaPosition:" + secondComma
					+ ", CourseName:" + courseName
					+ ", Length:" + courseName.length());
			
			// Try to extract the tuition
			int tuition = Integer.parseInt(input.substring(secondComma + 1));
			System.out.println("Regular tuition $" + tuition
					+ ", Discount Tuition $" + (int)(tuition * 0.75));
	
		} catch(NullPointerException e) {
			System.out.println("Error: User input cancelled. Program terminated.");
			e.printStackTrace();
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error in user input: Program terminated. Please retry with the correct format by using a comma to separate the input values.");
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("Error in user input: Program terminated. Please enter an integer for tuition.");
		}
	}
}
