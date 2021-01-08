package com.techelevator.models;

import java.math.BigDecimal;

public class Drinks extends Items
{
	public Drinks(String name, BigDecimal price)
	{
		super(name, price);
	}
	
	String display = "Glug Glug, Yum!";
	
	@Override
	public String getDisplay()
	{
		return display;
	}
}
