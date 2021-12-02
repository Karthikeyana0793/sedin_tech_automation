package objectsRepo;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Common_Functions;
import utilities.PropertyHandler;

public class LoginPage {
	
	Common_Functions function = new Common_Functions();
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	@FindBy(xpath = "//*[@class='title']")
	private WebElement pageTitle;

	@FindBy(id = "react-burger-menu-btn")
	private WebElement burgerMenu;

	@FindBy(id = "inventory_sidebar_link")
	private WebElement returnToItems;

	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutButton;

	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errorMessage;

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getBurgerMenu() {
		return burgerMenu;
	}

	public WebElement getReturnToItems() {
		return returnToItems;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getPageTitle() {
		return pageTitle;
	}

	public void login(WebDriver driver) throws TimeoutException {
		function.waitForElementVisibile(driver , getUserName());
		function.sendkeys(getUserName(), PropertyHandler.getProperty("userName"));
		function.sendkeys(getPassword(), PropertyHandler.getProperty("passWord"));
		function.click(getLoginButton());
		function.waitForElementVisibile(driver, getPageTitle());
	}
	
	public void logout(WebDriver driver) throws TimeoutException{
		function.scrollDowntoElement(driver, getBurgerMenu());
		function.click(getBurgerMenu());
		function.waitForElementVisibile(driver, getLogoutButton());
		function.click(getLogoutButton());
	}
}
