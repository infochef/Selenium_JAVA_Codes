package com.ExcelDriven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Salesforce extends Read{

	WebDriver driver;
	Read a = new Read();
	@BeforeMethod
	public void Driver() {

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		System.out.println("Before Method is working fine");
	}

	@Test
	public void login() throws Exception {

		driver.get("https://login.salesforce.com/?locale=in");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		element.sendKeys(a.Excel(1, 1, 0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(a.Excel(1, 1, 1));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		takescreenshot("Home_page");
		System.out.println("Test method completed");
	}

	public void takescreenshot(String filename) throws IOException {

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("F:\\Selenium\\Automation\\Screenshot"+filename+".jpg"));
	}

	@AfterMethod
	public void check() {

		System.out.println("After method executed successfully");
	}
}



