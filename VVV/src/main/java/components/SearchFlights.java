package components;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import utils.CommonUtils;

public class SearchFlights {

	public static void selectTripType(WebDriver driver,
			HashMap<String, String> data) {
		CommonUtils.click(driver, data);
	}

	public static void enterFromLoc(WebDriver driver,
			HashMap<String, String> data) {
		CommonUtils.type(driver, data);

	}

}
