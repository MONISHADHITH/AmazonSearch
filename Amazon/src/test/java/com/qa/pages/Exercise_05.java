package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise_05 {
	WebDriver driver;
	@FindBy(id = "twotabsearchtextbox")
	WebElement Search;

	public WebElement getSearch() {
		return Search;
	}
	@FindBy(id="low-price")
	WebElement minSearch;

	public WebElement getMinSearch() {
		return minSearch;
	}
	@FindBy(id="high-price")
	WebElement maxSearch;

	public WebElement getMaxSearch() {
		return maxSearch;
	}
	@FindBy(xpath="//*[@id='a-autoid-1']/span/input")
	WebElement Go;

	public WebElement getGo() {
		return Go;
	}
	@FindBy(xpath="//body")
	WebElement allText;
	public WebElement getAllText() {
		return allText;
	}
	public Exercise_05(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}