package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Web_Appln {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities d= new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "shk");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
//		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "chrome.android.chrome");
//		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "chrome.google.android.apps.chrome.Main");
	    d.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, d);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}

}
