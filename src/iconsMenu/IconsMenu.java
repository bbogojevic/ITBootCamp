package iconsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IconsMenu {
	WebDriver driver;
	
	public IconsMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements
	
	private WebElement web_icon() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[1]/a/span[1]"));
	}
	
	private WebElement book_icon() {
		return driver.findElement(By.xpath("html body.navia.top.ia-module.bgEEE.tiles div#wrap div#navwrap1 div#navwrap2 div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main li.dropdown.dropdown-ia.pull-left a.navia-link.texts span.iconochive-texts"));
	}
	
	private WebElement movie_icon( ) {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[3]/a/span[1]"));
	}
	
	private WebElement audio_icon() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[4]/a/span[1]"));
	}
	
	private WebElement software_icon() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[5]/a/span[1]"));
	}
	
	private WebElement image_icon() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[6]/a"));
	}
	
	private WebElement logo_icon() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[7]/a/span[1]"));
	}
	
	private WebElement signIn_icon() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[10]/a"));
	}
	
	private WebElement upload_icon() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[1]/li[9]/a"));
	}
	
	//Actions
	
	public void clickOnWeb() {
		web_icon().click();
	}
	
	public void clickOnBook() {
		book_icon().click();
	}
	
	public void clickOnMovie() {
		movie_icon().click();
	}
	
	public void clickOnAudio() {
		audio_icon().click();
	}
	
	public void clickOnSoftware() {
		software_icon().click();
	}
	
	public void clickOnImage() {
		image_icon().click();
	}
	
	public void clickOnLogo() {
		logo_icon().click();
	}
	
	public void clickOnSignIn() {
		signIn_icon().click();
	}
	
	public void clickOnUpload() {
		upload_icon().click();
	}
}
