package tests;
import org.testng.annotations.Test;

import pages.AddUserPage;
import pages.HomePage;

public class AddUser extends TestBase{
	
    HomePage pagehomeobj;
    AddUserPage pageuserobj;
	String EmpName = "David Morris";
	String Username="zaynabu";
	String PassWord = "zadmin123";
	String ConfirmPassWord = "zadmin123";

	@Test (priority=1)
	public void Adduser() 
	{
	pagehomeobj = new HomePage (driver);
	pagehomeobj.ClickOnAdmin();
	pagehomeobj.ClickOnAddbtn();
	
	pageuserobj = new AddUserPage (driver);
	pageuserobj.ClickOnEmpNameField();
	pageuserobj.employeeName.sendKeys(EmpName);
	
	pageuserobj.ClickUsernameField();
	pageuserobj.userName.sendKeys(Username);
	
	pageuserobj.ClickOnPasswordField();
	pageuserobj.password.sendKeys(PassWord);
	
	pageuserobj.ClickOnConfirmPasswordField();
	pageuserobj.Confirmpassword.sendKeys(ConfirmPassWord);
	
	pageuserobj.ClickOnSavebtn();
	
		
	}
	
	}