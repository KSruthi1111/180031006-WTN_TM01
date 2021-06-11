package com.wipro.bank.main;

import com.wipro.bank.service.BankService;

public class MainClass {
	public static void main(String[] args)
	{
		int tenure = 10; 
		float principal = 500; 
		int age = 21; 
		String gender = "Male"; 
		BankService b=new BankService(); 
		b.calculate(principal, tenure, age, gender); 
	}

}
