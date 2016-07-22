package cs520.hw3.part2;

/*
 * Author: Gavin Chan
 * Assignment 3 Part 2
 * Student class to keep track of homework grades
 */

public class Student {
	
	// Declaration of instance variables
	private String name;
	private int homework1, homework2, homework3, homework4, homework5, homework6;
	
	// Single constructor with name as argument
	public Student(String name) {
		this.name = name;
	}
	
	public void setHomework1(int grade) {
		homework1 = grade;
	}
	
	public void setHomework2(int grade) {
		homework2 = grade;
	}
	
	public void setHomework3(int grade) {
		homework3 = grade;
	}
	
	public void setHomework4(int grade) {
		homework4 = grade;
	}
	
	public void setHomework5(int grade) {
		homework5 = grade;
	}
	
	public void setHomework6(int grade) {
		homework6 = grade;
	}
	
	public double computeAverage() {
		return ( (homework1 + homework2 + homework3 
				 + homework4 + homework5 + homework6) / 6);
	}
	
	public String toString() {
		return "The " + name + "'s average grade is " + computeAverage();
	}
}
