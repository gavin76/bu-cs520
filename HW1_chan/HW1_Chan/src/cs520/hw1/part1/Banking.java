package cs520.hw1.part1;
/*
 * Name: Gavin Chan
 * CS520 Assignment 1 Part 1
 * 
 * Takes user input in dollars and outputs the maximum bills from
 * highest to lowest denominations
 */

import javax.swing.JOptionPane;

public class Banking {

	public static void main(String[] args) {
		
		// Get input from user, convert into integer and output to console
		String input = JOptionPane.showInputDialog("Enter monetary amount on dollars");
		int amount = Integer.parseInt(input);
		System.out.println("Requested Amount = " + amount);
		
		// Declare variables for computation
		int hundreds, twenties, tens, fives, ones, remainingAmount;
		
		hundreds = amount / 100;
		remainingAmount = amount % 100;
		System.out.println("Hundreds = " + hundreds + ", Remaining Amount = " + remainingAmount);
		
		twenties = remainingAmount / 20;
		remainingAmount = remainingAmount % 20;
		System.out.println("Twenties = " + twenties + ", Remaining Amount = " + remainingAmount);
		
		tens = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		System.out.println("Tens = " + tens + ", Remaining Amount = " + remainingAmount);
		
		fives = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		System.out.println("Fives = " + fives + ", Remaining Amount = " + remainingAmount);
		
		ones = remainingAmount;
		System.out.println("Ones = " + ones);
		
		// Output using message dialog
		JOptionPane.showMessageDialog(null, "Requested Amount (" + amount + ")\n" +
											"Hundreds (" + hundreds + ")\n" +
											"Twenties (" + twenties + ")\n" +
											"Tens (" + tens + ")\n" +
											"Fives (" + fives + ")\n" +
											"Ones (" + ones + ")");
		
	}

}
