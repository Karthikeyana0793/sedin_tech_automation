package testcases;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectsRepo.Inverntory;
import objectsRepo.LoginPage;
import utilities.Common_Functions;

public class TestScenarios extends Common_Functions {

	WebDriver driver = null;
	LoginPage loginPage = null;
	Inverntory inventory = null;

	@BeforeClass
	public void launchBrowser() throws IOException, TimeoutException {
		driver = browserLaunch();
		loginPage = new LoginPage(driver);
		inventory = new Inverntory(driver);
	}

	@BeforeMethod
	public void login() throws TimeoutException {
		loginPage.login(driver);
	}

	@Test
	public void scenario_4() throws TimeoutException {
		loginPage.logout(driver);
		waitForElementVisibile(driver, loginPage.getUserName());
		sendkeys(loginPage.getUserName(), "invalidUser");
		sendkeys(loginPage.getPassword(), "InvalidPassword");
		click(loginPage.getLoginButton());
		verfiyText(loginPage.getErrorMessage(),
				"Epic sadface: Username and password do not match any user in this service");
	}

	@AfterMethod
	public void backToHome() throws TimeoutException {
		try {
			loginPage.logout(driver);
		} catch (Exception e) {

		}
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
