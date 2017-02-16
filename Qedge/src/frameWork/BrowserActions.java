package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserActions {
	public static void Maximise(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public static void close(WebDriver driver)
	{
		driver.close();
	}
	public static void quit(WebDriver driver)
	{
		driver.quit();
	}
	public static void newTab(WebDriver driver,String Xpath)
	{
		driver.findElement(By.xpath(Xpath)).sendKeys(Keys.CONTROL+"t");
	}
	
}
