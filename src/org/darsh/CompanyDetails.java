package org.darsh;

public class CompanyDetails{
	private void compId () {
		System.out.println("compId: 123");
	
	}
	private void compName() {
		System.out.println("compName: Darsh");
		
	}
	public static void main(String[] args) {
		CompanyDetails c = new CompanyDetails();
		c.compId();
		c.compName();
				
		
	}
}
