package com.myAccount;

public class InSufficentBalanceException extends RuntimeException{

	public String toString()
	{
		return getClass()+": Enter valid WithDraw Amount";
	}
}
