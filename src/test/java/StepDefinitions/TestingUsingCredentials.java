package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TestingUsingCredentials {
	
	WebDriver driver = null;
	String projectPath=System.getProperty("user.dir");

	@Given("user is on the browser")
	public void user_is_on_the_browser() {
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@And("user is navigated to the desired website")
	public void user_is_navigated_to_the_desired_website() {
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_credentials(String username, String password) {
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@And("user clicks on Sign In")
	public void user_clicks_on_sign_in() {
	    driver.findElement(By.xpath("//button[@id='login']")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.close();
	   driver.quit();
	}	
	
	
	
}
