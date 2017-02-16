package frameWork;

import java.util.Set;

import org.openqa.selenium.WebDriver;



public class WindowHandles {
	public static void Changetab(WebDriver driver,String URL)
	{
		Set<String> d=driver.getWindowHandles();
		for(String x :d)
		{
			driver.switchTo().window(x);
			String z=driver.getCurrentUrl();
			if(z.equals(URL))
			{
				break;
			}
		}
	}

}
