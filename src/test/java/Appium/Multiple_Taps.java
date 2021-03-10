package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Multiple_Taps {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities d= new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "shk");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
	    
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, d);
		

		 
        Dimension s = driver.manage().window().getSize();
		int h = s.getHeight();
		int w=s.getWidth();
		int x=w/2;
		int starty=(int)(h*0.8);
		int endy=(int)(h*0.1);
		
		
 		
         
         TouchAction t=new TouchAction(driver);
         
         t.press(PointOption.point(x,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
 		.moveTo(PointOption.point(x,endy)).release().perform();
//         t.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele1))).perform();

//         t.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele2))).perform();
	
         Thread.sleep(3000);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//android.widget.LinearLayout[@index='1'])[10]")).click();;
          driver.findElement(By.xpath("(//android.widget.RelativeLayout[@index='1'])[1]")).click();;
         WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='Build number']"));
         Thread.sleep(2000);
        
         
          s = driver.manage().window().getSize();  
          h = s.getHeight();
 		 w=s.getWidth();
 		 x=w/2;
 		 starty=(int)(h*0.6);
 		 endy=(int)(h*0.2);
 		t=new TouchAction(driver);
 		 t.press(PointOption.point(x,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
  		.moveTo(PointOption.point(x,endy)).release().perform();
         
     
         
         
         
         t.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele)).withTapsCount(7)).perform();	
	}

}
