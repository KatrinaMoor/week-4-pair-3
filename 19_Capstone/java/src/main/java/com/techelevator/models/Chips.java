package com.techelevator.models;

import java.math.BigDecimal;

public class Chips
{
	public Chips(String name, BigDecimal price)
	{
		super(name, price);
	}
	
	String display = "Crunch Crunch, Yum!";
	
	@Override
	public String getDisplay()
	{
		return display;
	}
}
