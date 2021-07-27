package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	public WebDriver driver;

	@Given("user should open the browser and eneter the url of the application")
	public void user_should_open_the_browser_and_eneter_the_url_of_the_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@Given("clcik on login button")
	public void clcik_on_login_button() {
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
	}

	@When("enter the valid username")
	public void enter_the_valid_username() {
		driver.findElement(By.id("email")).sendKeys("user");
	}

	@When("eneter the valid password")
	public void eneter_the_valid_password() {
		driver.findElement(By.id("password")).sendKeys("user");

	}

	@When("click on login buttton")
	public void click_on_login_buttton() {
		driver.findElement(By.id("last")).click();

	}

	@When("print the titlte and URL of the application")
	public void print_the_titlte_and_url_of_the_application() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

	@Then("user should be successfully login into the application")
	public void user_should_be_successfully_login_into_the_application() {
		System.out.println("user is successfully login to the homepage of the application");
	driver.close();
	}

}
