package com.qa.testScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Amazon\\chromeV106\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		// GO TO BOTTOM OF THE PAGE
		//executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		//Thread.sleep(3000);
		//executor.executeScript("window.scrollTo(0,0)", "");
		
		// go to a specfic postion
		
		/*WebElement link = driver .findElement(By.linkText("Discover your style"));
		executor.executeScript("arguments[0].scrollIntoView(true)", link);
		driver.quit();*/
	}
	/*
	 *IMAGES EXANPLE
	 * driver.get("https://testleaf.herokuapp.com/pages/Image.html");
		WebElement imageFirst=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		imageFirst.click();
		driver.navigate().back();
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("image is broken");
		}
		else
		{
			System.out.println("image is not broken");
		}
		
		driver.quit();
		===================================================================================
		IFRAMES
		driver.get("https://testleaf.herokuapp.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("click"));
		button1.click();
	    String text=button1.getText();
	    System.out.println(text);
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    driver.switchTo().frame("frame2");
	    WebElement nclick= driver.findElement(By.id("click1"));
	    nclick.click();
	    driver.switchTo().defaultContent();
	   
	    List<WebElement>nooflinks= driver.findElements(By.tagName("iframe"));
	  
	    int link= nooflinks.size();
	    System.out.println("no.of.links ="+link);
	    =========================================================================================
	    ALERT 
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("akash");
		driver.findElement(By.xpath("*[@id=\"password\"]")).sendKeys("12345");
		driver.findElement(By.name("proceed")).click();
		///html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[1]
		////*[@id="password"]
		Alert alert =driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();
		driver.quit();
	  
	 */

}