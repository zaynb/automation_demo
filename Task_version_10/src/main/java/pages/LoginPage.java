package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(id="txtUsername")
	public WebElement Username ; 
	
	@FindBy(id="txtPassword")
	public WebElement Password ; 
	
	@FindBy(id="btnLogin")
	public WebElement Login ; 
	
 public void ClickOnUserNameField ()
 {
	 Username.click();
 }
 public void ClickPasswordField ()
 {
	 Password.click();
 }
 public void ClickOnLoginBtn ()
 {
	 Login.click();
 }
 
}
