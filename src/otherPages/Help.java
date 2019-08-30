package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Help {
	static WebDriver driver;
	 public Help (WebDriver driver) {
		this.driver = driver;
	 }
	
//Elements
	private WebElement helpSearch() {
		return driver.findElement(By.cssSelector("input#query"));
	}
	
	public static List<WebElement> helpButtons() {
	    return driver.findElements(By.cssSelector("ul.blocks-list li.blocks-item"));
    }
				
	public void clickOnButtons() {
		for (int i = 0; i < helpButtons().size(); i++) {
			helpButtons().get(i).click();
		}
	
	}
}
