package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import frameWork.Browsers;

public class TestNG {
	/*@Test(priority=2)
	public void test1()
	{
		WebDriver driver=Browsers.Firefox();
		driver.get("https://www.facebook.com");
		driver.close();
	}
	@Test(priority=2)
	public void est2()
	{
		WebDriver driver=Browsers.Firefox();
		driver.get("https://www.gmail.com");
		driver.close();
	}
	@Test(priority=3)
	public void st3()
	{
		WebDriver driver=Browsers.Firefox();
		driver.get("https://www.flipkart.com");
		driver.close();
	}
	*/

	/*WebDriver driver;
	@BeforeTest
public void test2()
{
	driver=Browsers.Firefox();
	driver.get("https://www.facebook.com");
	System.out.println("abcd");
}
	@before 
	@Test
	public void test1()
	{
	System.out.println("cdef");	
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	}
	@Test
	public void test4() throws InterruptedException
	{
		driver.findElement(By.id("u_0_1")).click();
		Thread.sleep(5000);
	}
	@AfterTest
	public void test3()
	{
		
		System.out.println("efgh");
		driver.close();
	}
	*/
	@BeforeSuite
	public void test6()
	{
		System.out.println("before suite");
	}
	@BeforeClass
	public void test1()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void test2()
	{
		System.out.println("before method");
	}
	@BeforeTest
	public void test9()
	{
		System.out.println("before test");
	}
	@Test
	public void test7()
	{
		System.out.println("test");
	}
	@Test
	public void test10()
	{
		System.out.println("test2");
	}
	@AfterClass
	public void test3()
	{
		System.out.println("after class");
	}
	@AfterMethod
	public void test4()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void test5()
	{
		System.out.println("aftertest");
	}
	@AfterSuite
	public void test8()
	{
		System.out.println("after suite");
	}

}
