package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scre {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		String Filename="ex1.png";
		String Filepath="C:\\Users\\sunny\\Desktop";
		String y=Filepath+"\\"+Filename;
		
		File x=((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		System.out.println(x);
		FileUtils. copyFile(x, new File(y));
	}

}
