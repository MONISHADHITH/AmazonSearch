package com.qa.testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();	 
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement getMobiles=driver.findElement(By.linkText("Mobiles"));
	getMobiles.click();
	
	JavascriptExecutor JS=(JavascriptExecutor)driver;
	JS.executeScript("window.scroll(0,350)","");
	Thread.sleep(3000);
    }
}
