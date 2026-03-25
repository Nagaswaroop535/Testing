package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfileCompanyInformation extends AndroidActions{

		AndroidDriver driver;
		
		 public MyProfileCompanyInformation(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Profile\"]/android.widget.FrameLayout")
		 private WebElement MyProfile;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/companyInfo_layout")
		 private WebElement MyCompanyInfo;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Backbutton;
		 
		 @AndroidFindBy(accessibility = "Home")
		 private WebElement Home;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imageView")
		 private WebElement Companyinfoimage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[1]")
		 private WebElement NameText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
		 private WebElement Nameview;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[1]")
		 private WebElement DesignationText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[3]")
		 private WebElement DesignationView;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[1]")
		 private WebElement DeparmentText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[3]")
		 private WebElement DeparmentView;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView[1]")
		 private WebElement OffileNameText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView[3]")
		 private WebElement OfficeNameView;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.TextView[1]")
		 private WebElement WorkLocationText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.TextView[3]")
		 private WebElement WorklocationView;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[1]")
		 private WebElement OfficeMobileText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[3]")
		 private WebElement OfficeMobileView;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView[1]")
		 private WebElement CompanyEmailText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView[3]")
		 private WebElement CompanyEmailView;
		 
		 public void clickMyProfile()
			{
				MyProfile.click();
			}
		 public void clickMycompanyinfo()
			{
				MyCompanyInfo.click();
			}
		 public void clickBack()
			{
				Backbutton.click();
			}
		 public void clickHome()
			{
				Home.click();
			}
		 
		 public void CompanyInfoPageUIAssertion() 
		    {
			 Backbutton.isDisplayed();
			 
			 String Headertext = Header.getText();
			 assertEquals(Headertext, "Company Information");
			 
			 Companyinfoimage.isDisplayed();
			 
			 String Name = NameText.getText();
			 assertEquals(Name, "Employee Name");
			 
			 Nameview.isDisplayed();
			 
			 String Dsignation = DesignationText.getText();
			 assertEquals(Dsignation, "Designation");
			 
			 DesignationView.isDisplayed();
			 
			 String Dept = DeparmentText.getText();
			 assertEquals(Dept, "Department");
			 
			 DeparmentView.isDisplayed();
			 
			 String OfficeName = OffileNameText.getText();
			 assertEquals(OfficeName, "Office Name");
			 
			 OfficeNameView.isDisplayed();
			 
			 String WokLocation = WorkLocationText.getText();
			 assertEquals(WokLocation, "Work Location");
			 
			 WorklocationView.isDisplayed();
			 
			 String officeNumber = OfficeMobileText.getText();
			 assertEquals(officeNumber, "Office Mobile");
			 
			 OfficeMobileView.isDisplayed();
			 
			 String CompanyEmail = CompanyEmailText.getText();
			 assertEquals(CompanyEmail, "Company Email");
			 
			 CompanyEmailView.isDisplayed();
			 
		    }
	
    }
