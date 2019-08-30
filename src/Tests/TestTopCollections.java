package Tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import iconsMenu.DropDownMenu;
import iconsMenu.IconsMenu;
import iconsMenu.NavMenu;
import iconsMenu.TopCollections;

public class TestTopCollections extends TopCollections{

	
		public TestTopCollections(WebDriver driver) {
		super(driver);		
	}

		TopCollections topColl;
		
		@BeforeTest
		
		public void setup() {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();			
				
		}
		
		@Test
		
		 public void objectSize() {
	    	if((objects().size()) <= 20) {
	    		System.out.println("Top Collections have more than 20 elements ");
	    	}
	    	else {
	    		System.out.println("Top Collections doesn't have more than 20 elements ");
	    	}
	    }
	    
	    
	     public void testForTopCollection() throws Exception {
	        
	    	List<WebElement> results = new ArrayList<WebElement>();

			results = driver.findElements(By.cssSelector("div.C234"));
	    	for (WebElement webElement:results) {
				System.out.println(webElement.getText());
				if (webElement.getText().matches("items")) {
					System.out.println("******* Pronasao sam trazeni text ****");
				}
	}

}
}
