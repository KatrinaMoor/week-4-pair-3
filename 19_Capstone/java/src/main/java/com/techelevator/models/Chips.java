package com.techelevator.models;

import java.math.BigDecimal;

public class Chips extends Items
{
	public Chips(String slot, String name, BigDecimal price, String type, int quantity)
	{
		super(slot, name, price, type, quantity);
	}
	
	String display = "Crunch Crunch, Yum!";
	
	@Override
	public String toString()
	{
		return display;
	}
}
