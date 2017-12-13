package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	

@Given("^Open Firefox and start application$")
public void open_Firefox_and_start_application() throws Throwable {
  driver=new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://www.fb.com/");
  
}

@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
public void i_enter_valid_username_and_valid_password(String uname, String pass)  throws Throwable {
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pass);
     
   
	 
}

@Then("^User should be able to login successfully$")
public void user_should_be_able_to_login_successfully() throws Throwable {
     
	driver.findElement(By.id("loginbutton")).click();
	
}
@Then("^Application closed$")
public void Application_closed() {
	driver.close();
}

}
