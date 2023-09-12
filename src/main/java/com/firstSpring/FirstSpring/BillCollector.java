package com.firstSpring.FirstSpring;

public class BillCollector {

	private Payment p;
	
	public String Pay() {
		return p.pay();
	}
	

	public void Bill() {
		
		p.pay();
}
}