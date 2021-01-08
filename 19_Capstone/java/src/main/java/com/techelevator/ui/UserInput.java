package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities:
 *      This class should handle receiving ALL input from the User
 * 
 * Dependencies:
 *      None
 */

public class UserInput
{

private static Scanner scanner = new Scanner(System.in);
	
	public static String getHomeScreenOption()
	{
		System.out.println("What would you like to do?");
		System.out.println();

		System.out.println("1) Display Vending Machine Items");
		System.out.println("2) Purchase");
		System.out.println("3) Exit");
		
		
		System.out.println();
		System.out.print("Please select an option: "); // where user types selection
		
		String selectedOption = scanner.nextLine();
		String option = selectedOption.trim().toLowerCase();
		
		if(option.equals("1"))
		{
			return "display items";
		}
		else if(option.equals("2"))
		{
			return "purchase";
		}
		else if(option.equals("3"))
		{
			return "exit";
		}
		else
		{
			return "invalid selection";
		}
		
	}
  
	public static String getSelectedProduct()
	{
		System.out.print("Enter the product slot ID: ");
		String productId = scanner.nextLine();
		
		return productId.toUpperCase().trim();
	}
	

	public static void waitForEnter()
	{
		System.out.print("Press enter to continue...");
		scanner.nextLine();
	}
	
	public static String getPurchaseScreenOption()
	{
		System.out.println("What would you like to do?");
		System.out.println();

		System.out.println("1) Feed Money");
		System.out.println("2) Select Product");
		System.out.println("3) Finish Transaction");
		
		
		System.out.println();
		System.out.print("Please select an option: "); // where user types selection
		
		String selectedOption = scanner.nextLine();
		String option = selectedOption.trim().toLowerCase();
		
		if(option.equals("1"))
		{
			return "Feed Money";
		}
		else if(option.equals("2"))
		{
			return "Select Product";
		}
		else if(option.equals("3"))
		{
			return "Finish Transaction";
		}
		else
		{
			return "invalid selection";
		}
		
	}
	
	public static BigDecimal getMoney()
	{
		while(true)
		{
		
		System.out.print("Enter your dollar amount: $");
		String dollar = scanner.nextLine().trim();
		BigDecimal dollarAmount;
		
		if(dollar.contains("1") || dollar.contains("5") || dollar.contains("10") || dollar.contains("20"))
		{
			dollarAmount = new BigDecimal(dollar);
			return dollarAmount;
		}
		else if (dollar.toLowerCase().contains("exit"))
		{
			dollarAmount = new BigDecimal(0);
			return dollarAmount;
		}
		else
		{
			System.out.print("not valid dollar amount");
			
		}
		
		
		}
	
		
	}
}

	
	

