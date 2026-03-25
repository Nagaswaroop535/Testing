package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfileQualificationDetails {

		AndroidDriver driver;
		
		 public MyProfileQualificationDetails(AndroidDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Profile\"]/android.widget.FrameLayout")
		 private WebElement MyProfile;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/qualificationDetails_layout")
		 private WebElement Qualification;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fabAddEducation")
		 private WebElement AddQualification;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evQualification")
		 private WebElement QualificationDetails;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evSchoolOrCollege")
		 private WebElement School;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evBoard")
		 private WebElement Board;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvYearOfPassing")
		 private WebElement Year;
		 
		 @AndroidFindBy(id = "android:id/button2")
		 private WebElement Cancel;
		 
		 @AndroidFindBy(id = "android:id/button1")
		 private WebElement OkorYes;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evGrade")
		 private WebElement Grade;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/buttonAddEducation")
		 private WebElement Add;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgMore")
		 private WebElement Edit;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
		 private WebElement EditButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/buttonAddEducation")
		 private WebElement Update;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
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
		 
		 @AndroidFindBy(id = "android.widget.TextView")
		 private WebElement YearText;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvQualificationNo")
		 private WebElement Qua1;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
		 private WebElement EditImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
		 private WebElement DeleteImage;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvQualificationTitle")
		 private WebElement QulificationView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvCollegeName")
		 private WebElement SchoolCollageView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvUniversityName")
		 private WebElement BoardUniversityView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvPassingYear")
		 private WebElement YearView;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvGrade")
		 private WebElement GradePercentageView;
		 
		 @AndroidFindBy(id = "android:id/message")
		 private WebElement DeletePopupText;
		 
		 public void clickMyProfile()
			{
				MyProfile.click();
			}
		 public void clickQualification()
			{
				Qualification.click();
			}
		 public void clickAddQualification()
			{
			    AddQualification.click();
			}
		 public void SendQualificationDetails(String Details)
			{
			    QualificationDetails.sendKeys(Details);
			}
		 public void SendSchool(String School1)
			{
			    School.sendKeys(School1);
			}
		 public void SendBoard(String University)
			{
			    Board.sendKeys(University);
			}
		 public void clickyear()
			{
				Year.click();
			}
		 public void clickcancle()
			{
				Cancel.click();
			}
		 public void clickOKoryes()
			{
				OkorYes.click();
			}
		 public void Sendgrade(String Grade1)
			{
			    Grade.sendKeys(Grade1);
			}
		 public void clickAdd()
			{
			    Add.click();;
			}
		 public void clickEdit()
			{
			    Edit.click();
			}
		 public void clickEditButton()
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
		 public void QualificationDetailsInfoUIValidation1() 
		    {
			    Back.isDisplayed();
			    
			    String QualificationDetails = Header.getText();
			    assertEquals(QualificationDetails, "Qualification Details");
			    
			    String NodataFound = NoData.getText();
			    assertEquals(NodataFound, "No records found");
			    
			    AddQualification.isDisplayed();
		    }
		 public void QualificationDetailsInfoUIValidation2() 
		    {
			    Back.isDisplayed();
			    
			    String AddQualification = Header.getText();
			    assertEquals(AddQualification, "Add Qualification");
			    
			    String QulificationText = QualificationDetails.getText();
			    assertEquals(QulificationText, "Qualification");
			    
			    String SchoolCollege = School.getText();
			    assertEquals(SchoolCollege, "School/College");
			    
			    String BoardUniver = Board.getText();
			    assertEquals(BoardUniver, "Board/University");
			    
			    String YearText = Year.getText();
			    assertEquals(YearText, "Year");
			    
			    String GradePercent = Grade.getText();
			    assertEquals(GradePercent, "Grade/Percentage");
			    
			    String AddText = Add.getText();
			    assertEquals(AddText, "Add");
		    }
		 public void QualificationDetailsInfoUIValidation3() 
		    {
//			    YearText.isDisplayed();
			    
			    Cancel.isDisplayed();
			    
			    OkorYes.isDisplayed();
		    }
		 public void QualificationDetailsInfoUIValidation4() 
		    {
			    Back.isDisplayed();
			    
			    Edit.isDisplayed();
			    
			    Header.isDisplayed();
			    
			    String Qulification1 = Qua1.getText();
			    assertEquals(Qulification1, "Qualification 1");
			    
			    QulificationView.isDisplayed();
			    
			    SchoolCollageView.isDisplayed();
			    
			    BoardUniversityView.isDisplayed();
			    
			    YearView.isDisplayed();
			    
			    GradePercentageView.isDisplayed();
		    }
		 public void QualificationDetailsInfoUIValidation5() 
		    {
			    EditImage.isDisplayed();
			    
			    String EditText = EditButton.getText();
			    assertEquals(EditText, "Edit");
			    
			    DeleteImage.isDisplayed();
			    
			    String DeleteText = Delete.getText();
			    assertEquals(DeleteText, "Delete");
		    }
		 public void QualificationDetailsInfoUIValidation6() 
		    {
			    Back.isDisplayed();
			    
			    String EditQulification = Header.getText();
			    assertEquals(EditQulification, "Edit Qualification");
			    
			    String UpdateText = Update.getText();
			    assertEquals(UpdateText, "Update"); 		
		    }
		 public void QualificationDetailsInfoUIValidation7() 
		    {
			    String DeletePop = DeletePopupText.getText();
			    assertEquals(DeletePop, "Are you sure you want to delete ?\n");
			    
			    String Can = Cancel.getText();
			    assertEquals(Can, "CANCEL");
			    
			    String Yes = OkorYes.getText();
			    assertEquals(Yes, "YES");
		    }
}