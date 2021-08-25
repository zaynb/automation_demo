package tests;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.AddUserPage;
import pages.HomePage;

public class NavigatetoUsers extends TestBase{
	
    HomePage pagehomeobj;
    AddUserPage pageuserobj;
	

	@Test (priority=1)
	public void Naviagetosuses() 
	{
		
	pagehomeobj = new HomePage (driver);
	Actions actions = new Actions(driver);
	actions.moveToElement(pagehomeobj.AdminLink).perform();
	actions.moveToElement(pagehomeobj.UserMgt).perform();
	pagehomeobj.ViewUsers();
	
		
	}
	
	}