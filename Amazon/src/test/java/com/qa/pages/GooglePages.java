package com.qa.pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
	
	WebDriver driver;
	@FindBy(name="q")
	WebElement search;
	public WebElement getSearch()
	{
		return search;
	}
	// "//div[@class='autocomplete-results-container']//following::div"  /html/body/div[1]/header/div/div[2]/div/div[2]
	@FindBy(xpath="//ul[@role='listbox']//following::li")
	List <WebElement> searchSugesstions;
	public List <WebElement>  getSearchSugesstions()
	{
		return searchSugesstions;
	}
	
	@FindBy(xpath="/html/body/div[7]/div/div[4]/div/div[1]/div/div[1]/div/div[2]/a")
	WebElement shopping;
	public WebElement getshopping()
	{
		return shopping;
	}
	@FindBy(xpath="//body")
	WebElement allText;
	public WebElement getallText()
	{
		return allText;
	}
	 public GooglePages(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	 }	

}