package com.myAccount;


public class InvalidAmountException extends RuntimeException {

	public String toString()
	{
		return getClass()+": Invalid amount";
	}
}