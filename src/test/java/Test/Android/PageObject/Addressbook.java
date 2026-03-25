package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Addressbook extends AndroidActions{

		AndroidDriver driver;
		
		 public Addressbook(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement MenuButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fragment_address_book")
		 private WebElement Addressbook;
		 
		 @AndroidFindBy(id = "android:id/search_src_text")
		 private WebElement SearchText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
		 private WebElement bfn;
		 
		 @AndroidFindBy(id = "android:id/search_close_btn")
		 private WebElement clear;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
//		 Assertion1
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "android:id/search_mag_icon")
		 private WebElement SearchIcon;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
		 private WebElement ContactName1;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
		 private WebElement ContactDesgnation1;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.ImageView")
		 private WebElement ContactImage;
		 
//		 Assertion2
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgProfilePic")
		 private WebElement ProfileImage;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvEmployeeName")
		 private WebElement Name;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvEmployeeMail")
		 private WebElement EmployeeEmail;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
		 private WebElement Location;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[3]")
		 private WebElement LocationText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
		 private WebElement Branch;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[3]")
		 private WebElement BranchText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]")
		 private WebElement ConatctNo;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[3]")
		 private WebElement ContactText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]")
		 private WebElement Designation;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[3]")
		 private WebElement DesgnationText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[1]")
		 private WebElement Dept;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[3]")
		 private WebElement DeptText;
		 
		 
		 public void clickmenu()
			{
				MenuButton.click();
			}
		 public void clicaddressbook()
			{
				Addressbook.click();
			}
		 public void Seacrchkey(String search)
			{
				SearchText.sendKeys(search);
			}
		 public void clickclear()
			{
				clear.click();
			}
		 public void clickcontact()
			{
				bfn.click();
			}
		 public void clickback()
			{
				Back.click();
			}
		 public void AddressBookUIAssertion1 ()
		    {
			    String HeaderText = Header.getText();
			    assertEquals(HeaderText, "Address Book");
			    
			    Back.isDisplayed();
			    
			    SearchIcon.isDisplayed();
			    
			    String Searchtext = SearchText.getText();
			    assertEquals(Searchtext, "Search Contacts");
			    
			    ContactName1.isDisplayed();
			    
			    ContactDesgnation1.isDisplayed();
			    
			    ContactImage.isDisplayed();
		    }
		 public void AddressBookUIAssertion2 ()
		    {
			    String HeaderText = Header.getText();
			    assertEquals(HeaderText, "Address Book");
			    
			    Back.isDisplayed();
			    
			    ProfileImage.isDisplayed();
			    
			    Name.isDisplayed();
			    
			    EmployeeEmail.isDisplayed();
			    
			    String location = Location.getText();
			    assertEquals(location, "Location");
			    
			    LocationText.isDisplayed();
			    
			    String BranchName = Branch.getText();
			    assertEquals(BranchName, "Branch Name");
			    
			    BranchText.isDisplayed();
			    
			    String ContactNumber = ConatctNo.getText();
			    assertEquals(ContactNumber, "Contact No");
			    
			    ContactText.isDisplayed();
			    
			    String Desgne = Designation.getText();
			    assertEquals(Desgne, "Designation");
			    
			    DesgnationText.isDisplayed();
			    
			    String Department = Dept.getText();
			    assertEquals(Department, "Department");
			    
			    DeptText.isDisplayed();
		    }
		 
		
		
		
}




