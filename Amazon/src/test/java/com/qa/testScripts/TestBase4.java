package com.qa.testScripts;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.AmazonPages;
import com.qa.pages.Execrisepages_01;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase4 {
	 Execrisepages_01 ex;
     WebDriver driver;
     @Parameters({"browser","url"})
     @BeforeClass
     public void setUp(String browser,String url)throws IOException
     {
    	 if(browser.equalsIgnoreCase("chrome"))
    	 {
    		 WebDriverManager.chromedriver().setup();
    		 driver=new ChromeDriver(); 
    	 }
    	 else if(browser.equalsIgnoreCase("firefox"))
    	 {
    	       WebDriverManager.firefoxdriver().setup();
    	         driver = new FirefoxDriver();
    	 }
    	 else if(browser.equalsIgnoreCase("edge"))
    	 {
    		 String location="C:\\Users\\monis\\eclipse-workspace\\Amazon\\Edge\\msedgedriver.exe";
    		 System.setProperty("webdriver.edge.driver", location);
    		 driver= new EdgeDriver();
    	 }
    	 
    	 ex = new Execrisepages_01(driver);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.get(url);
    	 
     }
     
     @AfterClass
     public void tearDown()
     {
    	 driver.manage().deleteAllCookies();
    	 driver.close();
     }

}