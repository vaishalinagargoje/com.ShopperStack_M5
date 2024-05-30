package com.ShopperStack_Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAddress_Page {
		public MyAddress_Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
			
		}
		@FindBy(xpath="//button[text()='Add Address']")
		private WebElement addaddress ;
		
		@FindBy(xpath="(//span[contains(@class,'MuiButton')])[2]")
		private WebElement deleteadress;
		
		@FindBy(xpath="(//button[@type='button'])[3]")
		private WebElement UpdateAddressBtn;

		@FindBy(xpath="(//button[text()='Yes'])[1]")
		private WebElement yesbtn;
		
		public WebElement getDeleteadress() {
			return deleteadress;
		}

		public WebElement getYesbtn() {
			return yesbtn;
		}

		public WebElement getAddaddress() {
			return addaddress;
		
		
		
		}
		
		public WebElement getUpdateAddressBtn() {
			return UpdateAddressBtn;
		
		}
	
}
