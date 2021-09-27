package com.jpmorgan.GoogleSearch.page;

import org.bouncycastle.jcajce.provider.symmetric.TEA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
	@FindBy(name = "q")
	private WebElement txtBoxsearch;
	
	
	@FindBy(name = "btnK")
	private WebElement buttonSearch;
	
	
	public void enterTexttoSearch(String txt)
	{
		System.out.println("Entering " + txt + " in google search box");
		txtBoxsearch.sendKeys(txt);
	}

	
	public void clickOnSearch()
	{
		System.out.println("Clicking on Search button");
		buttonSearch.click();
	}
	
	
	public GooglePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
}
