package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Common_Functions {

	WebDriver driver = null;
	String AbsolutePath = System.getProperty("user.dir");

	public WebDriver browserLaunch() throws IOException {
		System.setProperty("webdriver.chrome.driver", AbsolutePath + PropertyHandler.getProperty("chromeDriver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(PropertyHandler.getProperty("url"));
		return driver;
	}

	public void waitForElementVisibile(WebDriver driver, WebElement allElement) throws TimeoutException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(allElement));
	}
	
	public void sendkeys(WebElement element, String input) {
		element.sendKeys(input);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void verfiyText(WebElement element, String expected) {
		Assert.assertTrue((element.getText()).equalsIgnoreCase(expected));
	}

	public void scrollDowntoElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void linkText(WebDriver driver, String text) {
		driver.findElement(By.linkText(text)).click();
	}
	
}
