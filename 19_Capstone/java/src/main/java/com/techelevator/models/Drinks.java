package com.techelevator.models;

import java.math.BigDecimal;

public class Drinks extends Items
{
	public Drinks(String slot, String name, BigDecimal price, String type, int quantity)
	{
		super(slot, name, price, type, quantity);
	}
	
	String display = "Glug Glug, Yum!";
	
	@Override
	public String toString()
	{
		return display;
	}
}
