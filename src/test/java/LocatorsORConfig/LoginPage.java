package LocatorsORConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.qameta.allure.Step;

public class LoginPage {
	static WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		}
	//Elements
	 By SignIn = By.xpath("//button[@class=\"btn btn-primary btn-block\"]");
	 By email = By.xpath("//input[@id=\"1-email\"]");
	 By password = By.xpath("//input[@id=\"1-password\"]");
	 By Login = By.xpath("//button[@id=\"1-submit\"]");
	 By nightmode = By.xpath("//div[@class=\"content-header-right text-md-right d-none d-xl-block col\"]//li[@class=\"nav-item\"]//a");
	 By Title = By.xpath("//div[@class=\"content-header-left mb-2 col-8 col\"]//h2[text()=\"My Own Document Vault\"]");
	 By Sun = By.xpath("//div[@class=\"content-header-right text-md-right d-none d-xl-block col\"]//*[@class=\"feather feather-sun\"]");
	 
	 @Step("Click On SignIn")
	 public void SignIn() {
		 driver.findElement(SignIn).click();
	 }
	 
	 @Step("Enter Email")
	 public void Email() {
		 driver.findElement(email).sendKeys("amir.sohil@fleekitsolutions.com");
	 }
	 @Step ("Enter password")
	 public void password() {
		 driver.findElement(password).sendKeys("Amir@786");
	 }
	 @Step ("Click On Login Button")
	 public void Login() {
		 driver.findElement(Login).click();
	 }
	 @Step ("Night mode")
	 public void nightmode() {
		 driver.findElement(nightmode).click();
	 }
	 @Step ("Verify Title")
	 public void Title() {
		 String str = driver.findElement(Title).getText();
		 String mtr = "My Own Document Vault";
		 Assert.assertEquals(str, mtr);
		 System.out.println("Title id verified");
	 }
	 @Step ("Verify Sun Icon")
	 public void SunIcon() {
		 WebElement elk =driver.findElement(Sun);
		 if(elk.isDisplayed()) {
			 System.out.println("Application is in NightMode");
		 }
		 else {
			 System.out.println("Day Mode");
		 }
	 }
}
