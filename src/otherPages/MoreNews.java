package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoreNews {
	static WebDriver driver;
	public MoreNews (WebDriver driver) {
		this.driver = driver;
	 }
	
	public static List<WebElement> moreNews() {
	    return driver.findElements(By.cssSelector("div.box td"));
    }
	
	private WebElement mailIconNews() {
		return driver.findElement(By.cssSelector("div.box h1. span.iconochive-email"));
	}
	
}