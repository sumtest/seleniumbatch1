package tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import utils.AppUtils;
import utils.ConstantsUtils;
import utils.ExcelUtils;

import components.SearchFlights;

public class TestSuite1 {
	public String env;
	public String browser;
	public String url;
	public WebDriver driver;
	public HashMap<String, String> data;

	
	public void test1() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(ConstantsUtils.CONFIG_PATH)));
		env = prop.getProperty("env");
		browser = prop.getProperty("browser");

		switch (browser) {
	dfahjdh
h
dhj
dtf
h
dtgh
rtgf
h
tfg
htf
gh
	case "chrome":
			System.setProperty("webdriver.chrome.driver",
					ConstantsUtils.CHROME_PATH);
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", ConstantsUtils.IE_PATH);
			driver = new InternetExplorerDriver();

			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver", ConstantsUtils.FF_PATH);
			driver = new FirefoxDriver();

			break;

		default:

			System.out.println("enter valid browser");
			break;
		}
		url=prop.getProperty(env+"_url");	
		AppUtils.invokeApp(driver,url);
		data=new HashMap<String,String>();
		data=ExcelUtils.readTestData(data);
		
		SearchFlights.selectTripType(driver,data);
		SearchFlights.enterFromLoc(driver,data);
		
		
		
		
		
		
		
		
		
		
		

	}

}
