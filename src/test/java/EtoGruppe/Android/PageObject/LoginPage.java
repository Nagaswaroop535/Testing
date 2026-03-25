package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

		AndroidDriver driver;
		
		 public LoginPage(AndroidDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etUserName")
		 private WebElement email;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/etPassword")
		 private WebElement password;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/text_input_end_icon")
		 private WebElement mask;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btLogin")
		 private WebElement loginbutton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvShowLoginScreen")
		 private WebElement NewUser;
		 
//		 Assertion Code
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/app_logo")
		 private WebElement Logo;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvLabelLogin")
		 private WebElement LoginText;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvUserNameLabel")
		 private WebElement EnterYourDetails;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvForgotPassword")
		 private WebElement ForgetPassword;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvAppVersion")
		 private WebElement AppVersion;
		 
		 public void setEmail(String name)
			{
				email.sendKeys(name);
			}
		 public void setpassword(String password1)
			{
				password.sendKeys(password1);
			}
		 public void clickonPasswordHid()
			{
				mask.click();
			}
		 public void clickonlogin()
			{
				loginbutton.click();
			}
		 public void clickonNew()
			{
				NewUser.click();
			}
		 
		 public void LoginUIAssertion() 
		    {
			    Logo.isDisplayed();
			    
			    String Lointext = LoginText.getText();
			    assertEquals(Lointext, "Log In");
			    
			    String EnterYour = EnterYourDetails.getText();
			    assertEquals(EnterYour, "Enter your credentials");
			    
			    String UserName = email.getText();
			    assertEquals(UserName, "User Name");
			    
			    String Pass = password.getText();
			    assertEquals(Pass, "Password");
			    
			    mask.isDisplayed();
			    
			    String Forgotpass = ForgetPassword.getText();
			    assertEquals(Forgotpass, "Forgot Password?");
			    
			    String LoginButton = loginbutton.getText();
			    assertEquals(LoginButton, "Login");
			    
			    AppVersion.isDisplayed();
			 
			}	
}
