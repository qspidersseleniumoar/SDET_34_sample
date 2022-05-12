package com.contacttest;
import org.testng.annotations.Test;

public class ContactModifyTest {
	
	@Test(groups = "smokeTest")
	public void createContactNameEditTest() {
		System.out.println("execute createContactNameEditTest");
		
		System.out.println("===========BROWSER====="+System.getProperty("browser"));
	}
	
	@Test(groups = "regressionTest")
	public void createContactNumberEditTest() {
		System.out.println("execute createContactNumberEditTest");
	}
	
	@Test(groups = "regressionTest")
	public void ContactAddressTest() {
		System.out.println("execute ContactAddressTest");
	}


}
