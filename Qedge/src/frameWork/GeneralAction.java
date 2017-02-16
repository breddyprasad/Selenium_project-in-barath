package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralAction {
	
	public static void Entertext(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue,String Textvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		x.sendKeys(Textvalue);
	}
	public static void Click(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		x.click();
	}
	
	public static void Clear(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		x.clear();
	}
	public static void Checkcheckbox(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Boolean y=x.isSelected();
		if(y==false)
		{
		x.click();
		}
	}

	public static void UnCheckcheckbox(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Boolean y=x.isSelected();
		if(y==true)
		{
		x.click();
		}
	}
	public static void Selectbyindex(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue,int indexvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Select dd=new Select(x);
		dd.selectByIndex(indexvalue);
	}
	public static void Selectbyvisibletext(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue,String Visibletext)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Select dd=new Select(x);
		dd.selectByVisibleText(Visibletext);
	}
	public static void DeSelectall(WebDriver driver, String Elementlocatortype,String Elementlocatorvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Select dd=new Select(x);
		dd.deselectAll();
	}
	public static void Selectbyvalue(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue,String Value)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Select dd=new Select(x);
		dd.selectByValue(Value);
		
	}
	public static void Deselectbyindex(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue,int indexvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Select dd=new Select(x);
		dd.deselectByIndex(indexvalue);
	}
	public static void Deselectbytext(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue,String textvalue)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Select dd=new Select(x);
		dd.deselectByVisibleText(textvalue);
	}
	public static void Deselectbyvalue(WebDriver driver,String Elementlocatortype,String Elementlocatorvalue,String Value)
	{
		WebElement x=ElementLocators.Element(driver, Elementlocatortype, Elementlocatorvalue);
		Select dd=new Select(x);
		dd.deselectByValue(Value);
	}
	
}

 