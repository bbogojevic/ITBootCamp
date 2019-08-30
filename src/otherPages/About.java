package otherPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About {
	static WebDriver driver;
    
    public About(WebDriver driver) {
        this.driver = driver;
    }
   // Elements
    
    public static List<WebElement> newsObjects() {
        return driver.findElements(By.cssSelector("div.box"));
    }
   
    private WebElement moreNewsLink() {
    	return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[1]/div[2]/h1/a/font"));
    }
    	
    
    //Actions
    
    public int newsObjectsSize() {
    	return newsObjects().size();
    }
    
    public void clickOnMoreNews() {
    	moreNewsLink().click();
    }
    
    

}
