package com.orgtest;
import org.testng.annotations.Test;

public class OrganizationTest {
	
	@Test(groups = "smokeTest")
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
	}
	
	@Test(groups = "regressionTest")
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}
	
	@Test(groups = "regressionTest")
	public void deleteOrgTest() {
		System.out.println("execute deleteOrgTest");
	}


}
