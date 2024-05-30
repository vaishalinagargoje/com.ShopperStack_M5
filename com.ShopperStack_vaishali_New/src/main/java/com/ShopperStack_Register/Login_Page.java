package com.ShopperStack_Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	

		public Login_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="Email")
		private WebElement EmailBtn;

		@FindBy(id="Password")
		private WebElement PasswordBtn;

		@FindBy(id="Login")
		private WebElement LoginBtn;
	

		public WebElement getEmailBtn() {
			return EmailBtn;
		}

		public WebElement getPasswordBtn() {
			return PasswordBtn;
		}

		public WebElement getLoginBtn() {
			return LoginBtn;
		}

	
}
