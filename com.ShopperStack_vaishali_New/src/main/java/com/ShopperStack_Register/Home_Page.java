package com.ShopperStack_Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	

		public Home_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular css-1c55906']")
		private WebElement AccountSettingBtn;

		@FindBy(xpath="//li[text()='My Profile']")
		private WebElement MyProfileBtn;
		
		@FindBy(xpath="//li[text()='Logout'")
		private WebElement logoutBtn;
		
		public WebElement getAccountSetting() {
			return AccountSettingBtn;
			
		}
		public WebElement getMyProfileBtn() {
			return MyProfileBtn;
			
		}
		public WebElement getlogoutBtn() {
			return logoutBtn;
			
	}
	
}
