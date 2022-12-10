package com.qa.testScripts;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.*;
public class TC_AmazonSearch_001  extends TestBase{
	
	AmazonPages amzpages;
	@Parameters({"browser","url"})
	@Test
	public void Search(String browser,String Url) throws InterruptedException
	{
		amzpages = new AmazonPages(driver);
		amzpages.getSearchBox().sendKeys("Da Vince Code"+Keys.ENTER);
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println("==========TEST CASE 001=========");
		if(title.contains("Da Vince Code"))
			System.out.println("User Landed on Da Vince Code page");
		else
			System.out.println("User NOT Landed on Da Vince Code page"); 
	}
	
	@Parameters({"browser","url"})
	@Test
	public void signIn(String browser,String url)
	{
		
		amzpages = new AmazonPages(driver);
		Actions action = new Actions(driver);
		action.moveToElement(amzpages.getcursorTouch()).build().perform();
		amzpages.getclickLink().click();
		amzpages.getname().sendKeys("vijay");
		amzpages.getphoneNumber().sendKeys("9361334647");
		amzpages.getpassword().sendKeys("12636Vijay");
		amzpages.getsubmit().click();
		System.out.println("==========TEST CASE 002=========");
		String title = driver.getTitle();
		if(title.contains("required"))
		{
			System.out.println("can not move here after");
		}
		else
		{
			System.out.println("phone no in use plz use alternate phn no");
		}
	  
	}
	@Parameters({"browser","url"})
	@Test
	public void amazonSuggestions(String browser,String url) throws InterruptedException
	{
		amzpages = new AmazonPages(driver);
		amzpages.getSearchBox().clear();
		amzpages.getSearchBox().sendKeys("samsung");
		Thread.sleep(5000);
		List <WebElement>suggestions=amzpages.getSearchSugesstions();
		for(WebElement result:suggestions)
		{
			System.out.println(result.getText());
			String text = result.getText();
			if(text.contains("ultra"))
			{
				result.click();
				break;
			}
		}
		String title = driver.getTitle();
		System.out.println("==========TEST CASE 003=========");
		System.out.println(title);
		if(title.contains("ultra"))
		{
			System.out.println("page is on samsung ultra");
		}
		else
		{
			System.out.println("plz choose another option");
		}
		System.out.println("================TEXT OF THE PAGE==================");
		System.out.println(amzpages.getallText());
	}
    
}
