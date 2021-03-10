package generics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_WebElements_Methods {

	public String get_the_text_of_element(WebElement ele) {
		String text = ele.getText();
		return text;
	}
	
	public String get_the_attribute_of_element(WebElement ele,String att) {
		 String tooltip = ele.getAttribute(att);
		 return tooltip;
	}
	
	public boolean element_is_displayed(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		return displayed;
	}
	
	public boolean element_is_enabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		return enabled;
	}
	public boolean element_is_seleected(WebElement ele) {
		boolean selected = ele.isSelected();
		return selected;
	}
	
	public Point get_location(WebElement ele) {
		Point loc = ele.getLocation();
		return loc;
	}
	
	public Dimension get_size(WebElement ele) {
		Dimension size = ele.getSize();
		return size;
	}
	
	
}
