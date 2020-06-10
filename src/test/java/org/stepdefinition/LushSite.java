package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class LushSite {

	static WebDriver driver;

	@Given("user launch the jabong login page")
	public void user_launch_the_jabong_login_page() {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","D:\\Deva files\\Workspaces\\Selenium\\CucumberDay2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lushusa.com/");
	}

	@When("user has to search the product {string}")
	public void user_has_to_search_the_product(String find) {
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(find,Keys.ENTER);
	}

	@Then("user verify the valid credentials of the product")
	public void user_verify_the_valid_credentials_of_the_product() {
		System.out.println("****Program success****");
		driver.quit();
	}

}
