package EtoGruppe.Android;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseServerClass {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
@BeforeClass

	public void server() throws InterruptedException, MalformedURLException
	{
	AppiumDriverLocalService service=new AppiumServiceBuilder()
				.withAppiumJS(new File("/opt/homebrew/bin/appium"))
			   .usingPort(4724)
	           .withIPAddress("127.0.0.1")
			   .withArgument (GeneralServerFlag.SESSION_OVERRIDE)
	        	.build();
	               
service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Testing");
		
		options.setApp("/Users/eto_admin/builds/glrt-Qv-/0/zd0016/eto-ess-android/app/build/outputs/apk/releaseAlpha/MyEto-releaseAlpha.apk");
		options.setUdid("emulator-5556");
		options.autoGrantPermissions();
		driver = new AndroidDriver(new URL("http://127.0.0.1:4724"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		AndroidActions act=new AndroidActions(driver);
//		act.ClickMobileElementByCo_ordinate(25, 297);
//		act.ClickMobileElementByCo_ordinate(107, 132);
//		try {
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
//		}
//		catch(Exception e) {
//			
//		}
		
		
	
	}
//@AfterClass
//public void stopScreenRecording() {
//	AndroidActions act=new AndroidActions(driver);
//	act.ClickMobileElementByCo_ordinate(25, 297);
//	act.ClickMobileElementByCo_ordinate(219, 293);
//	
//	
//}




}
