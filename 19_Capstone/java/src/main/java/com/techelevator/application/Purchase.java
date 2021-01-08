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
	private BigDecimal credit = BigDecimal.ZERO;
	
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
            
 //           String choice = "Feed Money";//temporary hard code

            if(choice.equals("Feed Money"))
            {
            	UserInput.getMoney();
            	credit.add(UserInput.getMoney());
            }
            else if(choice.equals("Select Product"))
            {
                // display products 
            	UserOutput.displayInventory(inventory);
            	// get product id
            	String slot = "A1";
            	Items item = inventory.getItemBySlot(slot);
            	//check if enough money to buy product
            	//if yes then subtract the price of product from credit 
            	//update quantity of product
            	//include sound
            	//if not enough money - error message "invalid amount"
            }
            else if(choice.equals("Exit Transaction"))
            {
                //calculate and return change
                break;
            }
        }
	}
}
