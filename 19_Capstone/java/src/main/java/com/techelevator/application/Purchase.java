package com.techelevator.application;

import java.math.BigDecimal;

import com.techelevator.models.Items;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

/*
 * whole dollar amounts 
 * provide balance after each purchase
 * products purchased one at a time
 * finish completes transaction, gives change, returns to main menu
 * 
 * feedMoney - action
 * amountInserted - amount of money added to the availableFunds -> Also BigDecimal
 * availableFunds - BigDecimal -> covers balance available after feeding money, purchasing, etc
 * inStock - item is in stock in order to be available to purchase
 * 
 */
public class Purchase
{
	private ItemInventory inventory;
	BigDecimal dollarAmount = BigDecimal.ZERO;
	
	public Purchase(ItemInventory inventory)
	{
		this.inventory=inventory;
	}
	public void run()
	{
		while(true)
        {
        	// display main menu - get their selection
      
			String choice = UserInput.getPurchaseScreenOption();
            
             if(choice.equals("Feed Money"))
            {
            	UserInput.getMoney();
            	dollarAmount.add(UserInput.getMoney());
            	/*
            	 * it's cycling through but not updating the credited amount.
            	 * Just an infinite loop until "exit"
            	 */
            }
            else if(choice.equals("Select Product"))
            {
                // display products 
            	UserOutput.displayInventory(inventory);
            	// get product id
            	UserInput.getSelectedProduct();
            	
            	String slot = "A1";
            	Items item = inventory.getItemBySlot(slot);
            	BigDecimal cost = item.getPrice();
            	
            	if(dollarAmount.compareTo(cost) == -1)
            	{
            		System.out.println("Insufficient Funds. Please add more or exit");
            	}
            	else
            	{
            		if(item.getQuantity() > 0)
            		{
            			
            			dollarAmount = dollarAmount.subtract(cost);
            		}
            		else
            		{
            			System.out.println("SOLD OUT");
            		}
            	}
            	

            	//update quantity of product
            	//include sound
            	
            }
            else if(choice.equals("Exit Transaction"))
            {
//                do
//                {
//                	make change for quarters
//                }
//                while you have more than 25 cents change
//                do
//                {
//                	make change for 10 cents change
//                }
//                while you have 
//               nickels = change/5
                break;
            }
        }
	}
}
