package EtoGruppe.Android;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import EtoGruppe.Android.PageObject.LoginPage;
import EtoGruppe.Android.PageObject.EtoLocations;
import EtoGruppe.Android.PageObject.MyBranch;
import EtoGruppe.Android.PageObject.Faq;
import EtoGruppe.Android.PageObject.Addressbook;
import EtoGruppe.Android.PageObject.LocationSpecific;
import EtoGruppe.Android.PageObject.MyProfileCompanyInformation;
import EtoGruppe.Android.PageObject.MyTeams;
import EtoGruppe.Android.PageObject.CompanyCalendar;
import EtoGruppe.Android.PageObject.MyProfileEmergencyContact;
import EtoGruppe.Android.PageObject.MyProfileFamilyDetails;
import EtoGruppe.Android.PageObject.MyProfileQualificationDetails;
import EtoGruppe.Android.PageObject.MyProfileExperienceDetails;
import EtoGruppe.Android.PageObject.MyProfilePersonalInformation;
import EtoGruppe.Android.PageObject.HomePage;
import EtoGruppe.Android.PageObject.SocialWallPostCreation;
import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.Activity;
import EtoGruppe.Android.PageObject.MatrixChat;
import EtoGruppe.Android.PageObject.MyProfileAssertion;
import EtoGruppe.Android.PageObject.MenuButtonAssertion;
import EtoGruppe.Android.PageObject.MyProfileContactInformation;
import EtoGruppe.Android.PageObject.SettingsAssertions;

public class TestCasesAndroid extends BaseServerClass {

	
	@Test (priority = 0, enabled = true)
	public void LoginPageAndroid()
	{
		
		LoginPage LoginPage = new LoginPage(driver);
		LoginPage.LoginUIAssertion();
		LoginPage.setEmail("s.purvat@yopmail.com");
		LoginPage.setpassword("Eto@12345");
		LoginPage.clickonPasswordHid();
		LoginPage.clickonlogin();
		
	}
	
	@BeforeMethod
	public void preSetup()
	{
		Activity activity = new Activity("com.etogruppe.myeto","com.etogruppe.myeto.ui.activity.MainActivity");
		driver.startActivity(activity);
//		((JavascriptExecutor)driver).executeScript("mobile: startActivity", ImmutableMap.of("internt","com.google.android.apps.nexuslauncher/com.google.android.apps.nexuslauncher.NexusLauncherActivity"));
			
			LoginPage LoginPage = new LoginPage(driver);
			try {
				LoginPage.clickonNew();
			}
			catch (Exception e) {
				System.out.print("Its new login Page " +e);
			}
//			LoginPage.LoginUIAssertion();
			LoginPage.setEmail("p.nagaswaroop@etogruppe.com");
			LoginPage.setpassword("Eto@123456");
			LoginPage.clickonPasswordHid();
			LoginPage.clickonlogin();
			
		
	
	}
	
	@Test (priority = 8, enabled = true)
	public void MatrixChat()
	{
		
		MatrixChat MatrixChat = new MatrixChat(driver);
		MatrixChat.clickHome();
		MatrixChat.clickChat();
		MatrixChat.clickPlus();
		MatrixChat.ClickChatOptions("New Chat");
		MatrixChat.clickPerson1();
		MatrixChat.clickcanclesendrequest();
		MatrixChat.clickPerson1();
		MatrixChat.clickChatnew();
		MatrixChat.SendText("Testing123");
		MatrixChat.clickSend();
		MatrixChat.clickBack();
		MatrixChat.clickPlus();
		MatrixChat.ClickChatOptions("New Group");
		MatrixChat.clickPerson1();
		MatrixChat.clickGroupPerson2();
		MatrixChat.clickGroupPerson3();
		MatrixChat.clickDeletePerson3();
		MatrixChat.clickGroupPerson3();
		MatrixChat.clickGroupNext();
		MatrixChat.SendGroupName("Testing Test");
		MatrixChat.SendGroupDiscription("Text Discription");
		MatrixChat.clickDeletePerson3();
		MatrixChat.clickGroupNext();
		MatrixChat.clickMenuButton();
		MatrixChat.clickEditGroup();
		MatrixChat.SendEditGroupName("Testing Data2");
		MatrixChat.SendEditDiscription("Testing Edited Discription");
		MatrixChat.clickSaveGroup();
		MatrixChat.clickYes();
		MatrixChat.clickMenuButton();
		MatrixChat.clickEditGroup();
		MatrixChat.clickAddMember();
		MatrixChat.clickPerson4();
		MatrixChat.clickCancleorDiscard();
		MatrixChat.clickPerson4();
		MatrixChat.clickYes();
		MatrixChat.clickGroupNext();
		MatrixChat.clickDeleteUser();
		MatrixChat.clickCancleorDiscard();
		MatrixChat.clickDeleteUser();
		MatrixChat.clickYes();
		MatrixChat.clickBack();
		MatrixChat.SendText("Testing123");
		MatrixChat.clickSend();
		MatrixChat.clickBack();
		MatrixChat.clickBack();
	}
	
	@Test (priority = 9, enabled = true)
	public void HomePage()
	{
		
		HomePage HomePage = new HomePage(driver);
		HomePage.HomePageUIValidation();
		HomePage.clickHome();
		HomePage.clickPost();
		HomePage.clickCommentButton();
		HomePage.clickPostComment();
		HomePage.SendComment("Testing 123");
		HomePage.clickPostComment();
		HomePage.clickcommentwindowclose();
		HomePage.clickLike();
		HomePage.clickViewAllComments();
		HomePage.clickcommentwindowclose();
		HomePage.clickBack();
		HomePage.clickLike();
		HomePage.clickViewAllComments();
		HomePage.clickcommentwindowclose();
		HomePage.clickFullScreen();
		HomePage.clickCloseFullScreen();
		HomePage.clickLocationNews();
		HomePage.clickSocialNews();
		HomePage.clickGruppeNews();	
	}
	@Test (priority = 19, enabled = true)
	public void SocialWallPostCreation()
	{
		
		SocialWallPostCreation SocialWallPostCreation = new SocialWallPostCreation(driver);
		SocialWallPostCreation.clickHome();
		SocialWallPostCreation.clickPostCreation();
		SocialWallPostCreation.SendPostTittle("Testing 123");
		SocialWallPostCreation.SendPostDiscription("Testing Discription 123");
		//SocialWallPostCreation.clickMedia();
		//SocialWallPostCreation.clickImagePermission();
		//SocialWallPostCreation.clickImagePermission();
		//SocialWallPostCreation.clickVideoPermission();
		//SocialWallPostCreation.clickMediaOptions("Camera");
		//SocialWallPostCreation.clickShutter();
		//SocialWallPostCreation.clickRetake();
		//SocialWallPostCreation.clickShutter();
		//SocialWallPostCreation.clickCancelImage();
		//SocialWallPostCreation.clickMedia();
		//SocialWallPostCreation.clickMediaOptions("Camera");
		//SocialWallPostCreation.clickShutter();
		//SocialWallPostCreation.clickDoneImage();
		//SocialWallPostCreation.clickCancelImage();
		//SocialWallPostCreation.clickMedia();
		//SocialWallPostCreation.clickMediaOptions("Camera");
		//SocialWallPostCreation.clickShutter();
		SocialWallPostCreation.clickPost();
		SocialWallPostCreation.clickOkButton();
		SocialWallPostCreation.clickHome();
	}
	
	@Test (priority = 1, enabled = true)
	public void AMyProfileAssertion()
	{
		
		MyProfileAssertion MyProfileAssertion = new MyProfileAssertion(driver);
		MyProfileAssertion.ClickMyProfile();
		MyProfileAssertion.MyProfilePageUIValidation();
		
	}
	
	
	@Test (priority = 1, enabled = true)
	public void MyProfilePersonalInformation()
	{
		
		MyProfilePersonalInformation MyProfilePersonalInformation = new MyProfilePersonalInformation(driver);
		MyProfilePersonalInformation.clickMyProfile();
		MyProfilePersonalInformation.clickPersonal();
		MyProfilePersonalInformation.MyProfilePersonalInfoUIValidation1();
		MyProfilePersonalInformation.clickEditPersonalInfo();
		MyProfilePersonalInformation.MyProfilePersonalInfoUIValidation2();
		MyProfilePersonalInformation.SendNumber("7066922042");
		MyProfilePersonalInformation.SendEmail("p.nagaswaroop@etogruppe.com");
		MyProfilePersonalInformation.ClickGernder();
		MyProfilePersonalInformation.ClickGernder();
		MyProfilePersonalInformation.ClickMaritalStatus();
		MyProfilePersonalInformation.ClickMaritalStatus();
		MyProfilePersonalInformation.ClickDOB();
		MyProfilePersonalInformation.ClickDOB();
		MyProfilePersonalInformation.MyProfilePersonalInfoUIValidation3();
		MyProfilePersonalInformation.ClickOK();
		MyProfilePersonalInformation.SendPassport("ABCDEFGH");
		MyProfilePersonalInformation.Dropdown("Update");
		MyProfilePersonalInformation.MyProfilePersonalInfoUIValidation4();
		MyProfilePersonalInformation.SendUniqueIdentification("123456");
		MyProfilePersonalInformation.SendDriving("Kinf123");
		MyProfilePersonalInformation.ClickBlood();
		MyProfilePersonalInformation.SendReligionDetails("Hindu");
		MyProfilePersonalInformation.SendNationalityDetails("India");
		MyProfilePersonalInformation.ClickUpdate();
		MyProfilePersonalInformation.clickback();
		MyProfilePersonalInformation.clickhome();
		
	}
	
	@Test (priority = 2, enabled = true)
	public void MyProfileCompanyInformation()
	{
		
		MyProfileCompanyInformation MyProfileCompanyInformation = new MyProfileCompanyInformation(driver);
		MyProfileCompanyInformation.clickMyProfile();
		MyProfileCompanyInformation.clickMycompanyinfo();
		MyProfileCompanyInformation.CompanyInfoPageUIAssertion();
		MyProfileCompanyInformation.clickBack();
		MyProfileCompanyInformation.clickHome();	
	}
	

	@Test (priority = 6, enabled = true)
	public void MyProfileContactInformation()
	{
		
		MyProfileContactInformation MyProfileContactInformation = new MyProfileContactInformation(driver);
		MyProfileContactInformation.clickMyProfile();
		MyProfileContactInformation.clickContactInfo();
		MyProfileContactInformation.clickEdit();
		MyProfileContactInformation.MyProfileContactInfoUIValidation1();
		MyProfileContactInformation.SendKeyPerAddress("Flat No: 302, Alfa Gardens");
		MyProfileContactInformation.SendKeyPerCity("Bangalore");
		MyProfileContactInformation.SendKeyPerCount("India");
		MyProfileContactInformation.SendKeyPerState("Karnataka");
		MyProfileContactInformation.SendKeyPerDistrict("Bangalore");
		MyProfileContactInformation.SendKeyPerPincode("560065");
		MyProfileContactInformation.Dropdown("Update");
		MyProfileContactInformation.MyProfileContactInfoUIValidation2();
		MyProfileContactInformation.clickonPresentCheck();
		MyProfileContactInformation.SendKeyPreAddress("Balazi Gardens");
		MyProfileContactInformation.SendKeyPreCity("Nellore");
		MyProfileContactInformation.SendKeyPreCountry("India");
		MyProfileContactInformation.SendKeyPreState("Andhra Pradesh");
		MyProfileContactInformation.SendKeyPreDistrict("SPSRNellore");
		MyProfileContactInformation.SendKeyPrePincode("534002");
		MyProfileContactInformation.clickonUpdate();
		MyProfileContactInformation.clickonBack();
		MyProfileContactInformation.ClickonHome();
			
	}
	
	@Test (priority = 7, enabled = true)
	public void MyProfileEmergencyContact()
	{
		
		MyProfileEmergencyContact MyProfileEmergencyContact = new MyProfileEmergencyContact(driver);
		MyProfileEmergencyContact.clickMyProfile();
		MyProfileEmergencyContact.clickEmergency();
		MyProfileEmergencyContact.EmergencyContactPageUIAssertion();
		MyProfileEmergencyContact.clickEdit();
		MyProfileEmergencyContact.Sendname("Nagaswaroop");
		MyProfileEmergencyContact.Sendnumber("7066922042");
		MyProfileEmergencyContact.Sendemail("p.nagaswaroop@gmail.com");
		MyProfileEmergencyContact.Sendaddress1("Non stop");
		MyProfileEmergencyContact.Sendaddress2("Non stop2");
		MyProfileEmergencyContact.Sendothers("Nothing");
		MyProfileEmergencyContact.clickUpdate();
		MyProfileEmergencyContact.clickback();
		MyProfileEmergencyContact.clickhome();
	}
	
	@Test (priority = 3, enabled = true)
	public void MyProfileFamilyDetails()
	{
		
		MyProfileFamilyDetails MyProfileFamilyDetails = new MyProfileFamilyDetails(driver);
		MyProfileFamilyDetails.clickMyProfile();
		MyProfileFamilyDetails.clickMyfamily();
		MyProfileFamilyDetails.FamilyUIAssertions1();
		MyProfileFamilyDetails.clickAddFamily();
		MyProfileFamilyDetails.FamilyUIAssertions2();
		MyProfileFamilyDetails.Sendmembername("Nagaswaroop");
		//MyProfileFamilyDetails.clickdropdown();
		//MyProfileFamilyDetails.clickdropdown();
		MyProfileFamilyDetails.clickdbirth();
		MyProfileFamilyDetails.FamilyUIAssertions3();
		MyProfileFamilyDetails.clickCancel();
		MyProfileFamilyDetails.clickdbirth();
		MyProfileFamilyDetails.clickYesorOK();
		MyProfileFamilyDetails.Sendnumber("7066922042");
		MyProfileFamilyDetails.clickadd();
		MyProfileFamilyDetails.FamilyUIAssertions4();
		MyProfileFamilyDetails.clickEdit();
		MyProfileFamilyDetails.FamilyUIAssertions5();
		MyProfileFamilyDetails.clickEditbutton();
		MyProfileFamilyDetails.FamilyUIAssertions6();
		MyProfileFamilyDetails.Sendmembername("Nagaswaroop Pabbisetty");
		MyProfileFamilyDetails.Sendnumber("8885674050");
		MyProfileFamilyDetails.clickUpdate();
		MyProfileFamilyDetails.clickEdit();
		MyProfileFamilyDetails.clickDelete();
		MyProfileFamilyDetails.clickCancel();
		MyProfileFamilyDetails.clickEdit();
		MyProfileFamilyDetails.clickDelete();
		MyProfileFamilyDetails.FamilyUIAssertions7();
		MyProfileFamilyDetails.clickYesorOK();
		MyProfileFamilyDetails.clickback();
		MyProfileFamilyDetails.clickhome();
		
	}
	
	@Test (priority = 4, enabled = true)
	public void MyProfileQualificationDetails()
	{
		
		MyProfileQualificationDetails MyProfileQualificationDetails = new MyProfileQualificationDetails(driver);
		MyProfileQualificationDetails.clickMyProfile();
		MyProfileQualificationDetails.clickQualification();
		MyProfileQualificationDetails.QualificationDetailsInfoUIValidation1();
		MyProfileQualificationDetails.clickAddQualification();
		MyProfileQualificationDetails.QualificationDetailsInfoUIValidation2();
		MyProfileQualificationDetails.SendQualificationDetails("B.Tech");
		MyProfileQualificationDetails.SendSchool("MLIET");
		MyProfileQualificationDetails.SendBoard("JNTUA");
		MyProfileQualificationDetails.clickyear();
		MyProfileQualificationDetails.clickcancle();
		MyProfileQualificationDetails.clickyear();
		MyProfileQualificationDetails.QualificationDetailsInfoUIValidation3();
		MyProfileQualificationDetails.clickOKoryes();
		MyProfileQualificationDetails.Sendgrade("A");
		MyProfileQualificationDetails.clickAdd();
		MyProfileQualificationDetails.QualificationDetailsInfoUIValidation4();
		MyProfileQualificationDetails.clickEdit();
		MyProfileQualificationDetails.QualificationDetailsInfoUIValidation5();
		MyProfileQualificationDetails.clickEditButton();
		MyProfileQualificationDetails.QualificationDetailsInfoUIValidation6();
		MyProfileQualificationDetails.SendQualificationDetails("M.Tech");
		MyProfileQualificationDetails.SendBoard("JNTU HYD");
		MyProfileQualificationDetails.clickUpdate();
		MyProfileQualificationDetails.clickEdit();
		MyProfileQualificationDetails.clickDelete();
		MyProfileQualificationDetails.clickcancle();
		MyProfileQualificationDetails.clickEdit();
		MyProfileQualificationDetails.clickDelete();
		MyProfileQualificationDetails.QualificationDetailsInfoUIValidation7();
		MyProfileQualificationDetails.clickOKoryes();
		MyProfileQualificationDetails.clickback();
		MyProfileQualificationDetails.clickhome();
	}
	
	@Test (priority = 5, enabled = true)
	public void MyProfileExperienceDetails()
	{
		
		MyProfileExperienceDetails MyProfileExperienceDetails = new MyProfileExperienceDetails(driver);
		MyProfileExperienceDetails.clickMyProfile();
		MyProfileExperienceDetails.clickExperience();
		MyProfileExperienceDetails.ExperieanceUIAssertions1();
		MyProfileExperienceDetails.clickAddExperience();
		MyProfileExperienceDetails.ExperieanceUIAssertions2();
		MyProfileExperienceDetails.sendCompanyName("Indium");
		MyProfileExperienceDetails.sendDesgnation("Senior Test Engineer");
		MyProfileExperienceDetails.sendLocation("Bangalore");
		MyProfileExperienceDetails.clickJoin();
		MyProfileExperienceDetails.ExperieanceUIAssertions3();
		MyProfileExperienceDetails.clickcancel();
		MyProfileExperienceDetails.clickrelive();
		MyProfileExperienceDetails.ExperieanceUIAssertions3();
		MyProfileExperienceDetails.clickokoryes();
		MyProfileExperienceDetails.clickAdd();
		MyProfileExperienceDetails.ExperieanceUIAssertions4();
		MyProfileExperienceDetails.clickEdit();
		MyProfileExperienceDetails.ExperieanceUIAssertions5();
		MyProfileExperienceDetails.clickEditbutton();
		MyProfileExperienceDetails.ExperieanceUIAssertions6();
		MyProfileExperienceDetails.sendCompanyName("SQS");
		MyProfileExperienceDetails.sendDesgnation("Tester");
		MyProfileExperienceDetails.sendLocation("Pune");
		MyProfileExperienceDetails.clickUpdate();
		MyProfileExperienceDetails.clickEdit();
		MyProfileExperienceDetails.clickDelete();
		MyProfileExperienceDetails.ExperieanceUIAssertions7();
		MyProfileExperienceDetails.clickcancel();
		MyProfileExperienceDetails.clickEdit();
		MyProfileExperienceDetails.clickDelete();
		MyProfileExperienceDetails.clickokoryes();
		MyProfileExperienceDetails.clickback();
		MyProfileExperienceDetails.clickhome();
	}
	
	@Test (priority = 10, enabled = true)
	public void MenuButtonAssertion()
	{
		MenuButtonAssertion MenuButtonAssertion = new MenuButtonAssertion(driver);
		MenuButtonAssertion.ClickonHome();
		MenuButtonAssertion.ClickonMenu();
		MenuButtonAssertion.MenuPageUIValidation();
		MenuButtonAssertion.Clickonclose();
	}
	
	
	@Test (priority = 16, enabled = true)
	public void EtoLocations()
	{
		EtoLocations EtoLocations = new EtoLocations(driver);
		EtoLocations.clickmenu();
		EtoLocations.clickEtolocation();
		try {
		EtoLocations.clickNativelocatio();}
		catch(Exception e) {
	    System.out.println("Location Permisson alredy given by user");
		}
		EtoLocations.ETOLocationUIAssertion();
		EtoLocations.clickEtolocationindia();
		EtoLocations.clickback();
	}
	
	@Test (priority = 13, enabled = true)
	public void MyBranch()
	{
		MyBranch MyBranch = new MyBranch(driver);
		MyBranch.clickmenu();
		MyBranch.clickmybranchbutton();
		MyBranch.BranchUIAssertion();
		MyBranch.clickback();
		
	}
	@Test (priority = 15, enabled = true)
	public void Faq()
	{
		Faq Faq = new Faq(driver);
		Faq.clickmenu();
		Faq.clickfaq();
		Faq.clickfirstfaq();
		Faq.FaqUIAssertion();
		Faq.clickback();
	}
	
	@Test (priority = 11, enabled = true)
	public void Addressbook()
	{
		Addressbook Addressbook = new Addressbook(driver);
		Addressbook.clickmenu();
		Addressbook.clicaddressbook();
		Addressbook.AddressBookUIAssertion1();
		Addressbook.clickcontact();
		Addressbook.AddressBookUIAssertion2();
		Addressbook.clickback();
		Addressbook.Seacrchkey("test");
		Addressbook.clickclear();
		Addressbook.clickback();
	}
	
	@Test (priority = 14, enabled = true)
	public void LocationSpecific()
	{
		LocationSpecific LocationSpecific = new LocationSpecific(driver);
		LocationSpecific.clickmenu();
		LocationSpecific.clicklocationSpecific();
		LocationSpecific.LocationSpesificUIAssertion();
		LocationSpecific.clickback();
	}
	
	@Test (priority = 12, enabled = true)
	public void MyTeams()
	{
		AndroidActions act=new AndroidActions(driver);
		MyTeams MyTeams = new MyTeams(driver);
		MyTeams.clickmenu();
		MyTeams.clickmyteam();
		MyTeams.clickshowdetails();
		act.scrollToText("Show Members");
		MyTeams.clickshowmembers();
		MyTeams.clickback();
		MyTeams.clickback();
		MyTeams.clickback();
	}
	
	@Test (priority = 17, enabled = true)
	public void CompanyCalendar()
	{
		CompanyCalendar CompanyCalendar = new CompanyCalendar(driver);
		CompanyCalendar.clickmenu();
		CompanyCalendar.clickcalendar();
		CompanyCalendar.CalendarUIAssertion();
		CompanyCalendar.clickback();
	}
	
	@Test (priority = 18, enabled = true)
	public void SettingsAssertions()
	{
		SettingsAssertions SettingsAssertions = new SettingsAssertions(driver);
		SettingsAssertions.ClickonSetting();
		SettingsAssertions.SettingsUIValidation();
		SettingsAssertions.ClickonHome();
	}
	
}
