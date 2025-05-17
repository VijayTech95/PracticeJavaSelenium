package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.MainBAseClass;
import pageobjects.SignUpPage;

public class TC_01_SignUpPage extends MainBAseClass {
	
	@BeforeMethod
	public void setUp() {
		launchWebsite();
	}
	
	@Test
	public void signUpPage() throws Exception {
		SignUpPage sign = new SignUpPage(driver);
		sign.clickSignUpLink();
		sign.enterUserName();
		sign.enterUserMailId();
	}
	
	@AfterMethod
	public void close() {
		
	}

}
