package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	public ChromeDriver driver;

	@Given("Open the Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("Max the Browser")
	public void maxBrowser(){
		driver.manage().window().maximize();
	}
	
	@And("Set the Timeout")
	public void setTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("Navigate to URL")
	public void navigateToURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@And("Enter the Username as (.*)")
	public void enterUsername(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}
	
	@And("Enter the Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When("Click on Login Button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Verify Login is Successful")
	public void verifyLogin() {
		System.out.println("Login Success");
	}
	
	@Then("Verify Login is Failed")
	public void verifyLoginFailed() {
		System.out.println("Login Failed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	













}
