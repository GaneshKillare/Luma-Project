package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pOM.HomePage;
import pOM.WhatsNew;
import testBase.BaseClass;

public class TC_005_WhatsNew extends BaseClass {
	
	@Test
	public void checkWhatsNewFeature() {
		driver.get(appUrl);
		HomePage hm = new HomePage(driver);
		hm.clickOnWhatNew();
		WhatsNew wn = new WhatsNew(driver);
		wn.clickOnHoodies_Sweatshirts();
		wn.clickSizeButton();
		wn.setSize();
		String act = wn.confMsg();
		Assert.assertEquals(act, "Hoodies & Sweatshirts");

	}

}
