package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	public WebDriver driver;

	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement LogEmail;
	@FindBy(id = "pass")
	WebElement Logpass;
	@FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	WebElement logInButton;

	@FindBy(xpath = "//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, Ganesh Killare!']")
	WebElement confMsg;

	public void setEmailAddress(String email) {
		LogEmail.sendKeys(email);
	}

	public void setPass(String pwd) {
		Logpass.sendKeys(pwd);
	}

	public void clickLogInButton() {
		logInButton.click();
	}

	public String confMsg() {
		String act = confMsg.getText();
		return (act);
	}
}
