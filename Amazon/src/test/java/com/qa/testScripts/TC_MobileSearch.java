package com.qa.testScripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.MobilesPage;

public class TC_MobileSearch extends TestBase
{
	MobilesPage Mpage;
	@Parameters({"browser","url"})
	@Test
	public void mobileSearch(String browser,String url ) throws InterruptedException, IOException
	{
		 Mpage=new MobilesPage(driver);
	
		 Mpage.getMobiles().click();
		 
		 
//		Actions actions=new Actions(driver);
//		actions.moveToElement(Mpage.getMobiles());
//		Action action=actions.keyDown(Mpage.getMobiles(),Keys.SHIFT).keyUp(Mpage.getMobiles(),Keys.SHIFT).build();
//		action.perform();
//		
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("window.scroll(0,350)","");
		Thread.sleep(3000);
		
//		actions.moveToElement(Mpage.getBrand());
//		Action action2=actions.keyDown(Mpage.getMobiles(),Keys.SHIFT).keyUp(Mpage.getMobiles(),Keys.SHIFT).build();
//		action2.perform();
//		Thread.sleep(3000);
		
		Mpage.getBrand().click();

  	    JS.executeScript("window.scroll(0,500)","");
		Thread.sleep(3000);
		
		Mpage.getMinPrice().sendKeys("10000");
		Thread.sleep(1000);
		
		Mpage.getMaxPrice().sendKeys("25000");
		Thread.sleep(1000);
		
		Mpage.getGo().click();
		Thread.sleep(3000);
		
		String str=Mpage.getAllText().getText();
		System.out.println(str);
		
		SoftAssert sa = new SoftAssert();
		boolean title = driver.getTitle().contains("Amazon.in");
		if(title) {
			sa.assertTrue(true);
			Reporter.log("Title matched",true);
		}
		else {
			captureScreenshot(driver, "Title");
			sa.assertTrue(false);
			Reporter.log("title not matched",true);
		}
		sa.assertAll();
//	
		}
	@Parameters({"browser","url"})
	@Test
	public void televsionSearch() throws IOException
	{
		 Mpage=new MobilesPage(driver);
		 SoftAssert sa = new SoftAssert();
		 Mpage.getSearch().clear();
		 Mpage.getSearch().sendKeys("Televisions"+Keys.ENTER);
		 Mpage.getMinPrice().sendKeys("10000");
		 Mpage.getMaxPrice().sendKeys("25000");
		 Mpage.getGo().click();
			String str=Mpage.getAllText().getText();
			System.out.println(str);
			boolean title = driver.getTitle().contains("Televisions");
			if(title) {
				sa.assertTrue(true);
				Reporter.log("Title matched",true);
			}
			else {
				captureScreenshot(driver, "Title");
				sa.assertTrue(false);
				Reporter.log("title not matched",true);
			}
			sa.assertAll();
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
