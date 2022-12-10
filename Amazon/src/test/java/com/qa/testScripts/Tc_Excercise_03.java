package com.qa.testScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.AmazonPages_02;
import com.qa.pages.Excercisepages_03;
import com.qa.utility.ExcelUtility;

public class Tc_Excercise_03 extends TestBase{
	Excercisepages_03 ex2;
	@DataProvider(name="getData")
	public String[][] getData()throws IOException{
		String xFile="C:\\Users\\monis\\eclipse-workspace\\Amazon\\src\\test\\java\\com\\qa\\testData\\amazon.xlsx";
		String xSheet="sheet1";
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
	}
	@Test(dataProvider = "getData")
	public void search(String category, String itemname) throws InterruptedException, IOException
	{
		ex2=new Excercisepages_03(driver);
		SoftAssert SAssert = new SoftAssert();
		System.out.println(itemname);
		//Thread.sleep(4000);
		ex2.getdropDown().click();
		Select select = new Select(ex2.getdropDown());
		Thread.sleep(4000);
		select.selectByVisibleText(category);
		Thread.sleep(4000);
		ex2.getsearchBox().sendKeys(itemname+Keys.ENTER);
		Thread.sleep(4000);
		ex2.getsearchBox().clear();
		boolean contains = driver.getTitle().contentEquals(itemname);//.contentEquals(itemname);
		System.out.println(driver.getTitle());
		if(contains) {
			SAssert.assertTrue(true);		
			Reporter.log("Title has the search term",true);
		}
		else 
			{
				captureScreenshot(driver,"itemname");  
				SAssert.assertTrue(false);
				Reporter.log("Incorrect title",true);
			}
		SAssert.assertAll();
     }

}