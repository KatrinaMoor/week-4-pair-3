package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.models.Items;


public class ItemInventory
{

//	Responsibilities:
//		 *      Track current inventory
//		 *      Add new inventory
	
//	Dependencies:
//		 *      Item
//		 *      FileProductLoader - this knows how to load all products from the file
//		 */
	
	
		private List<Items> items = new ArrayList<Items>();
		
		public ItemInventory()
		{
			loadInventory();
		}
		

	    private void loadInventory()
	    {
	        // Inventory should NOT know how to read from a file
	        // we will use the FileProductLoader to get the products
	    	FileProductLoader loader = new FileProductLoader();
	    	items = loader.getItems();
	    }
	    
	    public List<Items> getItems()
	    {
	    	return items;
	    }

	    public Items getItemBySlot(String slot)
	    {
	        Items item = null;
	    	for (Items i : items)
			{
				if(i.getSlot().equals(slot))
				{
					item = i;
					break;
				}
	        }
	        
	        return item;
	    }
	    

	
	
}
