package com.qa.testScripts;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.AmazonPages;
import com.qa.pages.Excercisepages_03;

import com.qa.pages.Execrisepages_01;


import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {
	 //Execrisepages_01 ex;
	 //Excerisepages_02 ex2;
	  //  AmazonPages amazon;
	 //SkillUpPages sk;
	  //ScrollPages ex2;
	  Excercisepages_03 ex2;
      WebDriver driver;
     @Parameters({"browser","url"})
     @BeforeClass
     public void setUp(String browser,String url)throws IOException
     {
    	 if(browser.equalsIgnoreCase("chrome"))
    	 {
    		 WebDriverManager.chromedriver().setup();
    		 driver=new ChromeDriver();
    		 //amazon=new AmazonPages(driver);
    		 
    	 }
    	 else if(browser.equalsIgnoreCase("firefox"))
    	 {
    	       WebDriverManager.firefoxdriver().setup();
    	         driver = new FirefoxDriver();
    	 }
    	 else if(browser.equalsIgnoreCase("edge"))
    	 {
    		 String location="C:\\Users\\ELCOT\\eclipse-workspace\\Amazon\\EdgeExe V-107\\msedgedriver.exe";
    		 System.setProperty("webdriver.edge.driver", location);
    		// WebDriverManager.edgedriver().setup();
    		 driver= new EdgeDriver();
    	 }
    	 //amazon=new AmazonPages(driver);
    	//sk= new SkillUpPages(driver);
    	// ex2=new Excerisepages_02 (driver);
    	// ex2=new ScrollPages(driver);
    	 ex2=new Excercisepages_03(driver);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.get(url);
		// ex2.getpopupClose().click();
    	 
     }
     
     @AfterClass
     public void tearDown()
     {
    	 driver.manage().deleteAllCookies();
    	 driver.close();
     }
     public void captureScreenshot(WebDriver driver, String tName) throws IOException {
 		
 		TakesScreenshot ts = (TakesScreenshot)driver;
 		File source = ts.getScreenshotAs(OutputType.FILE);
 		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");		
 		FileUtils.copyFile(source, target);
 		}
 		
 		
}