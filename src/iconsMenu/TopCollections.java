package iconsMenu;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopCollections {

	protected static WebDriver driver;
	
	public TopCollections(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements	
	
	public static List<WebElement> objects() {
        return driver.findElements(By.cssSelector("div.C234"));
    }
	
	//internet archive floater
    public static WebElement searchBar() {
        return driver.findElement(By.cssSelector("input.form-control:nth-child(2)"));
    }
    public static List<WebElement> linksButtons() {
        return driver.findElements(By.cssSelector("div.mt-big"));
    }
    public static WebElement goButton() {
        return driver.findElement(By.cssSelector("button.btn"));
    }
    public static WebElement searchLink() {
        return driver.findElement(By.cssSelector(".search-options__advanced-search-link"));
    }
    public static WebElement seeMore() {
        return driver.findElement(By.cssSelector("div.pull-right a"));
    }
    
    private static WebElement textOnRight() {
		return driver.findElement(By.cssSelector("div.row preamble div.col-sm-3 hero-right"));
	}
    
    private static WebElement seeMoreLink() {
    	return driver.findElement(By.cssSelector("div.pull-right a.stealth"));
    }
    
    //Actions     	
    	
    	public void clickOnRightText() {
    		textOnRight().click();
    	}
    	
    	public void clickOnSeeMoreLink() {
    		seeMoreLink().click();
    	}
      
   
}
