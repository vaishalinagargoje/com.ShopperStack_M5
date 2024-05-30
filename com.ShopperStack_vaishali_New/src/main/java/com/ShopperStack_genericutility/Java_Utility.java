package com.ShopperStack_genericutility;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
	
public class Java_Utility {

	public int generateRandomNumber(){
		Random r = new Random();
		int value = r.nextInt(1000);
		return value;
		
	}
	public void localDate() {
		LocalDate.now().toString().replace("-", "");
	}
	
	public String localDateTime() {
		return LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
		
	}

}

