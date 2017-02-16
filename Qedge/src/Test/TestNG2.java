package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import frameWork.Browsers;
import frameWork.Excel;
import frameWork.GeneralAction;
import frameWork.Takescreenshot;

public class TestNG2 {
	WebDriver driver;
	String Username;
	String Password;
	String Expectedurl;
	String Actualurl;
	String result;
	int i=1;
	@BeforeTest
	public void test2()
	{
		driver=Browsers.Firefox();
		driver.get("https://www.facebook.com");
	}
	@BeforeMethod
	public void test4() throws IOException
	{
		Username=Excel.Readexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, 0);
		Password=Excel.Readexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, 1);
		Expectedurl=Excel.Readexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, 2);;
	}
	@Test
	public void tets1() throws IOException
	{
		GeneralAction.Entertext(driver, "id", "email", Username);
		GeneralAction.Entertext(driver, "id", "pass", Password);
		GeneralAction.Click(driver, "xpath", ".//*[@id='loginbutton']");
		Actualurl=driver.getCurrentUrl();
		Excel.Writeexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, 3, Actualurl);
		if(Actualurl.equals(Expectedurl))
		{
		result="Pass";
		}
		else
		{
			result="Fail";
			
		}
		Excel.Writeexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, 4, result);
		i=i+1;
	}
	@Test
	public void tets6() throws IOException
	{
		GeneralAction.Entertext(driver, "id", "email", Username);
		GeneralAction.Entertext(driver, "id", "pass", Password);
		GeneralAction.Click(driver, "xpath", ".//*[@id='loginbutton']");
		Actualurl=driver.getCurrentUrl();
		Excel.Writeexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, 3, Actualurl);
		if(Actualurl.equals(Expectedurl))
		{
		result="Pass";
		}
		else
		{
			result="Fail";
			Takescreenshot.Screenshot(driver, "C:\\Users\\sunny\\Desktop", "Screen1.png");
		}
		Excel.Writeexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, 4, result);
		
	}
	@AfterMethod
	public void test5()
	{
		driver.get("https://www.facebook.com");
	}
	
	@AfterTest
	public void test3()
	{
		driver.close();
	}

}
