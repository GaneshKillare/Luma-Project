package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pOM.HomePage;
import pOM.Jackets;
import pOM.LogIn;
import pOM.MyAc;
import testBase.BaseClass;

public class TC_003_AddToCart extends BaseClass {

	@Test
	public void checkAddToCartFunctionaly() throws Exception {

		logger.info("TC_003_AddToCart");
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

		MyAc ma = new MyAc(driver);
		ma.clickOnJacket();
		logger.info("click on Jacket");
		Jackets jk = new Jackets(driver);
		jk.selectProduct();
		logger.info("click on product");
		//scrollDownPage(driver);
		jk.selectSize();
		logger.info("click on M size");
		jk.selectColour();
		logger.info("click on Green colour");
		jk.clickaddToCart();
		logger.info("click on Add to Cart Button");
		jk.clickCartIcon();
		Thread.sleep(10000);
		logger.info("click on cart icon");
		Thread.sleep(10000);
		
     String trgPage =  jk.checkAddtoCart();
        Assert.assertEquals(trgPage, jk.confMsg());
        logger.info("TC_003_AddToCart end");
	}
}
