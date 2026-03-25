package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfileContactInformation extends AndroidActions{

		AndroidDriver driver;
		
		 public MyProfileContactInformation(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Profile\"]/android.widget.FrameLayout")
		 private WebElement MyProfile;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/contactInfo_layout")
		 private WebElement ContactInfo;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnEdit")
		 private WebElement EditButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPermenantAddress")
		 private WebElement Address;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPermanentCity")
		 private WebElement City;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPermanentCountry")
		 private WebElement Country;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPermanentState")
		 private WebElement State;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPermanentDistrict")
		 private WebElement District;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPermanentPinCode")
		 private WebElement Pincode;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/checkBoxPresentAddress")
		 private WebElement PresentAddressCheck;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPresentAddress")
		 private WebElement PresentAddress;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPresentCity")
		 private WebElement PresentCity;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPresentCountry")
		 private WebElement PresentCountry;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPresentState")
		 private WebElement PresentState;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPresentDistrict")
		 private WebElement PresentDistrict;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPresentPincode")
		 private WebElement PresentPincode;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btAddContactInfo")
		 private WebElement UpdateButton;

		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.TextView")
		 private WebElement Home;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/presentAddress_txt")
		 private WebElement PresentText;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvSameAsPermanentAddress")
		 private WebElement Sameas;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/permanentAddress_title")
		 private WebElement PermanentText;
		 
		 public void clickMyProfile()
			{
				MyProfile.click();
			}
		 public void clickContactInfo()
			{
				ContactInfo.click();
			}
		 public void clickEdit()
			{
				EditButton.click();
			}
		 public void MyProfileContactInfoUIValidation1()
			{
				Back.isDisplayed();
				
				String ContactInfo = Header.getText();
				assertEquals(ContactInfo, "Contact Information");
				
				String PermentAddText = PermanentText.getText();
				assertEquals(PermentAddText, "Permanent Address");
				
				String PermentAddress = Address.getAttribute("hint");
			    assertEquals(PermentAddress, "Address");
			    
			    String PermentCity = City.getAttribute("hint");
			    assertEquals(PermentCity, "City/Town/Village");
			    
			    String PermentCountry = Country.getAttribute("hint");
			    assertEquals(PermentCountry, "Country");
			    
			    String PermentState = State.getAttribute("hint");
			    assertEquals(PermentState, "State");
			    
			    String PermentDistrict = District.getAttribute("hint");
			    assertEquals(PermentDistrict, "District");
			    
			    String PermentPincode = Pincode.getAttribute("hint");
			    assertEquals(PermentPincode, "Pincode");
			}
		 public void SendKeyPerAddress(String PerAddress)
			{
				Address.sendKeys(PerAddress);
			}
		 public void SendKeyPerCity(String PerCity)
			{
				City.sendKeys(PerCity);
			}
		 public void SendKeyPerCount(String PerCountry)
			{
				Country.sendKeys(PerCountry);
			}
		 public void SendKeyPerState(String PerState)
			{
				State.sendKeys(PerState);
			}
		 public void SendKeyPerDistrict(String PerDistrict)
			{
				District.sendKeys(PerDistrict);
			}
		 public void SendKeyPerPincode(String PerPincode)
			{
				Pincode.sendKeys(PerPincode);
			}
		 public void MyProfileContactInfoUIValidation2()
			{
			    Back.isDisplayed();
			    
			    String PresentAddressText = PresentText.getText();
			    assertEquals(PresentAddressText, "Present Address");
			    
			    String SameasPerment = Sameas.getText();
			    assertEquals(SameasPerment, "( Same as permanent address )");
			    
			    PresentAddressCheck.isDisplayed();
			    
			    String PreAddress = PresentAddress.getAttribute("hint");
			    assertEquals(PreAddress, "Address");
			    
			    String PreCity = PresentCity.getAttribute("hint");
			    assertEquals(PreCity, "City/Town/Village");
			    
			    String PreCountry = PresentCountry.getAttribute("hint");
			    assertEquals(PreCountry, "Country");
			    
			    String PreState = PresentState.getAttribute("hint");
			    assertEquals(PreState, "State");
			    
			    String PreDistrict = PresentDistrict.getAttribute("hint");
			    assertEquals(PreDistrict, "District");
			    
			    String PrePincode = PresentPincode.getAttribute("hint");
			    assertEquals(PrePincode, "Pincode");
			    
			    String UpdateBu = UpdateButton.getText();
			    assertEquals(UpdateBu, "Update");
			}
		 public void clickonPresentCheck()
			{
				PresentAddressCheck.click();
			}
		 public void SendKeyPreAddress(String PreAddress)
			{
				PresentAddress.sendKeys(PreAddress);
			}
		 public void SendKeyPreCity(String PreCity)
			{
				PresentCity.sendKeys(PreCity);
			}
		 public void SendKeyPreCountry(String PreCountry)
			{
				PresentCountry.sendKeys(PreCountry);
			}
		 public void SendKeyPreState(String PreState)
			{
				PresentState.sendKeys(PreState);
			}
		 public void SendKeyPreDistrict(String PreDistrict)
			{
				PresentDistrict.sendKeys(PreDistrict);
			}
		 public void SendKeyPrePincode(String PrePincode)
			{
				PresentPincode.sendKeys(PrePincode);
			}
		 public void clickonUpdate()
			{
				UpdateButton.click();
			}
		 public void clickonBack()
			{
				Back.click();
			}
		 public void Dropdown (String Down)
		    {
			    scrollToText(Down);
		    }
		 public void ClickonHome ()
		    {
			     Home.click();
		    }
	
    
    }
