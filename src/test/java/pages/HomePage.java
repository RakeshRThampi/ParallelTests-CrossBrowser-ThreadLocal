package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	By userNameBy = By.id("user-name");
	By passwordBy = By.id("password");
	By loginBy = By.id("login-button");
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		System.out.println("HomePage::HomePage() - Driver = " + driver);
	}

	public String getHomeUrl() {
		String title = driver.getCurrentUrl();
		return title;
	}

	public String loginStatndarUser(String user, String pass) {
		driver.findElement(userNameBy).clear();
		driver.findElement(passwordBy).clear();
		driver.findElement(userNameBy).sendKeys(user);
		driver.findElement(passwordBy).sendKeys(pass);
		driver.findElement(loginBy).click();
		String url = driver.getCurrentUrl();
		return url;
	}

}
