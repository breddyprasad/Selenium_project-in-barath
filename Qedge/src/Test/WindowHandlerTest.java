package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import frameWork.Browsers;
import frameWork.WindowHandles;

public class WindowHandlerTest {
	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
	WebDriver driver=Browsers.Firefox();
	driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf#");
	/*driver.findElement(By.xpath("//a[text()='View All']")).click();
	WindowHandles.Changetab(driver, "https://www.irctc.co.in/eticketing/alertStaticMsg.jsf");
	driver.close();
	WindowHandles.Changetab(driver, "https://www.irctc.co.in/eticketing/loginHome.jsf#");
	*/
	
	driver.switchTo().frame("google_ads_iframe_/37179215/DFP_NGET_01_HomePage_RHS_ATF_479x266_ENG_0");
	driver.findElement(By.xpath(".//*[@id='image-1']/a/img")).click();
	
	}

}
