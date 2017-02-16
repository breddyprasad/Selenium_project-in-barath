package Test;

import org.openqa.selenium.By;
import frameWork.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class staysignincheckbox {
public static void main(String[] args) throws InterruptedException
{
	
	WebDriver driver = Browsers.Firefox();
	driver.get("https://gmail.com");
	BrowserActions.Maximise(driver);
	GeneralAction.Entertext(driver, "id", "Email", "neeloufer4.g@gmail.com");
	//driver.findElement(By.id("Email")).sendKeys("neeloufer4.g@gmail.com");
	driver.findElement(By.id("next")).click();
	Thread.sleep(5000);
	//WebElement wb = driver.findElement(By.id("PersistentCookie"));
	//boolean s1=wb.isEnabled();
	//boolean s2=wb.isSelected();
	GeneralAction.UnCheckcheckbox(driver, "id", "PersistentCookie");
	GeneralAction.Checkcheckbox(driver, "id", "PersistentCookie");
	driver.quit();
	
	}
	
	
}
