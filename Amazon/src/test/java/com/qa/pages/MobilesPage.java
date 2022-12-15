package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesPage 
{
	MobilesPage Mpage;
	WebDriver driver;
	@FindBy(linkText="Mobiles") // xpath = //a[text()='']
	WebElement Mobiles;
	public WebElement getMobiles()
	{
		return Mobiles;
	}
	@FindBy(xpath="//*[@id=\"s-refinements\"]/div[5]/ul/li[3]/span/a/span")
	WebElement Brand;
	public WebElement getBrand()
	{
		return Brand;
	}
	@FindBy(id="low-price")
	WebElement MinPrice;
	public WebElement getMinPrice()
	{
		return MinPrice;
	}
	@FindBy(id="high-price")
	WebElement MaxPrice;
	public WebElement getMaxPrice()
	{
		return MaxPrice;
	}
	@FindBy(xpath="//*[@id=\"a-autoid-1\"]/span/input")
	WebElement Go;
	public WebElement getGo()
	{
		return Go;
	}
	@FindBy(xpath="//body")
	WebElement alltext;
	public WebElement getAllText()
	{
		return alltext;
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	public WebElement getSearch()
	{
		return search;
	}
	
	public MobilesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
