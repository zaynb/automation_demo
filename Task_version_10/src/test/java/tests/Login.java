package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.PageBase;


public class Login extends TestBase{

	PageBase pagebaseobj;
	LoginPage loginobject;


	@Test (priority=1)
	public void UserCanLogin() 
	{
	    String URL = driver.getCurrentUrl();
	    Assert.assertEquals(URL,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	}
	

	}