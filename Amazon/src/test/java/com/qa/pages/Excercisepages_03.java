package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Excercisepages_03 {
	
	WebDriver driver;
	@FindBy(id="searchDropdownBox")
	WebElement dropDown;
	public WebElement getdropDown()
	{
		return dropDown;
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	public WebElement getsearchBox()
	{
		return searchBox;
	}
	public Excercisepages_03(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	 }	

}