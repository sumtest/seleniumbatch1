package utils;

import java.util.HashMap;

import object_rep.Obj_SearchFlights;

import org.openqa.selenium.WebDriver;

public class CommonUtils {

	public static void click(WebDriver driver, HashMap<String, String> data) {
		if (data.get("triptype").equals("Round trip")) {
			driver.findElement(Obj_SearchFlights.radio_roundTrip).click();
		} else if (data.get("triptype").equals("One way")) {
			driver.findElement(Obj_SearchFlights.radio_oneWayTrip).click();
		}

	}

	public static void type(WebDriver driver, HashMap<String, String> data) {
		driver.findElement(Obj_SearchFlights.txt_fromLoc).sendKeys(
				data.get("fromloc"));

	}
}
