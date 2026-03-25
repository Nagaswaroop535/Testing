package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LocationSpecific extends AndroidActions{

		AndroidDriver driver;
		
		 public LocationSpecific(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement MenuButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fragment_location_specific")
		 private WebElement LocationSpecific;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgPdf")
		 private WebElement PDFImage;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvDocumentTitle")
		 private WebElement DocumentTitle;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvDate")
		 private WebElement Date;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvFileSize")
		 private WebElement Size;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imageView3")
		 private WebElement Mask;
		 
		 public void clickmenu()
			{
				MenuButton.click();
			}
		 public void clicklocationSpecific()
			{
				LocationSpecific.click();
			}
		 public void clickback()
			{
				Back.click();
			}
		 public void LocationSpesificUIAssertion() 
		    {
			    Back.isDisplayed();
			    
			    String Location = Header.getText();
			    assertEquals(Location, "Location Specific");
			    
			    PDFImage.isDisplayed();
			    
			    DocumentTitle.isDisplayed();
			    
			    Date.isDisplayed();
			    
			    Size.isDisplayed();
			    
			    Mask.isDisplayed();
		    }
		
	}

