package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Long_press extends BaseTest {

	@Test
	public void DEMO() throws MalformedURLException {
		DesiredCapabilities d= new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "shk");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9 ");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
	    
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, d);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
	 driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
	 WebElement ele = driver.findElement(By.xpath("	\r\n"
	 		+ "//android.widget.TextView[@text='People Names']"));
	
	 TouchAction t=new TouchAction(driver);
	 t.longPress(LongPressOptions.longPressOptions()
			 .withElement(ElementOption.element(ele))).
	 waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).
	 release().perform();
	 
	
	}

	}


