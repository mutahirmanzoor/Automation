package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemosteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project Path is:" + projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.getCurrentUrl().equals("https://practicetestautomation.com/logged-in-successfully/");

		driver.close();
		driver.quit();
	}

}
