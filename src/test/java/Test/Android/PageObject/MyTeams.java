package EtoGruppe.Android.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyTeams {

		AndroidDriver driver;
		
		 public MyTeams(AndroidDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 }
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnNavigationIcon")
		 private WebElement MenuButton;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/fragment_my_teams")
		 private WebElement MyTeam;
		 
		 @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
		 private WebElement ShowDetails;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/tvShowMembers")
		 private WebElement ShowMembers;
		 
		 @AndroidFindBy(id = "com.etogruppe.myeto:id/btnBack")
		 private WebElement Back;
		 
//		 Assertions
		 
		 public void clickmenu()
			{
				MenuButton.click();
			}
		 public void clickmyteam()
			{
				MyTeam.click();
			}
		 public void clickshowdetails()
			{
				ShowDetails.click();
			}
		 public void clickshowmembers()
			{
				ShowMembers.click();
			}
		 public void clickback()
			{
				Back.click();
			}
		 
		//driver.findElement(By.id("com.etogruppe.myeto:id/btnNavigationIcon")).click();
		//driver.findElement(By.id("com.etogruppe.myeto:id/fragment_my_teams")).click();
		
		//Assertion
		//String header = driver.findElement(By.id("com.etogruppe.myeto:id/tvTitle")).getText();
		//assertEquals(header, "My Team List");
		//String Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[1]")).getText();
		//assertEquals(Name, "Team Name");
		//String Branch = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[1]")).getText();
		//assertEquals(Branch, "Branch Name");
		//String Location = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[1]")).getText();
		//assertEquals(Location, "Branch Location");
		//String Show =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).getText();
		//assertEquals(Show, "Show Details");
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
		
		//String heder2 = driver.findElement(By.id("com.etogruppe.myeto:id/tvTitle")).getText();
		//assertEquals(heder2, "My Team Details");
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Show Members\"));"));
		
		//String admin = driver.findElement(By.id("com.etogruppe.myeto:id/tvAdmins")).getText();
		//assertEquals(admin, "Admins");
		
		//driver.findElement(By.id("com.etogruppe.myeto:id/tvShowMembers")).click();
		
		//String heder3 = driver.findElement(By.id("com.etogruppe.myeto:id/tvTitle")).getText();
		//assertEquals(heder3, "Team Members");
		
		//driver.findElement(By.id("com.etogruppe.myeto:id/btnBack")).click();
		//driver.findElement(By.id("com.etogruppe.myeto:id/btnBack")).click();
		//driver.findElement(By.id("com.etogruppe.myeto:id/btnBack")).click();
		
		
	
}