package stepDefinitions;
import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class DesktopDefinitions extends Base {

	DesktopPageObj desktoppageobj = new DesktopPageObj();

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		desktoppageobj.clickOnDesktop();
		logger.info("User click on Desktops tab");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		desktoppageobj.clickOnShowAllDesktop();
		logger.info("User click on Show all desktops");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		
	}

	// Second Scenario
	@When("^User click on ‘HP LP(\\d+)’ item$")
	public void user_click_on_HP_LP_item(int arg1) throws Throwable {
		desktoppageobj.clickonHp();
		logger.info("User click on ‘HP LP");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desktoppageobj.addToCartBtn();
		logger.info("User click add to Cart button");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1)
			throws Throwable {
		desktoppageobj.messageDisplaySuccess();
		logger.info("User should see a message ‘Success: you have added HP LP ");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	// Third Scenario

	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desktoppageobj.addToCart();
		logger.info("User click ADD TO CART option on ‘Canon EOS");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		desktoppageobj.selectColor();
		logger.info("User select color from dropdown ‘Red’");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		desktoppageobj.selectQuantity1();
		logger.info("User select quantity");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1)
			throws Throwable {
		desktoppageobj.messageDisplaySuccess();
		logger.info("User should see a message ‘Success: You have added Canon EOS (\\\\d+)D to your shopping cart");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	// Fourth Scenario

	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desktoppageobj.clickCanon();
		logger.info("User click on Canon EOS");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		desktoppageobj.clickReviewLink();
		logger.info("User click on write a review link");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		
	}

	@When("^User enter yourname '(.+)'")
	public void user_enter_yourname_name(String Habibi) throws Throwable {
		desktoppageobj.enterValueToName(Habibi);
		logger.info("User enter yourname");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User enter yourReview '(.+)'")
	public void user_enter_yourReview_Sucsess(String Habibi) throws Throwable {
		desktoppageobj.enterValueToReview(Habibi);
		logger.info("User enter yourReview");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}
	

	@When("^User click on Bad or Good Button$")
	public void user_click_on_Bad_or_Good_Button() throws Throwable {
		desktoppageobj.clickBadorGood();
		logger.info("User click on Bad or Good Button");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		desktoppageobj.clicContinue();
		logger.info("User click on Continue Button");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message with Thank you for your review\\. It has been submitted to the webmaster for approval\\.$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		desktoppageobj.reviewMessage();
		logger.info("User should see a message with Thank you for your review\\\\. It has been submitted to the webmaster for approval");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

}