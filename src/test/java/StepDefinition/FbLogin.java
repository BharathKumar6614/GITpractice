package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	
	WebDriver Driver;
	
	@Given("User Launches the Fb Url")
	public void user_launches_the_fb_url() {
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/login/");
	//	Driver.manage().window().maximize();
			    
	}

	@When("User Enters Username")
	public void user_enters_username() {
		Driver.findElement(By.id("email")).sendKeys("Bharath123@gmail.com");
	    
	}

	@When("User Enters Password")
	public void user_enters_password() {
		Driver.findElement(By.id("pass")).sendKeys("India@123");
	    
	}

	@When("User Clicks Login Button")
	public void user_clicks_login_button() {
		Driver.findElement(By.id("loginbutton")).click();
	    
	}

	@Then("User should be login sucessfully")
	public void user_should_be_login_sucessfully() throws InterruptedException {
		Thread.sleep(3000);
		Driver.close();
	    
	}



}
