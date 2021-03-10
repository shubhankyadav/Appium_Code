package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolling {
	
	@Test
	public void loping() throws MalformedURLException {
		DesiredCapabilities d= new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "shk");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
	    
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, d);
		
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
         scroll(driver,0.5,0.8,0.5,0.2);
//		  driver.findElement(By.xpath("(//android.widget.LinearLayout[@index='1'])[10]")).click();
		  driver.findElement(By.xpath("(//android.widget.LinearLayout[@index='1'])[10]")).click();;
          driver.findElement(By.xpath("(//android.widget.RelativeLayout[@index='1'])[1]")).click();;
        
          scroll(driver,0.5,0.8,0.5,0.2);
		  
		
	}
	
	public void scroll(AndroidDriver<WebElement> driver,double start_x,double start_y,double end_x,double end_y) {
		 Dimension s = driver.manage().window().getSize();
			int h = s.getHeight();
			int w=s.getWidth();
			int x=w/2;
			int startx= (int)(w*start_x);
			int endx= (int)(w*end_x);
			int starty=(int)(h*start_y);
			int endy=(int)(h*end_y);

	         TouchAction t=new TouchAction(driver);
	         
	         t.press(PointOption.point(startx,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 		.moveTo(PointOption.point(endx,endy)).release().perform();
		 
			
	}}
	


