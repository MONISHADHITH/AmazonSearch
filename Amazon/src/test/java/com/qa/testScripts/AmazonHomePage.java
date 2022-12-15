package com.qa.testScripts;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AmazonHomePage {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();	 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("Asus Mobiles"+Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor JSE=(JavascriptExecutor)driver;
    	JSE.executeScript("window.scrollBy(0,3900)");
    	Thread.sleep(3000);
    	JSE.executeScript("window.scrollBy(0,-3900)");
    	Thread.sleep(3000);
//		String title=driver.getTitle();
//		System.out.println(title);
//		if(title.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
//		{
//			System.out.println("title = "+title);
//		}
//		else {
//			System.out.println("title is wrong");
//		}
		driver.quit();

	}

}