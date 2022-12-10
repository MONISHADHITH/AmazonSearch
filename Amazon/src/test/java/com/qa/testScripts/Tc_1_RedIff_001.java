package com.qa.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_1_RedIff_001 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.get("https://www.rediff.com/");
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		//WebElement createAccount = driver.findElement(By.linkText("Create Rediffmail Account"));
		//createAccount.click();
		WebElement fullName = driver.findElement(By.xpath("//[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));////[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input
		fullName.sendKeys("vijay");
		WebElement redIffId = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));//
		redIffId.sendKeys("vijay12636");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"newpasswd\"]"));//
		password.sendKeys("Vijay@12636");
		WebElement conformPword = driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]"));
		conformPword.sendKeys("Vijay@12636");
		WebElement checkEmail = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		checkEmail.click();
        Select drop= new Select(driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")));
        drop.selectByIndex(2);
        WebElement answer = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input"));
        answer.sendKeys("dv");
        WebElement phoneNo=driver.findElement(By.xpath("//*[@id=\"mobno\"]"));
        phoneNo.sendKeys("657843901");
        Select date = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
        date.selectByIndex(3);
        Select month = new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]")));
        month.selectByIndex(3);
        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
        year.selectByIndex(3);
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
        System.out.println(gender.isSelected());
        Select country = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
        country.selectByVisibleText("India");
        Select city = new Select(driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")));
        city.selectByVisibleText("Vellore");
        driver.quit();
        
	}

}