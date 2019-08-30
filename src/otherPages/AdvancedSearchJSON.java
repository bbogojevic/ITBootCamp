package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchJSON {
	
	static WebDriver driver;
	public AdvancedSearchJSON (WebDriver driver) {
		this.driver = driver;
	}
	
	public static List<WebElement>anyFieldsToReturnDropDown() {
	    return driver.findElements(By.name("fl[]"));
    }
	
}
