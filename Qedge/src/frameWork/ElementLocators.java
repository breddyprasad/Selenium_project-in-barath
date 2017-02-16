package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementLocators {
	public static WebElement Element(WebDriver driver,String Elementlocator,String Elementlocatorvalue)
	{
		WebElement x=null;
		Elementlocator=Elementlocator.toUpperCase();
		switch(Elementlocator)
		{
		case"XPATH":
		{
		x=driver.findElement(By.xpath(Elementlocatorvalue))	;
		break;
		}
		case"ID":
		{
			x=driver.findElement(By.id(Elementlocatorvalue));
				break;
		}
		case"CLASS":
		{
			x=driver.findElement(By.className(Elementlocatorvalue));
			break;
		}
			case"CSS SELECTOR":
			{
				x=driver.findElement(By.cssSelector(Elementlocatorvalue));
				break;
			}
			case"LINK TEXT":
			{
				x=driver.findElement(By.linkText(Elementlocatorvalue));
				break;
			}
			case"PARTIAL LINKTEXT":
			{
				x=driver.findElement(By.partialLinkText(Elementlocatorvalue));
				break;
			}
			case"TAG NAME":
			{
				x=driver.findElement(By.tagName(Elementlocatorvalue));
				break;
			}
			case"NAME":
			{
				x=driver.findElement(By.name(Elementlocatorvalue));
				break;
			}
			
		}
		return x;
	}

}
