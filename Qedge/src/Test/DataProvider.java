package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import frameWork.Browsers;
import frameWork.Excel;
import frameWork.GeneralAction;
import frameWork.Takescreenshot;

public class DataProvider {
	WebDriver driver;
	@BeforeTest
	public void test1()
	{
		driver=Browsers.Firefox();
		driver.get("https://www.facebook.com");
	}
	@org.testng.annotations.DataProvider
			public Object[][] test2() throws IOException
			{
		String[][] testdata=new String[2][3];
		for(int i=1;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				testdata[i-1][j]=Excel.Readexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", i, j);
				System.out.println(testdata[i-1][j]);
			}
			
		}
		return testdata;
		
			}
int y=1;
	@Test(dataProvider="test2")
	public void test3(String Username,String Password,String ExpectedURL) throws IOException
	{
		String result;
		
		GeneralAction.Entertext(driver, "id", "email", Username);
		GeneralAction.Entertext(driver, "id", "pass", Password);
		GeneralAction.Click(driver, "xpath", ".//*[@id='loginbutton']");
		String Actualurl=driver.getCurrentUrl();
		if(Actualurl.equals(ExpectedURL))
		{
		result="Pass";
		}
		else
		{
			result="Fail";
			Takescreenshot.Screenshot(driver, "C:\\Users\\sunny\\Desktop", "Screen1.png");
		}
		Excel.Writeexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", y, 3, Actualurl);
		Excel.Writeexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Login data", y, 4, result);
		y=y+1;
		driver.navigate().to("https://www.facebook.com");
		
	}
	@AfterTest
	public void test3()
	{
		driver.close();
	}
}
