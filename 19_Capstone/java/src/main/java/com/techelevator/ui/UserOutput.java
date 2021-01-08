package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techelevator.application.ItemInventory;
import com.techelevator.models.Items;


/**
 * Responsibilities:
 *      This class should handle formatting and displaying ALL messages to the user
 * 
 * Dependencies:
 *      None
 */


public class UserOutput
{

	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}

	public static void displayMessage(String message)
	{
		System.out.println();
		System.out.println(message);
		System.out.println();
	}

	public static void displayHomeScreen()
	{
//		clearScreen();
		
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("                      Home");
		System.out.println("***************************************************");
		System.out.println();
	}
	
	public static void displayInventory(ItemInventory inventory)
	{
//		clearScreen();

		System.out.println();
		System.out.println("***************************************************");
		System.out.println("                    Items");
		System.out.println("***************************************************");
		System.out.println();
		
		for(Items items: inventory.getItems())
		{
			System.out.println(items.toString());
		}
		System.out.println();
		
	}
		//List<Items> items = Items.getItems()
	
	


		
	
    
	
	
}
