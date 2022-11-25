package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class Vijay  extends BaseClass{
	@Test
	public void dropDown() {
		
		
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//a[normalize-space()='CATEGORIES']")).click();
		WebElement carrDev = driver.findElement(By.xpath("//ul[@id='category_li']//a[normalize-space()='Career Development']"));
		carrDev.click();
	}
	

}
