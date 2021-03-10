package Appium;

import java.io.File;	

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
public AppiumDriverLocalService service;
	@BeforeSuite
	public void startappiumservice() {
		 service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
				 usingDriverExecutable
				 (new File("‪C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Users\\hp\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js")));
	    service.start();	
	    //ABC
	    //ABC_1
	}
	
	@AfterSuite
	public void closeappiumservice() {
		service.stop();
	}
}
