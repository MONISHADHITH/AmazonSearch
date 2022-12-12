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

import com.qa.pages.Exercise_05;
//import com.qa.pages.AmazonPages;
//import com.qa.pages.Exercise_01;
//import com.qa.pages.Exercise_02;
//import com.qa.pages.Exercise_03;
//import com.qa.pages.Exercise_04;
//import com.qa.pages.HtmlLog;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	// AmazonPages amazon;
	// Exercise_01 Exercise;
	// Exercise_02 exe2;
	// Exercise_03 exe;
	//HtmlLog log;
	// Exercise_04 scroll;
	Exercise_05 mobtel;
	WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setUp(String browser, String url) throws IOException {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"F:\\FileHistory\\Admin\\GOWTHAM\\Data\\AmazonNew\\EdgeV106\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		// amazon=new AmazonPages(driver);
		// Exercise = new Exercise_01(driver);
		// exe2 = new Exercise_02(driver);
		// exe = new Exercise_03(driver);
		// scroll = new Exercise_04(driver);
		//log = new HtmlLog(driver);
		mobtel =new Exercise_05(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
		// exe.getpopupClose().click();
	}

	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

	public void captureScreenshot(WebDriver driver, String tName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tName + ".png");
		FileUtils.copyFile(source, target);
	}

}