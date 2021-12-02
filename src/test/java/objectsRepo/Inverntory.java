package objectsRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Common_Functions;

public class Inverntory {
	
	Common_Functions function = new Common_Functions();
	
	public Inverntory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addCardtBackPack;
	
	@FindBy(xpath = "//*[@id='remove-sauce-labs-backpack']")
	private WebElement removeCardtBackPack;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement cartVerify;
	
	@FindBys({@FindBy(xpath = "//*[@class='inventory_item_description']/div/a/div")})
	private List<WebElement> productName;
	
	@FindBys({@FindBy(xpath = "//*[@class='inventory_item_description']/div/div")})
	private List<WebElement> productDescription;

	@FindBys({@FindBy(xpath = "//*[@class='inventory_item_description']/div[2]/div")})
	private List<WebElement> productPrice;

	@FindBy(xpath = "//*[@class='inventory_item_name']")
	private WebElement cartProdName;

	@FindBy(xpath = "//*[@class='inventory_item_price']")
	private WebElement cartProdPrice;

	@FindBy(xpath = "//*[@class='inventory_item_desc']")
	private WebElement cartProdDescription;

	@FindBy(xpath = "//*[@class='inventory_details_name large_size']")
	private WebElement prodPageName;

	@FindBy(xpath = "//*[@class='inventory_details_price']")
	private WebElement prodPagePrice;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement zipCode;

	@FindBy(id = "continue")
	private WebElement continueCheckout;

	@FindBy(id = "back-to-products")
	private WebElement returnToProducts;

	@FindBy(xpath = "//h2[@class='complete-header']")
	private WebElement confirmOrderSuccess;

	@FindBy(id = "finish")
	private WebElement finishCheckout;

	public WebElement getReturnToProducts() {
		return returnToProducts;
	}

	public WebElement getProdPageName() {
		return prodPageName;
	}

	public WebElement getProdPagePrice() {
		return prodPagePrice;
	}

	public WebElement getConfirmOrderSuccess() {
		return confirmOrderSuccess;
	}

	public WebElement getFinishCheckout() {
		return finishCheckout;
	}

	public WebElement getContinueCheckout() {
		return continueCheckout;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAddCardtBackPack() {
		return addCardtBackPack;
	}

	public WebElement getCartVerify() {
		return cartVerify;
	}

	public List<WebElement> getProductName() {
		return productName;
	}

	public List<WebElement> getProductDescription() {
		return productDescription;
	}

	public List<WebElement> getProductPrice() {
		return productPrice;
	}

	public WebElement getCartProdName() {
		return cartProdName;
	}

	public WebElement getCartProdPrice() {
		return cartProdPrice;
	}

	public WebElement getCartProdDescription() {
		return cartProdDescription;
	}

	public WebElement getRemoveCardtBackPack() {
		return removeCardtBackPack;
	}

}
