package com.qa.testScripts;

import java.awt.AWTException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileExample 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://easyupload.io/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      JavascriptExecutor JS= (JavascriptExecutor)driver;
      JS.executeScript("window.scroll(0,390)","");
      Thread.sleep(3000);
    
      
   
      WebElement ChooseFile=driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div[2]/button"));
      ChooseFile.click();
    	
      Thread.sleep(3000);
      
      String File= "C:\\Users\\monis\\OneDrive\\Desktop\\a.txt";
      StringSelection selection=new StringSelection(File);
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
      
      
      Robot robot=new Robot();
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
      
      Thread.sleep(3000);
      driver.navigate().refresh();
      
      Thread.sleep(3000);
      driver.quit();
     
	}

}
