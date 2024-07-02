package definitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_step {
	WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		  driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
	}

	@Given("enter the URL")
	public void enter_the_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://the-internet.herokuapp.com/login");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("enter username")
	public void enter_username() {
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("username")).sendKeys("tomsmith"); 
  }

	@When("enter password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!"); 
	}

	@Then("click on login")
	public void click_on_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i[class=\"fa fa-2x fa-sign-in\"]")).click();
		
	}
}
