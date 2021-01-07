package com.techelevator.application;


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
    private Purchase purchase = new Purchase();

 //   private Logger errorLogger = new Logger("errors");
//    private Logger activityLogger = new Logger("logs");
	
    public void run()
    {
        while(true)
        {
            String choice = "display";

            if(choice.equals("display"))
            {
                // display the vending machine slots
            	displayInventory;
            }
            else if(choice.equals("purchase"))
            {
                // make a purchase
            }
            else if(choice.equals("exit"))
            {
                // good bye
                break;
            }
//            else
//            {
//                // invalid option try again
//              UserOutput.displayMessage("You selected an invalid option:");
//            }
//
//          UserInput.waitForEnter();

        }

//      UserOutput.clearScreen();
//     UserOutput.displayMessage("Thank you!");
        
    }
    
    public void displayInventory
    {
    	userOutput.displayInventory(inventory);
    }
}