package com.ShopperStack_Test_Script;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_Register.Address_Form_Page;
import com.ShopperStack_Register.MyAddress_Page;
import com.ShopperStack_Register.MyProfile_Page;
import com.ShopperStack_genericutility.BaseTest;





public class verify_user_is_able_to_add_address_or_not_Test extends BaseTest{
	
		@Test
		public void addAddress() throws EncryptedDocumentException, IOException {
			homePage.getAccountSetting().click();
			homePage.getMyProfileBtn().click();
			
			MyProfile_Page myProfilePage=new MyProfile_Page(driver);
			myProfilePage.getMyAddressBtn().click();
			
			MyAddress_Page myAddressPage= new MyAddress_Page(driver);
			myAddressPage.getAddaddress().click();
			Address_Form_Page addressformpage = new Address_Form_Page(driver);
			addressformpage.getOfficeRBtn().click();
			addressformpage.getNameBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 0));
			addressformpage.getHouseBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 1));
			addressformpage.getStreetInfoBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 2));
			addressformpage.getLandmarkBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 3));
			
			addressformpage.getCountryBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 4));
			addressformpage.getStateBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 5));
			addressformpage.getCityBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 6));
			
			
			addressformpage.getPincodeBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 7));
			addressformpage.getPhoneNumberBtn().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 8));
			addressformpage.getAddAddressBtn().click();
			
			
		
		}

	}

