package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseraPage 
{
  WebDriver driver;
  @FindBy(xpath="//*[@id=\"rendered-content\"]/div/main/section[1]/div/div[1]/button/span")
  WebElement Click;
  public WebElement getClick()
  {
	  return Click;
  }
  @FindBy(id="name")
  WebElement FullName;
  public WebElement getFullName()
  {
	  return FullName;
  }
  
  @FindBy(id="email")
  WebElement Email;
  public WebElement getEmail()
  {
	  return Email;
  }
  @FindBy(id="password")
  WebElement Password;
  public WebElement getPassword()
  {
	  return Password;
  }
 /* @FindBy(xpath="/html/body/div[10]/div/div/button/svg")
  WebElement Close;
  public WebElement getClose()
  {
	  return Close;
  }*/
  @FindBy(xpath="//*[@id=\"rendered-content\"]/div/header/div/div/div/div[1]/div[3]/div/form/div/div/div[1]/div[1]/input")
  WebElement Search;
  public WebElement getSearch()
  {
	  return Search;
  }
  @FindBy(xpath="//body")
  WebElement AllText;
  public WebElement getAllText()
  {
	  return AllText;
  }
  
  public CourseraPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
}
