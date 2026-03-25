package Test.Android.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidActions {
	AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver)
	{
		this.driver = driver;
	}

	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
		{
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGusture", ImmutableMap.of(
					"left", 100, "top", 100, "Width", 200, "height", 200,
					"direction", "down",
					"percent", 3.0
				));
		}while(canScrollMore);
	}
	
	public void scrollToText (String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	
	public void swipAction(WebElement ele, String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGessture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
				"direction", direction,
				"percent", 0.75
				));
	}
	  public void scrollToTopMenu() {
	        // Locate the top menu element
	        WebElement topMenu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]"));

	        // Get the size of the screen
	        int height = driver.manage().window().getSize().getHeight();
	        int width = driver.manage().window().getSize().getWidth();

	        // Scroll from the bottom to the top
	        new TouchAction<>(driver)
	            .press(PointOption.point(width / 2, height - 100)) // Start near the bottom
	            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	            .moveTo(PointOption.point(width / 2, 100)) // Move to the top
	            .release()
	            .perform();
	    }
	  public void ClickMobileElementByCo_ordinate(int x, int y) {
		  TouchAction touchAction = new TouchAction(driver);
          touchAction.tap(PointOption.point(x, y))
                     .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) // optional wait
                     .perform();
		  
	  }

		
	
	  
	  
}
