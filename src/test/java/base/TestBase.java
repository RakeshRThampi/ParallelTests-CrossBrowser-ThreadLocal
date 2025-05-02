package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {
	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest
	@Parameters({ "browser", "url" }) // Parameters from testng.xml
	public void setup(String browser, String url) {
		WebDriver driver = BrowserManager.setupBrowser(browser);
		threadLocalDriver.set(driver); // Bind driver to current thread
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}

	public static WebDriver getDriver() {
		return threadLocalDriver.get(); // Retrieve thread-specific driver
	}

	@AfterTest
	public void tearDown() {
		getDriver().quit();
		threadLocalDriver.remove(); // Prevent memory leaks
	}
}
