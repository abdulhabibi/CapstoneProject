package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class LaptopPageObj extends Base {

	public LaptopPageObj() {

		PageFactory.initElements(driver, this);

	}

	// Scenario: Add and Remove a Mac book from Cart
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement laptoptab;

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLaptop;

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
	private WebElement clickMacbook;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement AddMacBookToCart;

	@FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
	private WebElement MessageDisplay;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement ClickOnCartItems;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
	private WebElement ClickRedX;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement ZeroItemsInCart;

	public void clickOnLaptop() {
		WebDriverUtility.clickOnElement(laptoptab);
	}

	public void clickShowAll() {
		WebDriverUtility.clickOnElement(ShowAllLaptop);
	}

	public void clicOnMacbook() {
		WebDriverUtility.clickOnElement(clickMacbook);
	}

	public void clickAddMacBook() {
		WebDriverUtility.clickOnElement(AddMacBookToCart);
	}

	public boolean messageDisplayed() {
		boolean messageDisplayed = MessageDisplay.isDisplayed();
		return messageDisplayed;
	}

	public void CartItems() {
		WebDriverUtility.clickOnElement(ClickOnCartItems);
	}

	public void ClickRedX() {
		WebDriverUtility.clickOnElement(ClickRedX);
	}

	public void ZeroItemsInCart() {
		WebDriverUtility.clickOnElement(ZeroItemsInCart);
	}

	// Scenario: Product Comparison
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement clickCompareMac;

	@FindBy(css = "div.container:nth-child(4) div.row div.col-sm-9 div.row:nth-child(7) div.product-layout.product-grid.col-lg-4.col-md-4.col-sm-6.col-xs-12:nth-child(3) div.product-thumb div:nth-child(2) div.button-group > button:nth-child(3)")
	private WebElement clickCompareMacAir;

	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement clickCompareLink;

	@FindBy(css = "body:nth-child(2) div.container:nth-child(4) div.row div.col-sm-12 > h1:nth-child(1)")
	private WebElement seeComparison;

	public void clickCompareMac() {
		WebDriverUtility.clickOnElement(clickCompareMac);
	}

	public void clickCompareMacAir() {
		WebDriverUtility.clickOnElement(clickCompareMacAir);
	}

	public void clickCompareLink() {
		WebDriverUtility.clickOnElement(clickCompareLink);
	}

	public boolean SeeComparison() {
		boolean SeeComparison = seeComparison.isDisplayed();
		return SeeComparison;
	}

	// Scenario: Adding an item to Wish list
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement lapTopsNoteBooks;

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptopsNoteBooks;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToWishList;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement wishListMessage;

	public void clickOnLaptopsNoteBooks() {
		WebDriverUtility.clickOnElement(lapTopsNoteBooks);
	}

	public void clickOnShowAllLaptopsNoteBooks() {
		WebDriverUtility.clickOnElement(showAllLaptopsNoteBooks);
		WebDriverUtility.screenShot();
	}

	public void clickOnAddToWishList() {
		WebDriverUtility.clickOnElement(addToWishList);
	}

	public boolean wishListMessage() {
		boolean successMessage = wishListMessage.isDisplayed();
		return successMessage;
	}

	// Scenario: Validate the price of MacBook Pro is 2000

	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookPro;

	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement macBookPrice;

	public void clickOnMacBookPro() {
		WebDriverUtility.clickOnElement(macBookPro);
		WebDriverUtility.screenShot();
	}

	public boolean macBookPrice() {
		boolean priceTag = macBookPrice.isDisplayed();
		return priceTag;
	}
}