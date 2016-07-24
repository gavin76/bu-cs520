package cs520.hw3.part2;

/*
 * Author: Gavin Chan
 * Assignment 3 Part 2
 * Test program  */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {

	private static void processInputData(String data) {
		
		// Tokenize the string argument using comma as the delimiter
		StringTokenizer str = new StringTokenizer(data, ",");
		
		// Extract the name token
		String name = str.nextToken();
		
		// Create a student object
		Student currentStudent = new Student(name);
		int grade;
		
		// Read each homework grade token one at a time and set the instance value
		grade = Integer.parseInt(str.nextToken());
		currentStudent.setHomework1(grade);
		grade = Integer.parseInt(str.nextToken());
		currentStudent.setHomework2(grade);
		grade = Integer.parseInt(str.nextToken());
		currentStudent.setHomework3(grade);
		grade = Integer.parseInt(str.nextToken());
		currentStudent.setHomework4(grade);
		grade = Integer.parseInt(str.nextToken());
		currentStudent.setHomework5(grade);
		grade = Integer.parseInt(str.nextToken());
		currentStudent.setHomework6(grade);
		
		// Display the string representation of the currentStudent object
		System.out.println(currentStudent.toString());	
	}
	
	public static void main(String[] args) {
		
		// Set up program to read the input file
		String inputFileName = "data.txt";
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(inputFileName);
		} catch (FileNotFoundException e) {
			System.out.println("Error: file not found");
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		
		// Read the contents of the file line by line invoke the processInputData method for each line read
		try {
			input = reader.readLine();
			while (input != null) {
				processInputData(input);
				input = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error in reading file");
			e.printStackTrace();
		}
		
		// Close input once all data has been read
		try {
			fileReader.close();
		} catch (IOException e) {
			System.out.println("Error in closing file");
			e.printStackTrace();
		}
	}
}
