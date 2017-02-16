package Test;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import frameWork.*;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver2=Browsers.Firefox();
		driver2.get("https://www.facebook.com");
		WebDriver driver=Browsers.Firefox();
		driver.get("https://www.flipkart.com");
		//Waits.Thread(10000);
		BrowserActions.close(driver2);
		BrowserActions.Maximise(driver);
		//Waits.implictWait(driver, 30, "seconds");
		Waits.explicitWait(driver, 30, "//a[contains(text(),'Log In')]");
		//WebElement x=ElementLocators.Element(driver, "xPath","//a[contains(text(),'Log In')]" );
		//x.click();
		GeneralAction.Click(driver, "xpath", "//a[contains(text(),'Log In')]");
		//driver.findElement(By.className("")).sendKeys("abcd");
		GeneralAction.Entertext(driver, "Class","_2zrpKA" , "abcd");
		GeneralAction.Clear(driver, "Class","_2zrpKA");
		//Waits.explicitWait(driver, 30, "//a[contains(text(),'Bharath')]");
 
		//BrowserActions.newTab(driver, "//a[contains(text(),'Bharath')]");
		BrowserActions.quit(driver);
		
	}

}
