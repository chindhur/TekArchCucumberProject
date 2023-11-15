package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	
	@Given("User lands on login page")
	public void user_lands_on_login_page() {
		 driver=new ChromeDriver();
		 driver.get("https://login.salesforce.com");
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("User enters valid username {string} and valid password {string}")
	public void user_enters_valid_username_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("chin@abc.com");
		driver.findElement(By.id("password")).sendKeys("K@malesh82");
//	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Login")).click();
	//    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see home page")
	public void user_should_see_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle().contains("Home"),"Home page should be visible");
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
		driver.findElement(By.id("username")).sendKeys("chin@abc.com");
		driver.findElement(By.id("password")).sendKeys("123455");
	
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("User should see error message")
	public void user_should_see_error_message() {
		Assert.assertEquals(driver.findElement(By.id("error")).getText(),"Please check your username and password. If you still can't log in, contact your Salesforce administrator.\r\n" );
	}



}
