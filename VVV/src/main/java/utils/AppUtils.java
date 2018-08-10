package utils;

import org.openqa.selenium.WebDriver;

public class AppUtils {

	public static void invokeApp(WebDriver driver, String url) {	
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
