package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Mouseactions {
	public static void click(WebDriver driver,String Elementlocatortype,String Elementlocatortypevalue)
	{
		Actions mouseaction=new Actions(driver);
		WebElement a=ElementLocators.Element(driver, Elementlocatortype, Elementlocatortypevalue);
		System.out.println(a);
		mouseaction.click(a);
		
		//mouseaction.build();
		mouseaction.perform();
	}
	public static void movetoelement(WebDriver driver,String Elementlocatortype,String Elementlocatortypevalue)
	{
		Actions mouseaction=new Actions(driver);
		WebElement a=ElementLocators.Element(driver, Elementlocatortype, Elementlocatortypevalue);
		System.out.println(a);
		mouseaction.moveToElement(a);
		//mouseaction.build();
		mouseaction.perform();
	}

}
