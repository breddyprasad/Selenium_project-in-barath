package Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameWork.*;
public class DropdownTesting {
	public static void main(String[] args) throws IOException {
		WebDriver driver=Browsers.Firefox();
		driver.get("https://www.facebook.com/");
		/*WebElement element=ElementLocators.Element(driver, "id", "year");
				
		Select dd=new Select(element);
		dd.selectByVisibleText("2014");
		*/
		//GeneralAction.Selectbyindex(driver, "id", "year", 2);
		//GeneralAction.Selectbyvisibletext(driver, "id","day", "7");
		//GeneralAction.Selectbyvalue(driver, "id", "month", "4");
		//driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		//GeneralAction.Click(driver, "id", "sex-1");
		//GeneralAction.Selectbyindex(driver, "id", "selenium_commands",0);
		//GeneralAction.Selectbyindex(driver, "id", "selenium_commands",1);
		//GeneralAction.DeSelectall(driver, "id", "selenium_commands");
		
		//GeneralAction.Deselectbyindex(driver, "id", "selenium_commands",1);
	//String x=Excel.Readexcel("C:\\Users\\sunny\\Desktop", "readfile.xlsx", "Testdata", 0,1);
	//System.out.println(x);
		//a[contains(text(),'Facebook Lite')]
		//WebElement x=ElementLocators.Element(driver,"xpath", "//a[contains(text(),'Facebook Lite')]");
		//System.out.println(x);
		//GeneralAction.Click(driver, "xpath", "//a[contains(text(),'Facebook Lite')]");
		//Mouseactions.click(driver, "xpath", "//a[contains(text(),'Facebook Lite')]");
		//Takescreenshot.Screenshot(driver, "C:\\Users\\sunny\\Desktop\\Screenshots", "ex1.png");
		//Mouseactions.movetoelement(driver, "xpath", "//a[contains(text(),'Forgotten account?')]");
	}
	

}
