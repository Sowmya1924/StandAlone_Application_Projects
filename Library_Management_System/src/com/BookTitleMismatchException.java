package com;

public class BookTitleMismatchException extends RuntimeException {

	@Override
	public String toString() {
	
		return getClass()+":Title is mismatched...";
	}
	
	

}
