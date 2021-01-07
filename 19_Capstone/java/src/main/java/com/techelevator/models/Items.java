package com.techelevator.models;

import java.math.BigDecimal;

public class Items
/**
 * Responsibilities:
 *      Knows the slot, name and price of the product
 */

{
    private String slot;
    private String name;
    private BigDecimal price;
    private String type;
    private int quantity;
    
    
	public void Product(String slot, String name, BigDecimal price, String type, int quantity)
	{
		this.slot = slot;
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
	}

	public String getId()
	{
		return slot;
	}

	public String getName()
	{
		return name;
	}

	public BigDecimal getPrice()
	{
		return price;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	   
	
	@Override
	public String toString()
	{
		return slot + " - " + name + " - $" + price + "-" + type + "-" + quantity;
	}
    
}
