package com.qa.testScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages_02;
import com.qa.utility.ExcelUtility;

public class Tc_AmazonSearch_002 extends TestBase_03 {
	
	AmazonPages_02 amzPages;
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
	
	//@Parameters({"browser","url"})
	@Test(dataProvider = "getData")
	public void search(String category, String itemname) throws InterruptedException
	{
		amzPages = new AmazonPages_02(driver);
		Thread.sleep(4000);
		amzPages.getdropDown().click();
		Select select = new Select(amzPages.getdropDown());
		Thread.sleep(4000);
		select.selectByVisibleText(category);
		Thread.sleep(4000);
		amzpages.getsearchBox().sendKeys(itemname+Keys.ENTER);
		Thread.sleep(4000);
		amzpages.getsearchBox().clear();
		
     }
}