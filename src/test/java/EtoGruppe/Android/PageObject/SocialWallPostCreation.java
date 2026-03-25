package EtoGruppe.Android.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SocialWallPostCreation extends AndroidActions{

		AndroidDriver driver;
		
		 public SocialWallPostCreation(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/navigation_bar_item_large_label_view")
		 private WebElement Home;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fabCreatePost")
		 private WebElement CreatePost;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evPostTitle")
		 private WebElement PostTitle;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evDescription")
		 private WebElement PostDiscription;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnCreatePost")
		 private WebElement PostButton;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
		 private WebElement MediaButton;
		 
		 @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
		 private WebElement Permission;
		 
		 @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
		 private WebElement VideoPermission;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
		 private WebElement Cemara;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
		 private WebElement Gallery;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")
		 private WebElement Video;
		 
		 @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Shutter']")
		 private WebElement Shutter;
		 
		 @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Retake']")
		 private WebElement Retake;
		 
		 @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Done']")
		 private WebElement DoneImage;
		 
		 @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Cancel']")
		 private WebElement CancleImage;
		 
		 @AndroidFindBy(id = "android.widget.ImageButton")
		 private WebElement CancleImageGallery;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/cancelAttachment")
		 private WebElement DeleteAttachment;
		 
		 @AndroidFindBy(id = "android:id/button1")
		 private WebElement OKButton;
		 
//		 Assertions
		 
		 //@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
		 //private WebElement DocumentButton;
		 
		 public void clickHome()
			{
				Home.click();
			}
		 public void clickPostCreation()
			{
				CreatePost.click();
			}
		 public void SendPostTittle(String Tittle)
			{
				PostTitle.sendKeys(Tittle);
			}
		 public void SendPostDiscription(String Discription)
			{
				PostDiscription.sendKeys(Discription);
			}
		 public void clickBack()
			{
				Back.click();
			}
		 public void clickPost()
			{
				PostButton.click();
			}
		 public void clickMedia()
			{
				MediaButton.click();
			}
		 public void clickImagePermission()
			{
				Permission.click();
			}
		 public void clickVideoPermission()
			{
				VideoPermission.click();
			}
		 public void clickMediaOptions(String Options)
			{
				if (Options.contains("Camera"))
					Cemara.click();
				if (Options.contains("Gallery"))
					Gallery.click();
				else
					Video.click();
			}
		 public void clickShutter()
			{
				Shutter.click();
			}
		 public void clickRetake()
			{
				Retake.click();
			}
		 public void clickDoneImage()
			{
				DoneImage.click();
			}
		 public void clickCancelImage()
			{
				CancleImage.click();
			}
		 public void clickCancelImageGellery()
			{
				CancleImageGallery.click();
			}
		 public void clickDeleteAttachment()
			{
				DeleteAttachment.click();
			}
		 public void clickOkButton()
			{
				OKButton.click();
			}
		
	
}