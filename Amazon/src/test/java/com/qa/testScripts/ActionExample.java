package com.qa.testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionExample
{
  public static void main(String...args) throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  Actions Builder=new Actions(driver);
	  WebElement lists=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
	  Builder.moveToElement(lists).build().perform();
	  Thread.sleep(3000);
	  
	  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	  Builder.moveToElement(search).build().perform();
	  Thread.sleep(3000);
	  
	  Action seriesOfActions;
	  seriesOfActions=Builder
	.sendKeys(search,"Asus Mobiles"+Keys.ENTER).build();
	
	  seriesOfActions.perform();
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,3250)");
	  Thread.sleep(3000);
	  
	  WebElement onClick=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[17]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	  Builder.moveToElement(onClick).build().perform();
	  
	  seriesOfActions=Builder.keyDown(onClick, Keys.CONTROL)
	.keyUp(onClick, Keys.CONTROL)
	.build();
	  seriesOfActions.perform();
	  
//	  seriesOfActions=Builder.keyDown(onClick, Keys.SHIFT)
//				.keyUp(onClick, Keys.SHIFT)
//				.build();
//				  seriesOfActions.perform();

	  driver.navigate().to("https://jqueryui.com/droppable/");
	  driver.switchTo().frame(0);
	  WebElement SourceElement=driver.findElement(By.id("draggable"));
      WebElement TargetElement=driver.findElement(By.id("droppable"));
      Thread.sleep(3000);
      
 //     Builder.dragAndDrop(SourceElement, TargetElement).build().perform();
      Builder.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
      Thread.sleep(3000);
	  driver.quit();
  }
}
