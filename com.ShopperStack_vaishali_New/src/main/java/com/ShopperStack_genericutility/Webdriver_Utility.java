package com.ShopperStack_genericutility;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility {
	
		Java_Utility ju= new Java_Utility();
		
		public void selectByValue(WebElement element,String value) {
			Select sel = new Select(element);
			sel.selectByValue(value);
		}
		
		public void selectByVisibleText(WebElement element,String text) {
			Select sel1 = new Select(element);
			sel1.selectByVisibleText(text);
		}
		
		public void selectByIndex(WebElement element,int index) {
			Select sel2 = new Select(element);
			sel2.selectByIndex(index);
		}
		
		
		public void deselectByValue(WebElement element,String value) {
			Select sel = new Select(element);
			sel.selectByValue(value);
		}
		
		public void deselectByVisibleText(WebElement element,String text) {
			Select sel1 = new Select(element);
			sel1.selectByVisibleText(text);
		}
		
		public void deselectByIndex(WebElement element,int index) {
			Select sel2 = new Select(element);
			sel2.selectByIndex(index);
		}
		
		
		public void actionMoveToElement(WebDriver driver,WebElement element) {
			Actions act=new Actions(driver);
			act.moveToElement(element).perform();
			
		}
		
		public void getScreenShotOfCompleteWebPage(WebDriver driver) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(FrameWorkConstants.screenshotPath+ju.localDateTime() +".png");
			
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		public void getScreenShotOfWebElement(WebElement element) throws IOException {
			File temp = element.getScreenshotAs(OutputType.FILE);
			File dest = new File(FrameWorkConstants.screenshotPath+ju.localDateTime() +".png");
			FileHandler.copy(temp, dest);
		}

	
}
