package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAc {
	WebDriver driver;
	public MyAc(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[normalize-space()='Men']") WebElement man;
	@FindBy(xpath = "//a[@id='ui-id-17']//span[contains(text(),'Tops')]") WebElement tops;
	@FindBy(xpath = "//a[@id='ui-id-19']//span[contains(text(),'Jackets')]") WebElement jacket;
	

	
	
	
	public void clickOnJacket() {
		Actions act = new Actions(driver);
		act.moveToElement(man).moveToElement(tops).moveToElement(jacket).click().perform();
	}
}
