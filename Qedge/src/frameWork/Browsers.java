package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browsers {
	public static WebDriver Firefox()
	{
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver chromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	
	}
	public static WebDriver opera()
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\sunny\\Downloads\\operadriver_win64\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
	
	}
	

}
