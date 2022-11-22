package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pOM.HomePage;
import pOM.LogIn;
import testBase.BaseClass;

public class TC_002_LogIn extends BaseClass {
	@Test
	public void checkLogIn() throws Exception {
		logger.info("TC_002_LogIn started");
		driver.get(appUrl);
		logger.info("open the Home page");
		HomePage hm = new HomePage(driver);
		hm.clickOnSignUPButton();
		logger.info("click on sign up botton");
		LogIn lg = new LogIn(driver);
		lg.setEmailAddress(userName);
		logger.info("set the Email");
		lg.setPass(password);
		logger.info("set the password");
		lg.clickLogInButton();
		logger.info("click on Log In botton");	
		Assert.assertEquals(lg.confMsg(), "Welcome, Ganesh Killare!");
		logger.info("TC_002_logIn is ended");
		//captureScreen(driver, "logIn Test");

	}

}
