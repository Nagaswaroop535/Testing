package EtoGruppe.Android.PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.appium.java_client.AppiumDriver;

public class TakeScreenShot {
	
		AppiumDriver driver;
		public  void ScreenShots( AppiumDriver driver, String FileName) throws WebDriverException{
		File	file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File("/Users/apple/Documents/EmployeeAppAndroid/employeeapp_android/Report" +FileName+".jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}

	}
