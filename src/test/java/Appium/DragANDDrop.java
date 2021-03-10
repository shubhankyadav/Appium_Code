package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class DragANDDrop {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities d= new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "shk");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
	    
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, d);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
         driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
         WebElement ele = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
         WebElement ele1 = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
         
         
         TouchAction t=new TouchAction(driver);
    	 t.longPress(LongPressOptions.longPressOptions()
    			 .withElement(ElementOption.element(ele))).
    	moveTo(ElementOption.element(ele1)).
    	 release().perform();
    	 
	}

}
