package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EtoLocations extends AndroidActions{

		AndroidDriver driver;
		
		 public EtoLocations(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement MenuButton;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[8]/android.widget.CheckedTextView")
		 private WebElement EtoLocationButton;
		 
		 @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
		 private WebElement Nativelocation;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout")
		 private WebElement Etolocation;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Backbutton;
		 
//		 Assertions
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")
		 private WebElement Maps;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
		 private WebElement GoogleImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout/android.widget.TextView[1]")
		 private WebElement BranchName;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout/android.widget.TextView[2]")
		 private WebElement Address;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView")
		 private WebElement Number;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")
		 private WebElement Email;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		 private WebElement DirectionsImage;
		 
		 public void clickmenu()
			{
				MenuButton.click();
			}
		 public void clickEtolocation()
			{
				EtoLocationButton.click();
			}
		 public void clickNativelocatio()
			{
				Nativelocation.click();
			}
		 public void clickEtolocationindia()
			{
				Etolocation.click();
			}
		 public void clickback()
			{
				Backbutton.click();
			}
		 public void ETOLocationUIAssertion() 
		    {
			    String EtoLo = Header.getText();
			    assertEquals(EtoLo, "ETO Locations");
			    
			    Backbutton.isDisplayed();
			    
			    Maps.isDisplayed();
			    
			    GoogleImage.isDisplayed();
			    
			    BranchName.isDisplayed();
			    
			    Address.isDisplayed();
			    
			    Number.isDisplayed();
			    
			    Email.isDisplayed();
			    
			    DirectionsImage.isDisplayed();
		    }
}


