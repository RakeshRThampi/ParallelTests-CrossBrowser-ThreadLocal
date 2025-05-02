package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	public static WebDriver setupBrowser(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			/*
			 * EdgeOptions options = new EdgeOptions(); options.addArguments("--headless");
			 * driver = new EdgeDriver(options);
			 */
			driver = new EdgeDriver();
			System.out.println("BrowserManager::setupBrowser() - Edge initialized");
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			/*
			 * FirefoxOptions options = new FirefoxOptions();
			 * options.addArguments("--headless"); driver = new FirefoxDriver(options);
			 */
			driver = new FirefoxDriver();
			System.out.println("BrowserManager::setupBrowser() - Firefox initialized");
		} else if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--headless"); driver = new ChromeDriver(options);
			 */
			driver = new ChromeDriver();
			System.out.println("BrowserManager::setupBrowser() - Chrome initialized");
		}
		return driver;
	}
}