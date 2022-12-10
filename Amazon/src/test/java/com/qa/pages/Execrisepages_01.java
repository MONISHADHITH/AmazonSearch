package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Execrisepages_01 {
	WebDriver driver;
	@FindBy(linkText="Gmail")
	WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
	@FindBy(xpath="/html/body/header/div/div/div/a[3]")
	WebElement createAccount;
	public WebElement getcreateAccount()
	{
		return createAccount;
	}
	@FindBy(name="firstName")
	WebElement firstName;
	public WebElement getfirstName() {
		return firstName;
	}
	@FindBy(name="lastName")
	WebElement lastName;
	public WebElement getlastName() {
		return lastName;
	}
	@FindBy(name="Username")
	WebElement Username;
	public WebElement getUsername() {
		return Username;
	}
	//Passwd
	@FindBy(name="Passwd")
	WebElement Passwd;
	public WebElement getPasswd() {
		return Passwd;
	}
	//ConfirmPasswd
	@FindBy(name="ConfirmPasswd")
	WebElement ConfirmPasswd;
	public WebElement getConfirmPasswd(){
		return ConfirmPasswd;
	}
	public Execrisepages_01(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	 }	

}