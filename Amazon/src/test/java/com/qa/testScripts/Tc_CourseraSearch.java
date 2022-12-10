package com.qa.testScripts;
import com.qa.pages.*;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_CourseraSearch extends TestBase
{
	CourseraPage CourseraPage;
   @Parameters({"browser","url"})
   @Test
   public void SignUp(String browser,String url) throws InterruptedException
   {
	   CourseraPage=new CourseraPage(driver);
	   
	   CourseraPage.getClick().click();
	   CourseraPage.getFullName().sendKeys("HarryPotter");
	   CourseraPage.getEmail().sendKeys("harrypotter@gmail.com");	  
	   CourseraPage.getPassword().sendKeys("harry@123");
	 driver.navigate().to("https://www.coursera.org/");
	 //  CourseraPage.getClose().click();
	   CourseraPage.getSearch().sendKeys("python"+Keys.ENTER);
	   Thread.sleep(3000);
	   System.out.println(CourseraPage.getAllText().getText());
   }
}
