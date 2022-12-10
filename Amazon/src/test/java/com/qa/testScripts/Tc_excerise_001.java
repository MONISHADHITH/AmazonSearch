package com.qa.testScripts;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Execrisepages_01;
public class Tc_excerise_001 extends TestBase4 {
	Execrisepages_01 ex;
	@Parameters({"url","browser"})
	@Test
	public void CreateAccount() throws InterruptedException
	{
		ex=new Execrisepages_01(driver);
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		ex.getEmail().click();
		String title1= driver.getTitle();
		System.out.println(title1);
		ex.getcreateAccount().click();
		ex.getfirstName().sendKeys("Harry");
		ex.getlastName().sendKeys("Potter");
		ex.getUsername().sendKeys("HarryPotter12a3@gmail.com");
		ex.getPasswd().sendKeys("HarryPotter");
		ex.getConfirmPasswd().sendKeys("HarryPotter");
		
	}

}