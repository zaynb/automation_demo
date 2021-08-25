package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;

public class TestBase {

	public static WebDriver driver;
	String driverPath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	LoginPage loginobject;
	String UserName = "Admin";
	String PassWord = "admin123";

	@BeforeSuite

	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		   loginobject = new LoginPage (driver);
		    loginobject.ClickOnUserNameField();
		    loginobject.Username.sendKeys(UserName);
		    loginobject.ClickPasswordField();
		    loginobject.Password.sendKeys(PassWord);
		    loginobject.ClickOnLoginBtn();



	}

	@AfterSuite

	public void Closedriver() {

	driver.close();

	} 

}
