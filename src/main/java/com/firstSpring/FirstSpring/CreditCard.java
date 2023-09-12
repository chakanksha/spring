package com.firstSpring.FirstSpring;

public class CreditCard implements Payment
{

	@Override
	public String pay() {
		
		return "payment done through creditcard";
	}

}
