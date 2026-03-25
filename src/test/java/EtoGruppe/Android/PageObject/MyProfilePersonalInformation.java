package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfilePersonalInformation extends AndroidActions{

		AndroidDriver driver;
		
		 public MyProfilePersonalInformation(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Profile\"]/android.widget.FrameLayout")
		 private WebElement MyProfile;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/personalInfoLayout")
		 private WebElement PersonalInfo;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnEdit")
		 private WebElement EditInfo;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etMobileNumber")
		 private WebElement MobileNumber;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/email_personal")
		 private WebElement EmailID;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/spinner_gender")
		 private WebElement Gender;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/spinner_marital")
		 private WebElement Marital;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/dob_personal")
		 private WebElement DOB;
		 
		 @AndroidFindBy(id = "android:id/button1")
		 private WebElement OkButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/passport_personal")
		 private WebElement Passport;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etUINNumber")
		 private WebElement UniqueNumber;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/driving_License_personal")
		 private WebElement DrivingLicence;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/bloodGroup_spinner")
		 private WebElement BloodGroup;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etReligion")
		 private WebElement Religion;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etNationality")
		 private WebElement Nationality;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/update_personalInfo")
		 private WebElement Update;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.TextView")
		 private WebElement Home;
		 
//		 Assertions
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "android:id/date_picker_header_year")
		 private WebElement Year;
		 
		 @AndroidFindBy(id = "android:id/date_picker_header_date")
		 private WebElement DateCalender;
		 
		 @AndroidFindBy(id = "android:id/prev")
		 private WebElement PreviewMonth;
		 
		 @AndroidFindBy(id = "android:id/next")
		 private WebElement NextMonth;
		 
		 @AndroidFindBy(id = "android:id/month_view")
		 private WebElement MonthView;
		 
		 @AndroidFindBy(id = "android:id/button2")
		 private WebElement Canclel;
		 
		 
		 public void clickMyProfile()
			{
				MyProfile.click();
			}
		 public void clickPersonal()
			{
				PersonalInfo.click();
			}
		 public void clickEditPersonalInfo()
			{
				EditInfo.click();
			}
		 public void SendNumber(String number)
			{
				MobileNumber.sendKeys(number);
			}
		 public void SendEmail(String Email)
			{
				EmailID.sendKeys(Email);
			}
		 public void ClickGernder()
			{
				Gender.click();
			}
		 public void Dropdown (String Down)
		    {
			 scrollToText(Down);
		    }
		 public void ClickMaritalStatus()
			{
				Marital.click();
			}
		 public void ClickDOB()
			{
				DOB.click();
			}
		 public void ClickOK()
			{
				OkButton.click();
			}
		 public void SendPassport(String PassportDetails)
			{
				Passport.sendKeys(PassportDetails);
			}
		 public void SendUniqueIdentification(String UniqueIdentification)
			{
				UniqueNumber.sendKeys(UniqueIdentification);
			}
		 public void SendDriving(String Driving)
			{
				DrivingLicence.sendKeys(Driving);
			}
		 public void ClickBlood()
			{
				BloodGroup.click();
			}
		 public void SendReligionDetails(String ReligionDetails)
			{
				Religion.sendKeys(ReligionDetails);
			}
		 public void SendNationalityDetails(String NationalityDetails)
			{
				Nationality.sendKeys(NationalityDetails);
			}
		 public void ClickUpdate()
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
		 public void MyProfilePersonalInfoUIValidation1() 
		    {
			    Back.isDisplayed();
			    
			    String PersonalInfo = Header.getText();
			    assertEquals(PersonalInfo, "Personal Information");
			    
			    EditInfo.isDisplayed();
		    }
		 public void MyProfilePersonalInfoUIValidation2() 
		    {
			    String Number = MobileNumber.getAttribute("hint");
			    assertEquals(Number, "Contact Number");
			    
			    String Email = EmailID.getAttribute("hint");
			    assertEquals(Email, "Email Id");
			    
			    String Gender1 = Gender.getAttribute("hint");
			    assertEquals(Gender1, "Gender");
			    
			    String MaritalStatus = Marital.getAttribute("hint");
			    assertEquals(MaritalStatus, "Marital Status");
			    
			    String Dob = DOB.getAttribute("hint");
			    assertEquals(Dob, "Date of Birth");
			    
			    String Pass = Passport.getAttribute("hint");
			    assertEquals(Pass, "Passport");
		    }
		 public void MyProfilePersonalInfoUIValidation3() 
		    {
			    Year.isDisplayed();
			    
			    DateCalender.isDisplayed();
			    
			    PreviewMonth.isDisplayed();
			    
			    MonthView.isDisplayed();
			    
			    NextMonth.isDisplayed();
			    
			    String Can = Canclel.getText();
			    assertEquals(Can, "CANCEL");
			    
			    String ok = OkButton.getText();
			    assertEquals(ok, "OK");
		    }
		 public void MyProfilePersonalInfoUIValidation4() 
		    {
			    String UIN = UniqueNumber.getAttribute("hint");
			    assertEquals(UIN, "Unique Identification Number");
			    
			    String DLN = DrivingLicence.getAttribute("hint");
			    assertEquals(DLN, "Driving Licence Number");
			    
			    String Blood = BloodGroup.getAttribute("hint");
			    assertEquals(Blood, "Blood Group");
			    
			    String Relig = Religion.getAttribute("hint");
			    assertEquals(Relig, "Religion");
			    
			    String Nationality1 = Nationality.getAttribute("hint");
			    assertEquals(Nationality1, "Nationality");
			    
			    String Update1 = Update.getText();
			    assertEquals(Update1, "Update");
		    }
    
}