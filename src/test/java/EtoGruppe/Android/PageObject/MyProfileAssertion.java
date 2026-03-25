package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfileAssertion extends AndroidActions
{

		AndroidDriver driver;
		
		 public MyProfileAssertion(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='My Profile']/android.view.ViewGroup/android.widget.TextView")
		 private WebElement MyProfile;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/employee_name")
		 private WebElement EmployeeName;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/employeeDesignation")
		 private WebElement EmaployeeEmail;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvEmployeeId")
		 private WebElement EmployeeId;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgUpload")
		 private WebElement Cemara;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.ImageView")
		 private WebElement PersonalinfoImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView")
		 private WebElement PersonalInfoText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView")
		 private WebElement CompanyInfoImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView")
		 private WebElement CompanyInfoText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.ImageView")
		 private WebElement FamilyImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView")
		 private WebElement FamilyText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.ImageView")
		 private WebElement QulificationImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView")
		 private WebElement QulificationText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.ImageView")
		 private WebElement ExperienceImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.TextView")
		 private WebElement ExperienceText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.ImageView")
		 private WebElement ContactInfoImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView")
		 private WebElement ContactInfoText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.ImageView")
		 private WebElement EmergencyImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView")
		 private WebElement EmergencyText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[8]/android.widget.ImageView")
		 private WebElement DocumentImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[8]/android.widget.TextView")
		 private WebElement DocumentText;
		 
		 
		 public void ClickMyProfile() 
		 {
			 MyProfile.click();
		 }
		 public void MyProfilePageUIValidation() 
		    {
			 Header.isDisplayed();
			 
			 EmployeeName.isDisplayed();
			 
			 EmaployeeEmail.isDisplayed();
			 
			 EmployeeId.isDisplayed();
			 
			 Cemara.isDisplayed();
			 
			 PersonalinfoImage.isDisplayed();
			 
			 String Personal = PersonalInfoText.getText();
			 assertEquals(Personal, "Personal Information");
			 
			 CompanyInfoImage.isDisplayed();
			 
			 String Company = CompanyInfoText.getText();
			 assertEquals(Company, "Company Information");
			 
			 FamilyImage.isDisplayed();
			 
			 String Family = FamilyText.getText();
			 assertEquals(Family, "Family Details");
			 
			 QulificationImage.isDisplayed();
			 
			 String Qulification = QulificationText.getText();
			 assertEquals(Qulification, "Qualification Details");
			 
			 ExperienceImage.isDisplayed();
			 
			 String Experience = ExperienceText.getText();
			 assertEquals(Experience, "Experience Details");
			 
			 ContactInfoImage.isDisplayed();
			 
			 String Contact = ContactInfoText.getText();
			 assertEquals(Contact, "Contact Information");
			 
			 EmergencyImage.isDisplayed();
			 
			 String Emergency = EmergencyText.getText();
			 assertEquals(Emergency, "Emergency Contact");
			 
			 DocumentImage.isDisplayed();
			 
			 String Document = DocumentText.getText();
			 assertEquals(Document, "Documents");
			 
		    }
		 
		 
	
	
    


}
