package com.techelevator.models;

import java.math.BigDecimal;

public class Gum
{
	public Gum(String name, BigDecimal price)
	{
		super(name, price);
	}
	
	String display = "Chew Chew, Yum!";
	
	@Override
	public String getDisplay()
	{
		return display;
	}
}
