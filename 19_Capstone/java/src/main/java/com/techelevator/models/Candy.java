package com.techelevator.models;

import java.math.BigDecimal;

public class Candy extends Items
{

	public Candy(String slot, String name, BigDecimal price, String type, int quantity)
	{
		super(slot, name, price, type, quantity);
	}
	
	String display = "Munch Munch, Yum!";
	
	@Override
	public String toString()
	{
		return display;
	}
}
