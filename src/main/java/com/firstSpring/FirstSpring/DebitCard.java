package com.firstSpring.FirstSpring;

public class DebitCard implements Payment{

	@Override
	public String pay() {
		
		return "payment done through Debittcard";
	}
	

}
