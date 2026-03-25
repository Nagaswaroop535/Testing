package EtoGruppe.Android.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends AndroidActions{

		AndroidDriver driver;
		
		 public HomePage(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/navigation_bar_item_large_label_view")
		 private WebElement Home;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.widget.TextView[2]")
		 private WebElement PublicPost;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgComments")
		 private WebElement CommentButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/evComments")
		 private WebElement CommentText;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgPostComment")
		 private WebElement PostComment;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvClose")
		 private WebElement CommentWindowClose;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgLike")
		 private WebElement LikePost;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvViewAllComments")
		 private WebElement ViewAllComments;
		 
		 @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Location News']")
		 private WebElement LocationNews;
		 
		 @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Social Wall']")
		 private WebElement SocialNews;
		 
		 @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Gruppe News']")
		 private WebElement GroupeNews;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView")
		 private WebElement FullScreen;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement FullScreenclose;
		 
//		 Assertion
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement MenuButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/ivLogo")
		 private WebElement Logo;
		 
		 @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Gruppe News']/android.widget.TextView")
		 private WebElement GroupText;
		 
		 @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Location News']/android.widget.TextView")
		 private WebElement LocationText;
		 
		 @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Social Wall']/android.widget.TextView")
		 private WebElement SocialText;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.widget.ImageView[2]")
		 private WebElement Pinbutton;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Home']/android.widget.FrameLayout/android.widget.ImageView")
		 private WebElement HomeImage;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='ESS']/android.widget.FrameLayout/android.widget.ImageView")
		 private WebElement ESSImage;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.ImageView")
		 private WebElement CreatePostImage;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Settings']/android.widget.FrameLayout/android.widget.ImageView")
		 private WebElement SettingsImage;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='My Profile']/android.widget.FrameLayout/android.widget.ImageView")
		 private WebElement MyProfileIamge;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='ESS']/android.view.ViewGroup/android.widget.TextView")
		 private WebElement ESSText;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Settings']/android.view.ViewGroup/android.widget.TextView")
		 private WebElement SettingsText;
		 
		 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='My Profile']/android.view.ViewGroup/android.widget.TextView")
		 private WebElement MyProfileText;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgBtChat")
		 private WebElement ChatImage;
		 
		 public void clickHome()
			{
				Home.click();
			}
		 public void clickPost()
			{
				PublicPost.click();
			}
		 public void clickBack()
			{
				Back.click();
			}
		 public void clickCommentButton()
			{
				CommentButton.click();
			}
		 public void SendComment(String Comment)
			{
				CommentText.sendKeys(Comment);
			}
		 public void clickPostComment()
			{
				PostComment.click();
			}
		 public void clickcommentwindowclose()
			{
				CommentWindowClose.click();
			}
		 public void clickLike()
			{
				LikePost.click();
			}
		 public void clickViewAllComments()
			{
				ViewAllComments.click();
			}
		 public void clickFullScreen()
			{
				FullScreen.click();
			}
		 public void clickCloseFullScreen()
			{
				FullScreenclose.click();
			}
		 public void clickLocationNews()
			{
				LocationNews.click();
			}
		 public void clickSocialNews()
			{
				SocialNews.click();
			}
		 public void clickGruppeNews()
			{
				GroupeNews.click();
			}
		 public void HomePageUIValidation() 
		    {
			 MenuButton.isDisplayed();
			 
			 Logo.isDisplayed();
			 
			 String GroupNewsText = GroupText.getText();
			 assertEquals(GroupNewsText, "Gruppe News");
			 
			 String LocationNewsText = LocationText.getText();
			 assertEquals(LocationNewsText, "Location News");
			 
			 String SocialWallText = SocialText.getText();
			 assertEquals(SocialWallText, "Social Wall");
			 
			 Pinbutton.isDisplayed();
			 
			 LikePost.isDisplayed();
			 
			 CommentButton.isDisplayed();
			 
			 ViewAllComments.isDisplayed();
			 
			 ChatImage.isDisplayed();
			 
			 HomeImage.isDisplayed();
			 
			 String HomeText = Home.getText();
			 assertEquals(HomeText, "Home");
			 
			 ESSImage.isDisplayed();
			 
			 String Esstext = ESSText.getText();
			 assertEquals(Esstext, "ESS");
			 
			 CreatePostImage.isDisplayed();
			 
			 SettingsImage.isDisplayed();
			 
			 String Settingstext = SettingsText.getText();
			 assertEquals(Settingstext, "Settings");
			 
			 MyProfileIamge.isDisplayed();
			 
			 String Myprofiletext = MyProfileText.getText();
			 assertEquals(Myprofiletext, "My Profile");
			}
}