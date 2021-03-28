package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObj extends Base {

	public DesktopPageObj() {
		// we will use initElements method of PageFactory class to initialize the
		// Webelements of UI
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktop;

	// Second Scenario
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hpLP3065;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplay;

	// Third Scenario
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement addToCart;

	@FindBy(xpath = "//select[@id='input-option226']//option[contains(text(),'Red')]")
	private WebElement selectColor;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement QTY;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplaySuccess;

	// Fourth Scenario
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement clickCanon;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement clickReviewLink;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement enterName;

	@FindBy(css = "#input-review")
	private WebElement enterReview;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[3]")
	private WebElement clickBadOrGood;

	@FindBy(css = "#button-review")
	private WebElement clickContinue;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement reviewMessage;

	// We start writing public methods to access each element with respected actions
	// to them.

	public void clickOnDesktop() {
		WebDriverUtility.clickOnElement(desktopTab);
	}

	public void clickOnShowAllDesktop() {
		WebDriverUtility.clickOnElement(showAllDesktop);
	}

// Second Scenario 
	public void clickonHp() {
		WebDriverUtility.clickOnElement(hpLP3065);
	}

	public void addToCartBtn() {
		WebDriverUtility.clickOnElement(addToCartBtn);
	}

	public boolean messageDisplayed() {
		boolean messageDisplayed = messageDisplay.isDisplayed();
		return messageDisplayed;
	}

	// Third Scenario
	public void addToCart() {
		WebDriverUtility.clickOnElement(addToCart);
	}

	public void selectColor() {
		WebDriverUtility.clickOnElement(selectColor);
	}

	public void selectQuantity1() {
		WebDriverUtility.clickOnElement(QTY);
	}

	public void addToCartButton() {
		WebDriverUtility.clickOnElement(addToCartButton);
	}

	public boolean messageDisplaySuccess() {
		boolean messageDisplayed = messageDisplaySuccess.isDisplayed();
		return messageDisplayed;
	}
// Fourth Scenario 

	public void clickCanon() {
		WebDriverUtility.clickOnElement(clickCanon);
	}

	public void clickReviewLink() {
		WebDriverUtility.clickOnElement(clickReviewLink);
	}

	
	public void enterValueToName(String value) {
		WebDriverUtility.enterValue(enterName, value);
	}

	public void enterValueToReview(String value) {
		WebDriverUtility.enterValue(enterReview, value);
	}
	

	public void clickBadorGood() {
		WebDriverUtility.clickOnElement(clickBadOrGood);	
	}

	public void clicContinue() {
		WebDriverUtility.clickOnElement(clickContinue);
	}

	public boolean reviewMessage() {
		boolean reviewMessageDisplayed = reviewMessage.isDisplayed();
		return reviewMessageDisplayed;
	}
}