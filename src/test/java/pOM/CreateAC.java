package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAC {
	
	WebDriver driver;
	
	
	String userName="ganeshkillare@gmail.com";
	String passworGk = "Ganesha.11";
	
	public CreateAC(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstname")
	WebElement firstName;
	@FindBy(id = "lastname")
	WebElement lastName;
	@FindBy(name = "is_subscribed")
	WebElement checkboxNewsLetter;
	@FindBy(name = "email")
	WebElement Email;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "password_confirmation")
	WebElement confPassword;
	@FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement createAcButton;
	
	@FindBy(xpath = "//span[@class='base']") WebElement confMsg;

	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void SetLastName(String Lastname) {
		System.out.println(Lastname);
		lastName.sendKeys(Lastname);
	}

	public void clickSubcription() {
		checkboxNewsLetter.click();
	}

	public void setEmail(String email) {
		Email.sendKeys(email);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void con_Password(String conpwd) {
		confPassword.sendKeys(conpwd);
	}

	public void createACButton() {
		createAcButton.click();

	}
	public String conMsg() {
		return (confMsg.getText());
	}

}
