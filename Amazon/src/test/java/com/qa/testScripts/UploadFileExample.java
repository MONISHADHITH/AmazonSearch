package com.qa.testScripts;

import java.awt.Toolkit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://easyupload.io/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      JavascriptExecutor JS= (JavascriptExecutor)driver;
      JS.executeScript("window.scroll(0,390)","");
      Thread.sleep(3000);
     String File= "\"C:\\Users\\monis\\OneDrive\\Desktop\\File.txt\"";
      
      WebElement ClickFile=driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div[2]/button"));
      ClickFile.click();
    	
//     StringSelection selection=new StringSelection(File);
    Toolkit.getDefaultToolkit().
     
	}

}
