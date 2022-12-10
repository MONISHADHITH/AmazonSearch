package com.qa.testScripts;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.GooglePages;
public class Tc_GoogleSuggestions_001 extends TestBase2{
	GooglePages google;
	@Parameters({"browser","url"})
	@Test
	public void search(String browser,String url)throws InterruptedException
	{
		google = new GooglePages(driver);
		google.getSearch().sendKeys("samsung");
		//System.out.println(google.getSearchSugesstions().getText());
		Thread.sleep(5000);
		List <WebElement> result = google.getSearchSugesstions();
		int pos = 0;
		for(WebElement item :result)
		{
			System.out.println(item.getText());
			pos++;
			//System.out.println(pos);
			if(pos==2)
			{
				item.click();
				break;
			}
			//String suggestion = item.getText();
			//System.out.println(suggestion);
			/*if(suggestion.contains("ultra"))
			{
				item.click();
				break;
			}*/
		}
		Thread.sleep(5000);
		google.getshopping().click();
		
		System.out.println("==============TEXT OF THE PAGE==============");
		System.out.println(google.getallText().getText());
		Thread.sleep(5000);
		String title = driver.getTitle();
		if(title.contains("ultra"))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("not correct");
		}
	}
	
}