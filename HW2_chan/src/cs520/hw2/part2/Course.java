package cs520.hw2.part2;

/*
 * Name: Gavin Chan
 * 
 * CS520 Assignment 2 Part 2
 * 
 * Object oriented application: class definition
 */

public class Course {

	// Declare private variables
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;
	
	// Single constructor with three arguments
	public Course(String courseName, int costPerCredit, int numberOfCredits)
	{
		this.courseName = courseName;
		this.costPerCredit = costPerCredit;
		this.numberOfCredits = numberOfCredits;
		
		// Output to the console the values using the get methods
		System.out.println("Course name: " + getCourseName());
		System.out.println("Number of credits: " + getNumberOfCredits());
		System.out.println("Cost per credit: " + getCostPerCredit());
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

	// Method to return cost of tuition
	public int getTotalTuition()
	{
		return (numberOfCredits * costPerCredit);
	}

	// Override the toString method to specified format
		public String toString()
		{
			return "Course: " + courseName + " @ $" + getTotalTuition();
		}
}
