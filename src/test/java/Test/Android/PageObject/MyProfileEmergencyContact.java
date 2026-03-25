package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfileEmergencyContact extends AndroidActions{

		AndroidDriver driver;
		
		 public MyProfileEmergencyContact(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Profile\"]/android.widget.FrameLayout")
		 private WebElement MyProfile;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/emergencyContact_layout")
		 private WebElement EmergencyContact;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement HeaderText;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnEdit")
		 private WebElement Edit;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etNameEmergency")
		 private WebElement Name;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etNumberEmergency")
		 private WebElement Number;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etEmailEmergency")
		 private WebElement EmeEmail;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etAddressEmergency1")
		 private WebElement Address1;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etAddressEmergency2")
		 private WebElement Address2;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etOtherInfoEmergency")
		 private WebElement Others;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btUpdateEmergency")
		 private WebElement Update;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
//		 Assertions
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.TextView")
		 private WebElement Home;
		 
		 public void clickMyProfile()
			{
				MyProfile.click();
			}
		 public void clickEmergency()
			{
				EmergencyContact.click();
			}
		 public void EmergencyContactPageUIAssertion() 
		    {
			    HeaderText.isDisplayed();
			    
			    Back.isDisplayed();
			    
			    Edit.isDisplayed();
			    
			    String ContactPerson = Name.getAttribute("hint");
			    assertEquals(ContactPerson, "Contact Person");
			    
			    String MobileNumber = Number.getAttribute("hint");
			    assertEquals(MobileNumber, "Mobile Number");
			    
			    String Email = EmeEmail.getAttribute("hint");
			    assertEquals(Email, "Email");
			    
			    String AddressLine1 = Address1.getAttribute("hint");
			    assertEquals(AddressLine1, "Address line 1");
			    
			    String AddressLine2 = Address2.getAttribute("hint");
			    assertEquals(AddressLine2, "Address line 2");
			    
			    String Otherinfo = Others.getAttribute("hint");
			    assertEquals(Otherinfo, "Other Info");
			    
			    String Up = Update.getText();
			    assertEquals(Up, "Update");
			 
			}
		 public void clickEdit()
			{
				Edit.click();
			}
		 public void Sendname(String name)
			{
				Name.sendKeys(name);
			}
		 public void Sendnumber(String number)
			{
				Number.sendKeys(number);
			}
		 public void Sendemail(String Email)
			{
				EmeEmail.sendKeys(Email);
			}
		 public void Sendaddress1(String address1)
			{
				Address1.sendKeys(address1);
			}
		 public void Sendaddress2(String address2)
			{
				Address2.sendKeys(address2);
			}
		 public void Sendothers(String other)
			{
				Others.sendKeys(other);
			}
		 public void clickUpdate()
			{
				Update.click();
			}
		 public void clickback()
			{
				Back.click();
			}
		 public void clickhome()
			{
				Home.click();
			}
    
}
