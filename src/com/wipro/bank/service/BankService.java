package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public boolean validateData(float principal,int tenure,int age,String gender)
	{
		try
		{
			if(principal<500)
			{
				throw new BankValidationException();
			}
			if(!(tenure==5 || tenure==10))
			{
				throw new BankValidationException();
			}
			if(!(gender.equalsIgnoreCase("Male")|| gender.equalsIgnoreCase("Female")))
			{
				throw new BankValidationException();
			}
			if(age>100 || age<1)
			{
				throw new BankValidationException();
			}
		}
		catch(BankValidationException e)
		{
			System.out.println(e);
			return false;
		}
	return true;
	}
	
	public void calculate(float principal,int tenure, int age, String gender)
	{
		boolean flag = validateData(principal,tenure,age,gender);
		if(flag)
		{
			RDAccount rd = new RDAccount(tenure,principal);
			rd.setInterest(age, gender);
			
			float minterest = rd.calculateInterest();
			float depositedAmount = rd.calculateAmountDeposited();
			
			System.out.println("Deposited Amount is : " +depositedAmount);
			System.out.println("Interest Amount is : " +minterest);
			System.out.println("Maturity Amount is : " +rd.calculateMaturityAmount(depositedAmount, minterest));

		}
	}
	
	

}
