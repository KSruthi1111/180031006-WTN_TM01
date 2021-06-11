package com.wipro.ccbill.exception;

@SuppressWarnings("serial")
public class InputValidationException extends Exception{
	
	public InputValidationException()
	{
		super();
	}
	
	public String toString()
	{
		return("Invalid Input Data");
	}


}
