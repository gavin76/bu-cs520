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
	
	public void setDate(String monthString, int day, int year)
	{
		if (dateOK(monthString, day, year))
		{
			this.month = monthString;
			this.day = day;
			this.year = year;
		}
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	
	public void setDate(int year)
	{
		setDate(1, 1, year);
	}
	
	public void setYear(int year)
	{
		if ( (year < 1000) || (year > 9999) )
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
		{
			this.year = year;
		}
	}
	
	public void setMonth(int monthNumber)
	{
		if ((monthNumber <= 0) || (monthNumber > 12))
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
		{
			month = monthString(monthNumber);
		}
	}
	
	public void setDay(int day)
	{
		if ((day <= 0) || (day > 31))
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
		{
			this.day = day;
		}
	}
	
	public int getMonth()
	{
		if (month.equals("January"))
			return 1;
		if (month.equals("February"))
			return 2;
		if (month.equals("March"))
			return 3;
		if (month.equals("April"))
			return 4;
		if (month.equals("May"))
			return 5;
		if (month.equals("June"))
			return 6;
		if (month.equals("July"))
			return 7;
		if (month.equals("August"))
			return 8;
		if (month.equals("September"))
			return 9;
		if (month.equals("October"))
			return 10;
		if (month.equals("November"))
			return 11;
		if (month.equals("December"))
			return 12;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
}

