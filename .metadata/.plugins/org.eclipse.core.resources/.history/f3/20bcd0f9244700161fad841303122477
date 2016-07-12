package ch4;

import java.util.Scanner;

public class Date {
	private String month;
	private int day;
	private int year; // a four digit number
	
	public Date()
	{
		month = "January";
		day = 1;
		year = 1000;
	}
	
	public Date(int monthInt, int day, int year)
	{
		setDate(monthInt, day, year);
	}
	
	public Date(String monthString, int day, int year)
	{
		setDate(monthString, day, year);
	}
	
	public Date(int year)
	{
		setDate(1, 1, year);
	}
	
	public Date(Date aDate)
	{
		if (aDate == null) // Not a real date
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
		
		month = aDate.month;
		day = aDate.day;
		year = aDate.year;
	}
	
	public void setDate(int monthInt, int day, int year)
	{
		if (dateOK(monthInt, day, year))
		{
			this.month = monthString(monthInt);
			this.day = day;
			this.year = year;
		}
		else
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
	}
	
	public void setDate(String)
	public void setDate(int year)
	{
		setDate(1, 1, year);
	}
}

