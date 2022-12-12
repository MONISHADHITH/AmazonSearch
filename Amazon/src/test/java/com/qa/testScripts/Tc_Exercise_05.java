package com.qa.testScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.Exercise_05;

public class Tc_Exercise_05 extends TestBase {
	Exercise_05 mt;
	@Parameters({"url","browsers"})
	@Test
	public void mobileSearch() throws IOException {
		mt=new Exercise_05(driver);
		SoftAssert sa = new SoftAssert();
		mt.getSearch().sendKeys("mobiles 5g"+Keys.ENTER);
		mt.getMinSearch().sendKeys("10000");
		mt.getMaxSearch().sendKeys("25000");
		mt.getGo().click();
		String str=mt.getAllText().getText();
		System.out.println(str);
		boolean title = driver.getTitle().contains("mobiles");
		if(title) {
			sa.assertTrue(true);
			Reporter.log("Title matched",true);
		}
		else {
			captureScreenshot(driver, "Title");
			sa.assertTrue(false);
			Reporter.log("title not matched",true);
		}
		sa.assertAll();
	}
	@Parameters({"url","browsers"})
	@Test
	public void televisionSearch() throws IOException {
		mt=new Exercise_05(driver);
		SoftAssert sa = new SoftAssert();
		mt.getSearch().clear();
		mt.getSearch().sendKeys("television"+Keys.ENTER);
		mt.getMinSearch().sendKeys("10000");
		mt.getMaxSearch().sendKeys("25000");
		mt.getGo().click();
		String str=mt.getAllText().getText();
		System.out.println(str);
		boolean title = driver.getTitle().contains("television");
		if(title) {
			sa.assertTrue(true);
			Reporter.log("Title matched",true);
		}
		else {
			captureScreenshot(driver, "Title");
			sa.assertTrue(false);
			Reporter.log("title not matched",true);
		}
		sa.assertAll();
	}
	
}