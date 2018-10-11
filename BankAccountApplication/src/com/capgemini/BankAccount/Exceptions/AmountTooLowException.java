package com.capgemini.BankAccount.Exceptions;

public class AmountTooLowException extends Exception {
	
	public AmountTooLowException()
	{
		super("Amount too low");
	}

}
