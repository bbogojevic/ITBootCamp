package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Projects {
	static WebDriver driver;
	public Projects (WebDriver driver) {
		this.driver = driver;
	}
	
//Elements
	
	public static List<WebElement> projectsText() {
        return driver.findElements(By.cssSelector("div.col-md-9"));
    }
	
	//Actions
			
	public int projectsTextSize() {
    	return projectsText().size();
    }
	
}
