package com.ShopperStack_Test_Script;
import org.testng.annotations.Test;


import com.ShopperStack_Register.MyAddress_Page;
import com.ShopperStack_Register.MyProfile_Page;
import com.ShopperStack_genericutility.BaseTest;



public class verify_user_is_able_to_delete_address_or_not_Test extends BaseTest {
		@Test
		public void deleteAddress() throws InterruptedException {
			homePage.getAccountSetting().click();
			homePage.getMyProfileBtn().click();
			
			
			MyProfile_Page myprofilepage = new MyProfile_Page(driver);
			myprofilepage.getMyAddressBtn().click();
			
			MyAddress_Page myaddresspage = new MyAddress_Page(driver);
			Thread.sleep(2000);
			myaddresspage.getDeleteadress().click();
			Thread.sleep(2000);
			myaddresspage.getYesbtn().click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
			
			
	}
		}

