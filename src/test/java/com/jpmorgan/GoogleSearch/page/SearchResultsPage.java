package com.jpmorgan.GoogleSearch.page;

import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

	
	@FindBy(tagName = "h3")
	List<WebElement> searchResults;
	
	
	@FindBy(xpath = "//div[@class='logo-desktop-only']//img[@class='first-logo']")
	WebElement imgLogo;
	
	public void verifyLogo()
	{
		AssertJUnit.assertTrue(imgLogo.isDisplayed());
	}
	
	
	public void clickOnFirstLink()
	{
		searchResults.get(0).click();
	}
	
	public SearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
