package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingsAssertions extends AndroidActions{

		AndroidDriver driver;
		
		 public SettingsAssertions(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Settings\"]/android.widget.FrameLayout/android.widget.ImageView")
		 private WebElement Settings;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvTitle")
		 private WebElement Header;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
		 private WebElement SubHeder1;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.ImageView[1]")
		 private WebElement ChangePasswordIcon;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView")
		 private WebElement ChangePasswordText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView[1]")
		 private WebElement BiometricImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView")
		 private WebElement BiometricText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[2]")
		 private WebElement SubHeder2;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.ImageView")
		 private WebElement HelpImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView")
		 private WebElement HelpText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.ImageView")
		 private WebElement TermsImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView")
		 private WebElement TermsText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.ImageView")
		 private WebElement CompanyPoliciesImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.TextView")
		 private WebElement CompanyPoliciesText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.ImageView")
		 private WebElement VersionImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[1]")
		 private WebElement VersionTest;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/textRight")
		 private WebElement VersionNumber;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView")
		 private WebElement Home;
		 
		 public void ClickonSetting() 
		    {
			    Settings.click();
		    }
		 public void SettingsUIValidation() 
		    {
			    String SettingsText = Header.getText();
			    assertEquals(SettingsText, "Settings");
			    
			    String PersonalSettings = SubHeder1.getText();
			    assertEquals(PersonalSettings, "Personal Settings");
			    
			    ChangePasswordIcon.isDisplayed();
			    
			    String ChangePassword = ChangePasswordText.getText();
			    assertEquals(ChangePassword, "Change Password");
			    
			    BiometricImage.isDisplayed();
			    
			    String EnableBiometric = BiometricText.getText();
			    assertEquals(EnableBiometric, "Enable Biometric");
			    
			    String Support = SubHeder2.getText();
			    assertEquals(Support, "Support & About");
			    
			    HelpImage.isDisplayed();
			    
			    String HelpAndSupport = HelpText.getText();
			    assertEquals(HelpAndSupport, "Help and Support");
			    
			    TermsImage.isDisplayed();
			    
			    String TermsAndConditions = TermsText.getText();
			    assertEquals(TermsAndConditions, "Terms and Conditions");
			    
			    CompanyPoliciesImage.isDisplayed();
			    
			    String CompanyPoliceies = CompanyPoliciesText.getText();
			    assertEquals(CompanyPoliceies, "Company Policies");
			    
			    VersionImage.isDisplayed();
			    
			    String Version = VersionTest.getText();
			    assertEquals(Version, "Version");
			    
			    VersionNumber.isDisplayed();
		    }
		 public void ClickonHome() 
		    {
			    Home.click();
		    }
			
		
}
