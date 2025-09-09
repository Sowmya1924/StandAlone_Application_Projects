package com;

public class InvalidIdException extends RuntimeException{

	@Override
	public String toString() {
		
		return getClass()+":Invalid Id entered...";
	}
	
	

}
