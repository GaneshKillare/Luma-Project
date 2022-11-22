package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jackets {
	WebDriver driver;
	public Jackets(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(partialLinkText = "Jupiter All-Weather") WebElement Jupiter_All_Weather_Trainer ;
	@FindBy(xpath = "//div[@id='option-label-size-143-item-168']") WebElement Msize;
	@FindBy(xpath = "//div[@id='option-label-color-93-item-53']") WebElement GreenColour;
	@FindBy(xpath = "//span[normalize-space()='Add to Cart']") WebElement AddToCart ;
	@FindBy(css = ".action.showcart") WebElement CartIcon ;
	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']") WebElement conformation;
	@FindBy(xpath = "//a[@title='Remove item']") WebElement deleteCart;
	@FindBy(xpath = "//span[normalize-space()='OK']") WebElement deleteOk;
	
	
	
	
	public void selectProduct() {
		Jupiter_All_Weather_Trainer.click();
	}
	public String confMsg() {
		return(conformation.getText());
	}
	public void selectSize () {
		Msize.click();
		}
	public void selectColour() {
		GreenColour.click();
		}
	public void clickaddToCart() {
		AddToCart.click();
		
	}

	public void clickCartIcon() {
		CartIcon.click();
		
	}
	public String checkAddtoCart() {
		return(conformation.getText());
	}
	public void clickRemoveToCart() {
		deleteCart.click();
		
	}
	public void confDeleteItom() {
		deleteOk.click();
	}
}
