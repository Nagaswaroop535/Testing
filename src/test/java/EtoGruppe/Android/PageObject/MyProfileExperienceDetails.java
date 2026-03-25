package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfileExperienceDetails extends AndroidActions{

		AndroidDriver driver;
		
		 public MyProfileExperienceDetails(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Profile\"]/android.widget.FrameLayout")
		 private WebElement MyProfile;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/experienceDetails_layout")
		 private WebElement Experience;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fabAddExperience")
		 private WebElement AddExperience;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evCompany")
		 private WebElement CompanyName;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evDesignation")
		 private WebElement Designation;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evLocation")
		 private WebElement Location;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvJoiningDate")
		 private WebElement JoinData;
		 
		 @AndroidFindBy(id = "android:id/button2")
		 private WebElement Cancel;
		 
		 @AndroidFindBy(id = "android:id/button1")
		 private WebElement OkorYes;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvRelivingDate")
		 private WebElement ReliveDate;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btAddDetails")
		 private WebElement AddDetails;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgMore")
		 private WebElement Edit;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
		 private WebElement EditButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btAddDetails")
		 private WebElement Update;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
		 private WebElement Delete;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.TextView")
		 private WebElement Home;
		 
//		 Assertions
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvNoDataFound")
		 private WebElement NoData;
		 
		 @AndroidFindBy(id = "android:id/month_view")
		 private WebElement MonthView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/experience_text")
		 private WebElement Exp;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvCompanyName")
		 private WebElement CompanyView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvRole")
		 private WebElement RoleView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvLocation")
		 private WebElement LocationView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvDateOfJoin")
		 private WebElement JoinView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvDateOfReleive")
		 private WebElement RelevView;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
		 private WebElement EditText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
		 private WebElement Editicon;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
		 private WebElement DeleteText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
		 private WebElement Deleteicon;
		 
		 @AndroidFindBy(id = "android:id/date_picker_header_year")
		 private WebElement Year;
		 
		 @AndroidFindBy(id = "android:id/date_picker_header_date")
		 private WebElement Date;
		 
		 @AndroidFindBy(id = "android:id/prev")
		 private WebElement privew;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
		 private WebElement Deletepopup;
		 
		 public void clickMyProfile()
			{
				MyProfile.click();
			}
		 public void clickExperience()
			{
				Experience.click();
			}
		 public void clickAddExperience()
			{
				AddExperience.click();
			}
		 public void sendCompanyName(String CompanyName1)
			{
				CompanyName.sendKeys(CompanyName1);
			}
		 public void sendDesgnation(String Role)
			{
				Designation.sendKeys(Role);
			}
		 public void sendLocation(String Location1)
			{
				Location.sendKeys(Location1);
			}
		 public void clickJoin()
			{
				JoinData.click();
			}
		 public void clickcancel()
			{
				Cancel.click();
			}
		 public void clickrelive()
			{
				ReliveDate.click();
			}
		 public void clickokoryes()
			{
				OkorYes.click();
			}
		 public void clickAdd()
			{
				AddDetails.click();
			}
		 public void clickEdit()
			{
				Edit.click();
			}
		 public void clickEditbutton()
			{
				EditButton.click();
			}
		 public void clickUpdate()
			{
				Update.click();
			}
		 public void clickDelete()
			{
				Delete.click();
			}
		 public void clickback()
			{
				Back.click();
			}
		 public void clickhome()
			{
				Home.click();
			}
		 public void ExperieanceUIAssertions1() 
		    {
			    Back.isDisplayed();
			    
			    String Experiance = Header.getText();
			    assertEquals(Experiance, "Experience Details");
			    
			    String nodata = NoData.getText();
			    assertEquals(nodata, "No records found");
			    
			    AddExperience.isDisplayed();
		    }
		 public void ExperieanceUIAssertions2() 
		    {
			    Back.isDisplayed();
			    
			    String AddExperiance = Header.getText();
			    assertEquals(AddExperiance, "Add Experience");
			    
			    String Companyname = CompanyName.getText();
			    assertEquals(Companyname, "Company");
			    
			    String Desig = Designation.getText();
			    assertEquals(Desig, "Role");
			    
			    String Locat = Location.getText();
			    assertEquals(Locat, "Location");
			    
			    String DoJ = JoinData.getText();
			    assertEquals(DoJ, "Date of Joining");
			    
			    String DoR = ReliveDate.getText();
			    assertEquals(DoR, "Date of Relieving");
			    
			    String Adddetails = AddDetails.getText();
			    assertEquals(Adddetails, "Add");
		    }
		 public void ExperieanceUIAssertions3() 
		    {
			    Year.isDisplayed();
			    
			    Date.isDisplayed();
			    
			    privew.isDisplayed();
			    
			    MonthView.isDisplayed();
			    
			    String Can = Cancel.getText();
			    assertEquals(Can, "CANCEL");
			    
			    String OK = OkorYes.getText();
			    assertEquals(OK, "OK");
		    }
		 public void ExperieanceUIAssertions4() 
		    {
			    String Exp1 = Exp.getText();
			    assertEquals(Exp1, "Experience 1");
			    
			    Edit.isDisplayed();
			    
			    CompanyView.isDisplayed();
			    
			    RoleView.isDisplayed();
			    
			    LocationView.isDisplayed();
			    
			    JoinView.isDisplayed();
			    
			    RelevView.isDisplayed();
		    }
		 public void ExperieanceUIAssertions5() 
		    {
			    Editicon.isDisplayed();
			    
			    Deleteicon.isDisplayed();
			    
			    String Edittext = EditText.getText();
			    assertEquals(Edittext, "Edit");
			    
			    String DeleteExp = DeleteText.getText();
			    assertEquals(DeleteExp, "Delete");
		    }
		 public void ExperieanceUIAssertions6() 
		    {
			    Back.isDisplayed();
			    
			    String EditExperiance = Header.getText();
			    assertEquals(EditExperiance, "Edit Experience");
			    
			    String Updat = Update.getText();
			    assertEquals(Updat, "Update");
		    }
		 public void ExperieanceUIAssertions7() 
		    {
			    String Delete = Deletepopup.getText();
			    assertEquals(Delete, "Are you sure you want to delete ?\n");
			    
			    Cancel.isDisplayed();
			    
			    OkorYes.isDisplayed();
		    }
			    
		 
}