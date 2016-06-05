package cucumber.features;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class StepDefinations {
	
	WebDriver driver = null;
	
	@Given("^I navigate to the facebook website$")
	public void i_navigate_to_the_facebook_website() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I enter the username$")
	public void i_enter_the_username() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("deb83nath@gmail.com");
	    
	}

	@And("^I enter the password$")
	public void i_enter_the_password() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("bikash_bjit2015");
		driver.findElement(By.id("u_0_m")).click();
	    
	}

	@Then("^redirct to home page$")
	public void redirct_to_home_page() throws Throwable {
		Assert.assertTrue("Not on Login page",
				driver.getTitle().equals("home_page"));
	    
	}

}
