package com.qa.testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPage;

public class TC_AmazonSearch extends TestBase
{
	AmazonPage amzPage;
  @Test
  public void Search() throws InterruptedException
  {
	  AmazonPage amzPage=new AmazonPage(driver);
	  amzPage.getSearch().sendKeys("Asus Mobiles"+Keys.ENTER);
	  Thread.sleep(3000);
	  JavascriptExecutor JS=(JavascriptExecutor)driver;
//	  JS.executeScript("window.scroll(0,3900)","");
//	  Thread.sleep(3000);
	  JS.executeScript("window.scroll(0,document.body.scrollHeight)","");
	  Thread.sleep(3000);
	  JS.executeScript("window.scroll(0,0)","");
	  Thread.sleep(3000);
	  
//	  JS.executeScript("window.scrollBy(0,3900");
//	  Thread.sleep(3000);
//	  JS.executeScript("window.scrollBy(0,-3900");
//	  Thread.sleep(3000);
  }
}
