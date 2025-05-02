package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomeTest extends TestBase {
	private HomePage home;

	@Test(priority = 1)
	public void verifyTitle() {
		home = new HomePage(threadLocalDriver.get());
		Assert.assertEquals(home.getHomeUrl(), "https://www.saucedemo.com/v1/");
	}

	@Test(priority = 2)
	public void verifyStandardLogin() {
		String stdUser = "standard_user";
		String stdPass = "secret_sauce";
		home.loginStatndarUser(stdUser, stdPass);
		Assert.assertEquals(home.getHomeUrl(), "https://www.saucedemo.com/v1/inventory.html");
	}
}
