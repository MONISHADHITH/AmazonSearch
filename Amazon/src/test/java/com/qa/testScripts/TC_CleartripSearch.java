package com.qa.testScripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Cleartrippage;
import com.qa.utility.ExcelUtility;

public class TC_CleartripSearch extends TestBase{
	
	Cleartrippage ex2;
	@DataProvider(name="getData")
	public String[][] getData()throws IOException{
		String xFile="C:\\Users\\monis\\eclipse-workspace\\Amazon\\src\\test\\java\\com\\qa\\testData\\cleartrip.xlsx";
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
	public void bookFlight(String from,String to,String date) throws InterruptedException, AWTException
	{
		
		ex2 = new Cleartrippage(driver);
		Robot robot = new Robot();
		ex2.getFrom().click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		ex2.getFrom().sendKeys(from);
		Thread.sleep(4000);
		ex2.getclickFrom().click();
		ex2.getTo().click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		ex2.getTo().sendKeys(to);
		Thread.sleep(4000);
    	ex2.getclickTo().click();
    	ex2.getclickSearch().click();
		Thread.sleep(6000);
		driver.get("https://www.cleartrip.com/flights");
	}

}














































//package com.qa.testScripts;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import com.qa.pages.Cleartrippage;
//
//public class TC_CleartripSearch extends TestBase
//{
//	Cleartrippage CTpage;
//	@Parameters({"browser","url"})
//	@Test
//	public void Search(String browser,String url) throws InterruptedException
//	{
//		Cleartrippage CTpage=new Cleartrippage(driver);
//		CTpage.getClose().click();
//		CTpage.getCount().click();
///*		CTpage.getOneway().click();
//		Select select=new Select(CTpage.getOneway());
//		Thread.sleep(3000);
//		select.selectByVisibleText("One way");
//*/		
//		
////		select.selectByValue("oneway");
////		CTpage.getSource().click();
//	}
//	
//	
//}
