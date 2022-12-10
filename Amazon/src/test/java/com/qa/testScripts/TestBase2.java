package com.qa.testScripts;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.GooglePages;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase2 {
	GooglePages googlePage;
	WebDriver driver;
    @Parameters({"browser","url"})
    @BeforeClass
    public void setUp(String browser,String url)throws IOException
    {
   	 if(browser.equalsIgnoreCase("chrome"))
   	 {
   		 WebDriverManager.chromedriver().setup();
   		 driver=new ChromeDriver();
   		 googlePage=new GooglePages(driver);
   		 driver.manage().window().maximize();
   		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
   		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
   		 driver.get(url);
   		 
   	 }
   	 else if(browser.equalsIgnoreCase("firefox"))
   	 {
   	       WebDriverManager.firefoxdriver().setup();
   	         driver = new FirefoxDriver();
   	         googlePage=new GooglePages(driver);
   			 driver.manage().window().maximize();
   			 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
   			 driver.get(url);
   	 }
   	 
    }
    
    @AfterClass
    public void tearDown()
    {
   	 driver.manage().deleteAllCookies();
   	 //driver.close();
    }
}