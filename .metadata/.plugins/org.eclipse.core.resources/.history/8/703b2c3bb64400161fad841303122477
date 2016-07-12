package cs520.hw1.part2;
/*
 * Name: Gavin Chan
 * CS520 Assignment 1 Part 2
 * 
 * Takes user input in dollars and outputs the maximum bills from
 * highest to lowest denominations
 */

import javax.swing.JOptionPane;

public class OddNumbers {

	public static long sumWithLoop(long n) {
		
		long sum = 0;

		for (long i = 1, odd = 1; i <= n; i++, odd+=2) {
			sum += odd * odd;
		}
		return sum;
	}
	
	public static long sumWithoutLoop(long n) {
	  return ( n * (2 * n - 1) * (2 * n + 1)) / 3;	
	}
	
	public static void main(String[] args) {
		
		// Get input from user and convert into an integer
		String input = JOptionPane.showInputDialog("Enter an integer (>= 0):");
		long inputNumber = Long.parseLong(input);
		
		// Invoke sum of odd squares methods
		long result1 = sumWithLoop(inputNumber);
		long result2 = sumWithoutLoop(inputNumber);
		
		// Output results to console
		System.out.println("Sum with loop: " + result1);
		System.out.println ("Sum without loop: " + result2);
		
		// Compare results and give appropriate response
		if (result1 == result2) {
			System.out.println("Results are the same, my code is correct!");
		} else {
			System.out.println("Results are different, something is wrong in my code...");
		}

		// Summarize results using message dialog
		JOptionPane.showMessageDialog(null, "Requested number (" + inputNumber + ")\n" +
											"Sum with loop (" + result1 + ")\n" +
											"Sum without loop (" + result2 + ")\n");
	}

}
