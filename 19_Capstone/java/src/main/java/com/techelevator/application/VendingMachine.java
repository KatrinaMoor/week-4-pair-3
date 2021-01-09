package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

/*
 * Vending Machine is the main application and manages the flow
 * 
 *  Dependencies:
 *      Inventory
 *      Purchase
 * 
 *      UI:
 *      UserInput
 *      UserOutput
 * 
 *      Utility:
 *      Logger - used to log errors and transactions
 */


public class VendingMachine 
{
	private ItemInventory inventory = new ItemInventory();
    private Purchase purchase = new Purchase(inventory);

 //   private Logger errorLogger = new Logger("errors");
//    private Logger activityLogger = new Logger("logs");
	
    public void run()
    {
        while(true)
        {
        	// display main menu - get their selection
            UserOutput.displayHomeScreen();
            String option = UserInput.getHomeScreenOption();
            

            if(option.equals("display items"))
            {
                // display the vending machine slots
            	UserOutput.displayInventory(inventory);
            }
            else if(option.equals("purchase"))
            {
                // make a purchase
            	purchase.run();
            }
            else if(option.equals("exit"))
            {
                // good bye
                break;
            }
            else
            {
                // invalid option try again
              UserOutput.displayMessage("You selected an invalid option:");
              System.out.println(option);
            }

          UserInput.waitForEnter();

        }

      UserOutput.clearScreen();
     UserOutput.displayMessage("Thank you!");
        
    }
    
}
