package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyBranch extends AndroidActions{

		AndroidDriver driver;
		
		 public MyBranch(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement MenuButton;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")
		 private WebElement MyBranchButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Backbutton;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imageView")
		 private WebElement BranchImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[1]")
		 private WebElement BranchName;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
		 private WebElement BranchText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[1]")
		 private WebElement Address;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[3]")
		 private WebElement AddressText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[1]")
		 private WebElement Email;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[3]")
		 private WebElement EmailText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView[1]")
		 private WebElement ContactNo;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView[3]")
		 private WebElement ContactNoText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.TextView[1]")
		 private WebElement ZipCode;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.TextView[3]")
		 private WebElement ZipCodeText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[1]")
		 private WebElement City;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[3]")
		 private WebElement CityText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView[1]")
		 private WebElement Country;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView[3]")
		 private WebElement CountryText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[8]/android.widget.TextView[1]")
		 private WebElement State;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[8]/android.widget.TextView[3]")
		 private WebElement StateText;
		 
		 public void clickmenu()
			{
				MenuButton.click();
			}
		 public void clickmybranchbutton()
			{
				MyBranchButton.click();
			}
		 public void clickback()
			{
				Backbutton.click();
			}
		 public void BranchUIAssertion() 
		    {
			    Backbutton.isDisplayed();
			    
			    String Branch = Header.getText();
			    assertEquals(Branch, "My Branch");
			    
			    BranchImage.isDisplayed();
			    
			    String Branchname = BranchName.getText();
			    assertEquals(Branchname, "Branch Name");
			    
			    BranchText.isDisplayed();
			    
			    String Add = Address.getText();
			    assertEquals(Add, "Address");
			    
			    AddressText.isDisplayed();
			    
			    String EmailID = Email.getText();
			    assertEquals(EmailID, "Email Id");
			    
			    EmailText.isDisplayed();
			    
			    String Contact = ContactNo.getText();
			    assertEquals(Contact, "Contact Number");
			    
			    ContactNoText.isDisplayed();
			    
			    String Zipcode = ZipCode.getText();
			    assertEquals(Zipcode, "Zip Code");
			    
			    ZipCodeText.isDisplayed();
			    
			    String CityTown = City.getText();
			    assertEquals(CityTown, "City/Town/Village");
			    
			    CityText.isDisplayed();
			    
			    String Coun = Country.getText();
			    assertEquals(Coun, "Country");
			    
			    CountryText.isDisplayed();
			    
			    String state = State.getText();
			    assertEquals(state, "State");
			    
			    StateText.isDisplayed();
		    }
		
	}
