package cs520.hw2.part2;

/*
 * Name: Gavin Chan
 * 
 * CS520 Assignment 2 Part 2
 * 
 * Test program for Course and OnlineCourse
 */

public class Test {

	public static void main(String[] args) 
	{
		// Declare variable of type Course
		Course currentCourse;

		System.out.println("Taking a regular course...");
		
		// Create Course object
		currentCourse = new Course("CS520", 4, 390);
		
		// Print to the console the string representation
		System.out.println("Printing...\n" + currentCourse.toString());
		
		System.out.println("\nTaking an online course...");
		
		// Create OnlineCourse object
		currentCourse = new OnlineCourse("CS520", 4, 760, 60);
		
		// Print to the console the string reprerentation
		System.out.println("Printing...\n" + currentCourse.toString());

	}

}
