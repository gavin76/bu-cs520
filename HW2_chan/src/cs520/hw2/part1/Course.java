package cs520.hw2.part1;

/*
 * Name: Gavin Chan
 * 
 * CS520 Assignment 2 Part 1
 * 
 * Object oriented application: class definition
 */

import javax.swing.JOptionPane;

public class Course {

	// Declaration of instance variables
	
	private String courseName;
	private int numberOfCredits;
	private int costPerCredit;

	// Constructors
	// --Default, no-argument constructor
	public Course()
	{
		courseName = "";
		numberOfCredits = 0;
		costPerCredit = 0;
	}
	
	// --Constructor to initialize variables
	public Course(String name, int credits, int costPerCredit)
	{
		
		this.courseName = name;
		this.numberOfCredits = credits;
		this.costPerCredit = costPerCredit;
	}
	
	// Set methods for the 3 variables
	
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	public void setNumberOfCredits(int credits)
	{
		// Require that numberOfCredits cannot be a negative number
		if (credits < 0)
		{
			System.out.println("Number of credits cannot be a negative number");
			System.exit(0);
		}
		else
			numberOfCredits = credits;
	}
	
	public void setCostPerCredit(int costPerCredit)
	{
		// Require that costPerCredit cannot be a negative number
		if (costPerCredit < 0)
		{
			System.out.println("Cost cannot be a negative number");
			System.exit(0);
		}			
		else
			this.costPerCredit = costPerCredit;
	}
	
	// Additional set method to set all variables at once
	public void set(String courseName, int numberOfCredits, int costPerCredit)
	{
		this.courseName = courseName;
		setNumberOfCredits(numberOfCredits);
		setCostPerCredit(costPerCredit);
	}
	
	// Get methods for the 3 variables
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public int getNumberOfCredits()
	{
		return numberOfCredits;
	}
	
	public int getCostPerCredit()
	{
		return costPerCredit;
	}
	
	public String toString()
	{
		return courseName + " (" + numberOfCredits + " credits @ $" + costPerCredit + "/credit)";
	}
	
	// Method to return cost of tuition
	public int getTotalTuition()
	{
		return (numberOfCredits * costPerCredit);
	}
	
	// Method to display course name and tuition fee
	public void printTuitionDetails()
	{
		JOptionPane.showMessageDialog(null, toString() 
				+ "\nTuition Fee is $"
				+ getTotalTuition());	
	}
}
