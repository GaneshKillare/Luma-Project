package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Create an Account")
	public WebElement CreateAC;

	@FindBy(partialLinkText = "Sign")
	WebElement signUp;
	@FindBy(xpath = "//a[@id='ui-id-3']") WebElement whatsNew;
	

	public void clickCreateAc() {
		CreateAC.click();
	}

	public void clickOnSignUPButton() {
		signUp.click();

	}
	public void clickOnWhatNew() {
		whatsNew.click();
		
	}

}
