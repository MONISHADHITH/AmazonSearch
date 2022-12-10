package com.qa.pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AmazonPages {
	
	 WebDriver driver;
	 @FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
	 WebElement searchbox;
	 public WebElement getSearchBox()
	 {
		 return searchbox;
	 }
	 
	 @FindBy(id="nav-link-accountList")
	 WebElement mouseMovement;
	 public WebElement getmouseMovement()
	 {
		 return mouseMovement;
	 }
	 @FindBy(id="nav-link-accountList")
	 WebElement cursorTouch;
	 public WebElement getcursorTouch()
	 {
		 return cursorTouch;
	 }
	 @FindBy(linkText="Start here.")
	 WebElement clickLink;
	 public WebElement getclickLink()
	 {
		 return clickLink;
	 }
	 @FindBy(id="ap_customer_name")
	 WebElement name;
	 public WebElement getname()
	 {
		 return name;
	 }
	 @FindBy(id="ap_phone_number")
	 WebElement phoneNumber;
	 public WebElement getphoneNumber()
	 {
		 return phoneNumber;
	 }
	 @FindBy(id="ap_password")
	 WebElement password;
	 public WebElement getpassword()
	 {
		 return password;
	 }
	 @FindBy(id="continue")
	 WebElement submit;
	 public WebElement getsubmit()
	 {
		 return submit;
	 }
	 @FindBy(xpath="/html/body/div[1]/header/div/div[2]/div/div[2]")
	 List <WebElement> searchSugesstions;
		public List <WebElement>  getSearchSugesstions()
		{
			return searchSugesstions;
		}
	@FindBy(xpath="//body")
	WebElement allText;
	public WebElement getallText()
	{
		return allText;
	}
	 public AmazonPages(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	 }	
}           