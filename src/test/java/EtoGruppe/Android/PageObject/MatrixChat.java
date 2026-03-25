package EtoGruppe.Android.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import EtoGruppe.Android.Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MatrixChat extends AndroidActions{

		AndroidDriver driver;
		
		 public MatrixChat(AndroidDriver driver)
		 {
			 super(driver);
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/navigation_bar_item_large_label_view")
		 private WebElement Home;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/imgBtChat")
		 private WebElement ChatButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fabRoomCreate")
		 private WebElement PlusButton;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
		 private WebElement NewChat;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
		 private WebElement NewGroup;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup")
		 private WebElement Person1;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[2]/android.view.ViewGroup")
		 private WebElement Person2;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[3]/android.view.ViewGroup")
		 private WebElement Person3;
		 
		 @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Close'])[3]")
		 private WebElement DeletePerson3;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnReject")
		 private WebElement CancleRequest;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnAccept")
		 private WebElement ChatRequest;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/appCompatEditText")
		 private WebElement Edittext;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnSend")
		 private WebElement SendText;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fabNext")
		 private WebElement GroupNext;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
		 private WebElement GroupName;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
		 private WebElement GroupDiscription;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnMenu")
		 private WebElement MenuButtonGroup;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/content")
		 private WebElement EditGroup;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
		 private WebElement EditGroupName;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
		 private WebElement EditGroupDiscription;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnAddMore")
		 private WebElement AddMembers;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[8]/android.view.ViewGroup")
		 private WebElement Person4;
		 
		 @AndroidFindBy(id = "android:id/button1")
		 private WebElement Yes;
		 
		 @AndroidFindBy(id = "android:id/button2")
		 private WebElement CancelorDiscard;
		 
		 @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]")
		 private WebElement DeleteUser;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnSave")
		 private WebElement SaveGroup;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnInvite")
		 private WebElement Invite;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
//		 Assertions
		 
		 public void clickHome()
			{
				Home.click();
			}
		 public void clickChat()
			{
				ChatButton.click();
			}
		 public void clickPlus()
			{
				PlusButton.click();
			}
		 public void ClickChatOptions(String Options)
			{
				if(Options.contains("New Chat"))
					NewChat.click();
				else
					NewGroup.click();
			}
		 public void clickPerson1()
			{
				Person1.click();
			}
		 public void clickGroupPerson2()
			{
				Person2.click();
			}
		 public void clickGroupPerson3()
			{
				Person3.click();
			}
		 public void clickDeletePerson3()
			{
				DeletePerson3.click();
			}
		 public void clickcanclesendrequest()
			{
				CancleRequest.click();
			}
		 public void clickChatnew()
			{
				ChatRequest.click();
			}
		 public void SendText(String text)
			{
				Edittext.sendKeys(text);
			}
		 public void clickSend()
			{
				SendText.click();
			}
		 public void clickGroupNext()
			{
				GroupNext.click();
			}
		 public void SendGroupName(String Name)
			{
				GroupName.sendKeys(Name);
			}
		 public void SendGroupDiscription(String Discription)
			{
				GroupDiscription.sendKeys(Discription);
			}
		 public void clickMenuButton()
			{
				MenuButtonGroup.click();
			}
		 public void clickEditGroup()
			{
				EditGroup.click();
			}
		 public void SendEditGroupName(String EditName)
			{
				EditGroupName.sendKeys(EditName);
			}
		 public void SendEditDiscription(String EditDiscription)
			{
			    EditGroupDiscription.sendKeys(EditDiscription);
			}
		 public void clickAddMember()
			{
				AddMembers.click();
			}
		 public void clickPerson4()
			{
				Person4.click();
			}
		 public void clickYes()
			{
				Yes.click();
			}
		 public void clickCancleorDiscard()
			{
				CancelorDiscard.click();
			}
		 public void clickDeleteUser()
			{
				DeleteUser.click();
			}
		 public void clickSaveGroup()
			{
				SaveGroup.click();
			}
		 public void clickBack()
			{
				Back.click();
			}
		 public void clickInvitet()
			{
				Invite.click();
			}



}