package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pOM.HomePage;
import testBase.BaseClass;

public class TC_001_CreateNewAC extends BaseClass {

	@Test
	public void CreateAC() throws Exception {
		logger.info("TC_001_CreateNewAc is started");
		driver.get(appUrl);
		HomePage lg = new HomePage(driver);
		lg.clickCreateAc();
		logger.info("click on create account button");
		pOM.CreateAC cac = new pOM.CreateAC(driver);
		cac.setFirstName("Ganesh");
		logger.info("set the first Name");
		cac.SetLastName("killare");
		logger.info("set the Last Name");
		cac.clickSubcription();
		logger.info("click on subcription button");
		String emailGenarated = randomestring();                 // Auto Genarated e-mail value strore in variable
		cac.setEmail(emailGenarated + "@gmail.com");
		logger.info("set the email");
		String pwdGenarated = randomestring();             //  Auto Genarated password value strore in variable
		cac.setPassword(pwdGenarated + "11");
		logger.info("set the password");
		cac.con_Password(pwdGenarated + "11");
		logger.info("set the conform password");
		cac.createACButton();
		logger.info("click the button create account");
		String Act = cac.conMsg();
		Assert.assertEquals(Act, "My Account");
		logger.info("TC_001_CreateNewAc is close");
	}

}
