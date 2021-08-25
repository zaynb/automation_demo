package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement AdminLink ; 
	
	@FindBy(id="menu_admin_UserManagement")
	public WebElement UserMgt ; 
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public WebElement vUsers ; 
	
	
	@FindBy(name="btnAdd")
	public WebElement AddBtn;
	
	public void ClickOnAdmin ()
	 {
		AdminLink.click();
	 }
	public void ClickOnAddbtn ()
	 {
		AddBtn.click();
	 }
	public void ViewUsers ()
	 {
		vUsers.click();
	 }
 

 
}
