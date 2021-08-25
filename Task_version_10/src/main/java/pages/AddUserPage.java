package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends PageBase {

	public AddUserPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(id="systemUser_employeeName_empName")
	public WebElement employeeName ; 
	
	@FindBy(id="systemUser_userName")
	public WebElement userName ; 
	
	@FindBy(id="systemUser_password")
	public WebElement password ; 
	
	@FindBy(id="systemUser_confirmPassword")
	public WebElement Confirmpassword ; 
	
	@FindBy(id="btnSave")
	public WebElement Savebtn ; 
	
	
	
 public void ClickOnEmpNameField ()
 {
	 employeeName.click();
 }
 public void ClickUsernameField ()
 {
	 userName.click();
 }
 public void ClickOnPasswordField ()
 {
	 password.click();
 }
 public void ClickOnConfirmPasswordField ()
 {
	 Confirmpassword.click();
 }
 
 public void ClickOnSavebtn ()
 {
	 Savebtn.click();
 }

 
}
