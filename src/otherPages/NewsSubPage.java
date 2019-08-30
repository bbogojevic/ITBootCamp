package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsSubPage {
	static WebDriver driver;
	public NewsSubPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public static List<WebElement> newsFeed() {
	    return driver.findElements(By.cssSelector("div.box well well-sm"));
    }
}
