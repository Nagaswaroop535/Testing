package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CompanyCalendar {

		AndroidDriver driver;
		
		 public CompanyCalendar(AndroidDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement MenuButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fragment_company_calender")
		 private WebElement CompanyCalender;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgPrevMonth")
		 private WebElement PrevMonth;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgNextMonth")
		 private WebElement NextMonth;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvMonthTitle")
		 private WebElement Month;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvYear")
		 private WebElement year;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/compactcalendar_view")
		 private WebElement CalenderView;
		 
		 public void clickmenu()
			{
				MenuButton.click();
			}
		 public void clickcalendar()
			{
				CompanyCalender.click();
			}
		 public void clickback()
			{
				Back.click();
			}
		 public void CalendarUIAssertion() 
		    {
			    Back.isDisplayed();
			    
			    String CalenderHeder = Header.getText();
			    assertEquals(CalenderHeder, "Company Calendar");
			    
			    PrevMonth.isDisplayed();
			    
			    Month.isDisplayed();
			    
			    year.isDisplayed();
			    
			    NextMonth.isDisplayed();
			    
			    CalenderView.isDisplayed();
			 
		    }
		 
}