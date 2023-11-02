package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import LocatorsORConfig.LoginPage;

public class Testcases extends BaseClass {
	public WebDriver driver;
	
	//Create objects of all pages
	BaseClass base;
	LoginPage L1;
	
	@BeforeTest
	public void Aobjects() {
		base = new BaseClass();
		driver = base.initialize_driver();
		L1 = new LoginPage(driver);
	}
	@Test
	public void BLoginPage() {
		driver.get("https://app.modv.io/#/login");
		L1.SignIn();
		L1.Email();
		L1.password();
		L1.Login();
		L1.nightmode();
		L1.Title();
		L1.SunIcon();
		
	}
	


}
