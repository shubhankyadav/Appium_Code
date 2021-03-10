package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Teating {

	public static void main(String[] args) throws MalformedURLException {
	
		
		DesiredCapabilities d= new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "shk");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7");
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"192.168.0.102:5555");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	    
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, d);
	 driver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
	
	
	}
 
}
