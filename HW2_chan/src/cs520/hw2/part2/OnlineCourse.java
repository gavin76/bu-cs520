package cs520.hw2.part2;

/*
 * Name: Gavin Chan
 * 
 * OnlineCourse class definition that extends Course
 * 
 */

public class OnlineCourse extends Course {

	private int technologyFee;
	
	// Single constructor with four arguments
	public OnlineCourse (String courseName, int numberOfCredits, int CostPerCredit, int technologyFee)
	{
		super(courseName, numberOfCredits, CostPerCredit);
		this.technologyFee = technologyFee;
		
		// Output to console the values using the get methods
		System.out.println("In OnlineCourse Constructor values set:\n"
				+ "  CourseName = " + getCourseName()
				+ ", CostPerCredit = $" + getCostPerCredit()
				+ ", NumberOfCredits = " + getNumberOfCredits()
				+ ", TechnologyFee = $" + getTechnologyFee());
	}
	
	// Set method for technologyFee
	public void setTechnologyFee(int technologyFee)
	{
		this.technologyFee = technologyFee;
	}
	
	//Get method for technologyFee
	public int getTechnologyFee()
	{
		return technologyFee;
	}
	
	// Override getTotalTuition() to return sum of technologyFee and TuitionFee computed by the Course class
	public int getTotalTuition()
	{
		return (super.getTotalTuition() + getTechnologyFee() * getNumberOfCredits());
	}
	
	// Override toString() to return the string representation in the specified format
	public String toString()
	{
		return "OnlineCourse: " + getCourseName() + " @ $"
				+ getTotalTuition();
	}
}
