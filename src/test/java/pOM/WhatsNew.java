package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsNew {
	WebDriver driver;
	public WhatsNew(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[2]//li[1]//a[1]") WebElement Hoodies_Sweatshirts;
	@FindBy(xpath = "//div[normalize-space()='Size']") WebElement sizeButton;
	@FindBy(xpath = "//a[@aria-label='XL']//div[contains(@class,'swatch-option text')][normalize-space()='XL']") WebElement XLSize;
	@FindBy(xpath = "//div[@class='page-title-wrapper']") WebElement confMSG;
	
	public void clickOnHoodies_Sweatshirts() {
		
		Hoodies_Sweatshirts.click();
	}
public void clickSizeButton() {
	sizeButton.click();
		
	}
public void setSize() {
	 XLSize.click();
	
}
public String confMsg() {
	return(confMSG.getText());
	
}
	

}
