package testBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Logger logger;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		logger = LogManager.getLogger(this.getClass());
		logger.info("chrome is open");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}

	@AfterMethod
	public void captureScreenShot(ITestResult res) throws IOException {
		int status = res.getStatus();
		String testCaseName = res.getName();
		if (status == 2) {
			screenShot(driver, testCaseName);
		}

	}
	
	public static void screenShot(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + ".\\screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
	}

	
	
	
	

	protected String userName = "gk11@gmail.com";
	protected String password = "Ganesha.11";

	protected String appUrl = "https://magento.softwaretestingboard.com/";

	public String randomestring() {
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return (generatedString);
	}

	public int randomeNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(5);
		return (Integer.parseInt(generatedString2));
	}


	public void scrollDownPage(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
