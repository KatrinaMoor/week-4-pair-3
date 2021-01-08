package com.techelevator.models;

import java.math.BigDecimal;

public class Candy
{
	public Candy(String name, BigDecimal price)
	{
		super(name, price);
	}
	
	String display = "Munch Munch, Yum!";
	
	@Override
	public String getDisplay()
	{
		return display;
	}
}
