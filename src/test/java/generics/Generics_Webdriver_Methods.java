package generics;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generics_Webdriver_Methods {

	public String get_the_title( WebDriver driver) {
		String title = driver.getTitle();
		System.out.println(title);
		return title; 
	}

	public String get_the_url(WebDriver driver) {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	public String window_handle(WebDriver driver) {
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		return handle;

	}
	
	public void window_handles(WebDriver driver) {
		Set<String> handles = driver.getWindowHandles();
		
	}
	


}
