package com.techelevator.application;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.models.Items;

public class FileProductLoader
{

//	**
//	 * Responsibilities:
//	 *      Read a txt/csv file and convert each line to a product
//	 *      returns a list of all products found in the file
//	 * 
//	 * Dependencies:
//	 *      Product
//	 */
	
		
		public List<Items> getItems()
		{
			List<Items> items = new ArrayList<Items>();
			
			File productsPath = new File("vendingmachine.csv");		
			try(Scanner fileScanner = new Scanner(productsPath))
			{
				// read one line to skip the header
				fileScanner.nextLine();
				
				//loop and add each product to the list
				while(fileScanner.hasNextLine())
				{
					String line = fileScanner.nextLine();
					// create the product
					String[] parts = line.split("|");
					
					String slot = parts[0];
					String name = parts[1];
					BigDecimal price = new BigDecimal(parts[2]);
					String type = parts[3];
					Integer quantity = parts[4];
					
					
					Items items = new Items(slot, name, price, type, quantity);
									
					// add it to the list
					items.add(items);
				}
			}
			catch(Exception ex)
			{
				
			}
			
			return items;
		
	    
		}
	
}
