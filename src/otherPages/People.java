package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class People {
	static WebDriver driver;
	 public People (WebDriver driver) {
		this.driver = driver;
	 }
	 
	 public static List<WebElement> staffList() {
		    return driver.findElements(By.cssSelector("div.bio div"));
	    }
}
