package Com.Check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

// Launch website  
		driver.navigate().to("http://www.google.com/");

		System.out.println(driver.getTitle()); // Validate if your page title is correct
		System.out.println(driver.getCurrentUrl()); // Validate you are landed on correct URL
		// System.out.println(driver.getPageSource());
	}

}

/*
 * driver.findElement(By.id("divpaxinfo")).click();
 * 
 * Thread.sleep(2000L);
 * 
 * int i=1;
 * 
 * while(i<5)
 * 
 * {
 * 
 * driver.findElement(By.id("hrefIncAdt")).click();//4 times
 * 
 * i++;
 * 
 * }
 * 
 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
 * 
 * for(int i=1;i<5;i++)
 * 
 * {
 * 
 * driver.findElement(By.id("hrefIncAdt")).click();
 * 
 * }
 * 
 * driver.findElement(By.id("btnclosepaxoption")).click();
 * 
 * Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),
 * "5 Adult");
 * 
 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText(
 * 
 * Fullscreen
 */
