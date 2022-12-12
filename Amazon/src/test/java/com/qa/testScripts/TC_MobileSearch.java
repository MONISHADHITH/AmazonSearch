package com.qa.testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.MobilesPage;

public class TC_MobileSearch extends TestBase
{
	MobilesPage Mpage;
	@Parameters({"browser","url"})
	@Test
	public void Search() throws InterruptedException
	{
		 Mpage=new MobilesPage(driver);
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.moveToElement(Mpage.getMobiles());
		Action action=actions.keyDown(Mpage.getMobiles(),Keys.SHIFT).keyUp(Mpage.getMobiles(),Keys.SHIFT).build();
		action.perform();
//		Thread.sleep(3000);
		
//		JavascriptExecutor JS=(JavascriptExecutor)driver;
//		JS.executeScript("Windows.scroll(0,350)","");
//		Thread.sleep(3000);
//		
//		actions.moveToElement(Mpage.getBrand());
//		Action action2=actions.keyDown(Mpage.getMobiles(),Keys.SHIFT).keyUp(Mpage.getMobiles(),Keys.SHIFT).build();
//		action2.perform();
//		Thread.sleep(3000);
		
		Mpage.getBrand().click();
		Thread.sleep(3000);
		
//		JS.executeScript("Windows.scroll(0,500)","");
		Thread.sleep(3000);
		Mpage.getMinPrice().sendKeys("10000");
		Mpage.getMaxPrice().sendKeys("25000");
		Mpage.getGo().click();
	}
}
