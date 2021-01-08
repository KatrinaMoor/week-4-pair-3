package com.techelevator.models;

import java.math.BigDecimal;

public class Gum extends Items

{
	public Gum(String slot, String name, BigDecimal price, String type, int quantity)
	{
		super(slot, name, price, type, quantity);
	}
	
	String display = "Chew Chew, Yum!";
	
	@Override
	public String toString()
	{
		return display;
	}
}
