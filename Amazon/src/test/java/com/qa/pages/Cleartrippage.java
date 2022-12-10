package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cleartrippage {
	
	WebDriver driver;
	@FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")//c-p/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]ointer c-neutral-900
	WebElement popupClose;
	public WebElement getpopupClose()
	{
		return popupClose;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
	WebElement from;
	public WebElement getFrom()
	{
		return from;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]")
	WebElement clickFrom;
	public WebElement getclickFrom()
	{
		return clickFrom;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
	WebElement to;
	public WebElement getTo()
	{
		return to;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/div[2]")
	WebElement clickTo;
	public WebElement getclickTo()
	{
		return clickTo;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/button[1]")
	WebElement clickClan;
	public WebElement getClickClan()
	{
		return clickClan;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]/span")
	WebElement clickSearch;
	public WebElement getclickSearch()
	{
		return clickSearch;
	}
	
	public Cleartrippage(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	 }	

}














































//package com.qa.pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Cleartrippage
//{
//  WebDriver driver;
//  @FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")
//  WebElement Close;
//  public WebElement getClose()
//  {
//	  return Close;
//  }
//  @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/button")
//  WebElement Oneway;
//  public WebElement getOneway()
//  {
//	  return Oneway;
//  }
//  @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/button/div/div/span")
//  WebElement Count;
//  public WebElement getCount()
//  {
//	  return Count;
//  }
//  @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
//  WebElement source;
//  public WebElement getSource()
//  {
//	  return source;
//  }
//  @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
//  WebElement destination;
//  public WebElement getDestination()
//  {
//	  return destination;
//  }
//  @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/button[1]/div")
//  WebElement arrival;
//  public WebElement getArrival()
//  {
//	  return arrival;
//  }
//  @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/button[2]/div")
//  WebElement departure;
//  public WebElement getdeparture()
//  {
//	  return departure;
//  }
//  @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]/span")
//  WebElement searchflights;
//  public WebElement getSearchFlights()
//  {
//	  return searchflights;
//  }
//  public Cleartrippage(WebDriver driver)
//  {
//	  this.driver=driver;
//	  PageFactory.initElements(driver, this);
//  }
//}
