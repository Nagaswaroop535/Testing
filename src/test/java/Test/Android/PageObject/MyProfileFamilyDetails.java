package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfileFamilyDetails extends AndroidActions {

		AndroidDriver driver;
		
		 public MyProfileFamilyDetails(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Profile\"]/android.widget.FrameLayout")
		 private WebElement MyProfile;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/familyDetails_layout")
		 private WebElement FamilyDetails;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fabAddFamily")
		 private WebElement AddFamily;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evMemberName")
		 private WebElement MemberName;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/spinnerRelationShip")
		 private WebElement Relationship;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/family_dob")
		 private WebElement DOB;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/family_contactNumber")
		 private WebElement Number;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/buttonAddMember")
		 private WebElement Add;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgMore")
		 private WebElement Edit;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
		 private WebElement EditButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/buttonAddMember")
		 private WebElement Update;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
		 private WebElement Delete;
		 
		 @AndroidFindBy(id = "android:id/button2")
		 private WebElement Cancel;
		 
		 @AndroidFindBy(id = "android:id/button1")
		 private WebElement YesorOK;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.TextView")
		 private WebElement Home;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvNoDataFound")
		 private WebElement NoData;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvPersonCount")
		 private WebElement Family1;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/memberName")
		 private WebElement MemberNameView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/relationShip")
		 private WebElement RelationshipView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/dateofBirth")
		 private WebElement DOBView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/contactNumber")
		 private WebElement ContactView;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
		 private WebElement EditIcon;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
		 private WebElement DeleteIcon;
		 
		 @AndroidFindBy(id = "android:id/message")
		 private WebElement DeletePopup;
		 
		 @AndroidFindBy(id = "android:id/date_picker_header_year")
		 private WebElement YearView;
		 
		 @AndroidFindBy(id = "android:id/date_picker_header_date")
		 private WebElement MonthDayView;
		 
		 @AndroidFindBy(id = "android:id/prev")
		 private WebElement Preview;
		 
		 @AndroidFindBy(id = "android:id/next")
		 private WebElement NextMonthView;
		 
		 @AndroidFindBy(id = "android:id/month_view")
		 private WebElement MonthView;
		 
		 public void clickMyProfile()
			{
				MyProfile.click();
			}
		 public void clickMyfamily()
			{
				FamilyDetails.click();
			}
		 public void clickAddFamily()
			{
				AddFamily.click();
			}
		 public void Sendmembername(String member)
			{
				MemberName.sendKeys(member);
			}
		 public void clickdropdown()
			{
				Relationship.click();
			}
		 public void clickdbirth()
			{
				DOB.click();
			}
		 public void Sendnumber(String number2)
			{
				Number.sendKeys(number2);
			}
		 public void clickadd()
			{
				Add.click();
			}
		 public void clickEdit()
			{
				Edit.click();
			}
		 public void clickUpdate()
			{
				Update.click();
			}
		 public void clickEditbutton()
			{
				EditButton.click();
			}
		 public void clickDelete()
			{
				Delete.click();
			}
		 public void clickCancel()
			{
				Cancel.click();
			}
		 public void clickYesorOK()
			{
				YesorOK.click();
			}
		 public void clickback()
			{
				Back.click();
			}
		 public void clickhome()
			{
				Home.click();
			}
		 public void FamilyUIAssertions1() 
		    {
			    Back.isDisplayed();
			    
			    String FamilyDetails = Header.getText();
			    assertEquals(FamilyDetails, "Family Details");
			    
			    String NoRecords = NoData.getText();
			    assertEquals(NoRecords, "No records found");
			    
			    AddFamily.isDisplayed();
		    }
		 public void FamilyUIAssertions2() 
		    {
			    Back.isDisplayed();
			    
			    String AddMember = Header.getText();
			    assertEquals(AddMember, "Add Member");
			    
			    String Name = MemberName.getText();
			    assertEquals(Name, "Member Name");
			    
			    String Relation = Relationship.getText();
			    assertEquals(Relation, "Relationship");
			    
			    String DateOfJ = DOB.getText();
			    assertEquals(DateOfJ, "Date of Birth");
			    
			    String ContactNumber = Number.getText();
			    assertEquals(ContactNumber, "Contact No");
			    
			    String AddFamily = Add.getText();
			    assertEquals(AddFamily, "Add");
		    }
		 public void FamilyUIAssertions3() 
		    {
			    YearView.isDisplayed();
			    
			    MonthDayView.isDisplayed();
			    
			    Preview.isDisplayed();
			    
			    NextMonthView.isDisplayed();
			    
			    MonthView.isDisplayed();
			    
			    String Can = Cancel.getText();
			    assertEquals(Can, "CANCEL");
			    
			    String Ok = YesorOK.getText();
			    assertEquals(Ok, "OK");
		    }
		 public void FamilyUIAssertions4() 
		    {
			    Family1.isDisplayed();
			    
			    Back.isDisplayed();
			    
			    Edit.isDisplayed();
			    
			    MemberNameView.isDisplayed();
			    
			    RelationshipView.isDisplayed();
			    
			    DOBView.isDisplayed();
			    
			    ContactView.isDisplayed();
		    }
		 public void FamilyUIAssertions5() 
		    {
			    EditIcon.isDisplayed();
			    
			    String EditText = EditButton.getText();
			    assertEquals(EditText, "Edit");
			    
			    DeleteIcon.isDisplayed();
			    
			    String DeleteText = Delete.getText();
			    assertEquals(DeleteText, "Delete");
		    }
		 public void FamilyUIAssertions6() 
		    {
			    Back.isDisplayed();
			    
			    String EditMember = Header.getText();
			    assertEquals(EditMember, "Edit Member");
			    
			    String UpdateText = Update.getText();
			    assertEquals(UpdateText, "Update");
		    }
		 public void FamilyUIAssertions7() 
		    {
			    Cancel.isDisplayed();
			    
			    String Deletepopuptext = DeletePopup.getText();
			    assertEquals(Deletepopuptext, "Are you sure you want to delete ?\n");
			    
			    String Yes = YesorOK.getText();
			    assertEquals(Yes, "YES");
		    }
	
 }
