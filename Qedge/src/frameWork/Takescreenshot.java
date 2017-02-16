package frameWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshot {
	public static void Screenshot(WebDriver driver,String Filepath,String Filename) throws IOException
	{
		String y=Filepath+"\\"+Filename;
		File x=((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		FileUtils. copyFile(x, new File(y));
	}

}
