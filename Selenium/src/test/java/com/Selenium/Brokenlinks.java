package com.Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> web = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a =new SoftAssert();
		for(WebElement links:web) {
			String url = links.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400, "The link with Text"+links.getText()+" is broken with code" +respcode);
			
		}
		a.assertAll();

	}

}
