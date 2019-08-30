package iconsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavMenu {
	
		WebDriver driver;
		
		public NavMenu(WebDriver driver) {
			this.driver = driver;
		}
		
private WebElement about() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[1]/a"));
}

private WebElement contact() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[2]/a"));
}

private WebElement blog() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[3]/a"));
}

private WebElement projects() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[4]/a"));
}

private WebElement help() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[4]/a"));
}

private WebElement donate() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[6]/a"));
}

private WebElement jobs() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[7]/a"));
}

private WebElement volunteer() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[8]/a"));
}

private WebElement people() {
	return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/ul[2]/li[9]/a"));
}

private WebElement searchForm() {
	return driver.findElement(By.cssSelector("input# search-bar-2"));
}

private WebElement searchFormButton() {
	return driver.findElement(By.cssSelector("input# search-bar-2"));
}


//Actions

public void clickOnAbout() {
	about().click();
}

public void clickOnContact() {
	contact().click();
}

public void clickOnBlog() {
	blog().click();
}

public void clickOnProjects() {
	projects().click();
}

public void clickOnHelp() {
	help().click();
}

public void clickOnDonate() {
	donate().click();
}

public void clickOnJobs() {
	jobs().click();
}

public void clickOnVolunteer() {
	volunteer().click();
}

public void clickOnPeople() {
	people().click();
}

public void sendTexttoSearch() {
	searchForm().sendKeys("");
}

public void searchFormButtonClick() {
	searchFormButton().click();
}



}
