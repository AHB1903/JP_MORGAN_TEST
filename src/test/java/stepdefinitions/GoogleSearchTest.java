package stepdefinitions;

import org.testng.AssertJUnit;
import com.jpmorgan.GoogleSearch.page.GooglePage;
import com.jpmorgan.GoogleSearch.page.SearchResultsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.WebDriverUtils;

public class GoogleSearchTest extends WebDriverUtils{

	GooglePage gPage = null;
	SearchResultsPage sPage = null;
	@Given("User has opened Browser")
	public void user_has_opened_browser() {
	   getDriver();
	  
	}

	@Given("User has all pageobjects")
	public void user_has_all_pageobjects() {
		 gPage = new GooglePage(driver);
		 sPage = new SearchResultsPage(driver);   
	}

	@Given("user verify the google page")
	public void user_verify_the_google_page() {
	   driver.get("https://www.google.com/");
	   AssertJUnit.assertEquals("Google", driver.getTitle());
	    
	}

	@Given("enter {string} in the search box")
	public void enter_in_the_search_box(String string) {
	   gPage.enterTexttoSearch(string);
	    
	}

	@Given("click on search button")
	public void click_on_search_button() {
	   gPage.clickOnSearch();
	    
	}

	@When("user click on the first link")
	public void user_click_on_the_first_link() {
	   sPage.clickOnFirstLink();
	}

	@Then("user verify the logo of {string} is displayed")
	public void user_verify_the_logo_of_is_displayed(String string) {
	   
		sPage.verifyLogo();
	}

	@Then("close the browser")
	public void close_the_browser() {
	   closeBrowser();
	}


}
