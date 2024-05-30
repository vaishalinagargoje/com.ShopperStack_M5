package com.ShopperStack_Test_Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_Register.EditAddress_Page;
import com.ShopperStack_Register.MyAddress_Page;
import com.ShopperStack_Register.MyProfile_Page;
import com.ShopperStack_genericutility.BaseTest;

public class verify_user_is_able_to_update_address_or_not extends BaseTest {
	@Test
	public void updateAddress() throws InterruptedException, AWTException, EncryptedDocumentException, IOException{
		homePage.getAccountSetting().click();
		homePage.getMyProfileBtn().click();
		
		
		MyProfile_Page myprofilepage = new MyProfile_Page(driver);
		myprofilepage.getMyAddressBtn().click();
		MyAddress_Page myaddresspage = new MyAddress_Page(driver);
		Thread.sleep(2000);
		myaddresspage.getUpdateAddressBtn().click();

		
		
		
		EditAddress_Page editAddress= new EditAddress_Page(driver);
		Robot rorbot=new Robot();
		
		editAddress.getNameTf().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		rorbot.keyRelease(KeyEvent.VK_DELETE);
	
		editAddress.getNameTf().sendKeys("sushama");
		Thread.sleep(2000);
		
		editAddress.getHouseTf().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		rorbot.keyRelease(KeyEvent.VK_DELETE);
		editAddress.getHouseTf().sendKeys("krupa house");
		Thread.sleep(2000);
		
		
		
		editAddress.getUpdateAddress().click();
	}
}