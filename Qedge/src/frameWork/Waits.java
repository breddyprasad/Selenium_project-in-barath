package frameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void Thread(int timeinMilliseconds) throws InterruptedException
	{
		Thread.sleep(timeinMilliseconds);
	}
	public static void implictWait(WebDriver driver,int Time,String Timeunits)
	{
		Timeunits=Timeunits.toLowerCase();
		
		switch(Timeunits)
		{
		case "seconds":
		{
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
		}
	}
	}
	public static void explicitWait(WebDriver driver,int seconds,String Xpathvalue)
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpathvalue)));

	
	}
}
