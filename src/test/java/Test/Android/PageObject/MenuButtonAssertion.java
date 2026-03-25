

package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MenuButtonAssertion extends AndroidActions{

		AndroidDriver driver;
		
		 public MenuButtonAssertion(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/navigation_bar_item_large_label_view")
		 private WebElement Home;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement Menu;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgCloseHeader")
		 private WebElement Closebutton;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvUserName")
		 private WebElement UserName;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvEmailAddress")
		 private WebElement Email;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvEmployeeId")
		 private WebElement Id;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgUserProfile")
		 private WebElement ProfileImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")
		 private WebElement NewsText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")
		 private WebElement AddressbookText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView")
		 private WebElement MyTeamText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")
		 private WebElement MyBrranchText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView")
		 private WebElement CompanyCalendarText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView")
		 private WebElement LocationSpceText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView")
		 private WebElement FAQText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[8]/android.widget.CheckedTextView")
		 private WebElement ETOLocationsText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView")
		 private WebElement LogoutText;
		 
		 public void ClickonHome() 
		 {
			 Home.click();
		 }
		 public void ClickonMenu() 
		 {
			 Menu.click();
		 }
		 public void MenuPageUIValidation() 
		 {
			 Closebutton.isDisplayed();
			 
			 UserName.isDisplayed();
			 
			 Email.isDisplayed();
			 
			 Id.isDisplayed();
			 
			 ProfileImage.isDisplayed();
			 
			 String News = NewsText.getText();
			 assertEquals(News, "News");
			 
			 String Address = AddressbookText.getText();
			 assertEquals(Address, "Address Book");
			 
			 String MyTeam = MyTeamText.getText();
			 assertEquals(MyTeam, "My Team");
			 
			 String MyBranch = MyBrranchText.getText();
			 assertEquals(MyBranch, "My Branch");
			 
			 String CompanyCal = CompanyCalendarText.getText();
			 assertEquals(CompanyCal, "Company Calendar");
			 
			 String Location = LocationSpceText.getText();
			 assertEquals(Location, "Location Specific");
			 
			 String Faq = FAQText.getText();
			 assertEquals(Faq, "Faq");
			 
			 String ETOLocation = ETOLocationsText.getText();
			 assertEquals(ETOLocation, "ETO Locations");
			 
			 String Logout = LogoutText.getText();
			 assertEquals(Logout, "Log Out");
		 }
		 public void Clickonclose() 
		 {
			 Closebutton.click();
		 }
}
