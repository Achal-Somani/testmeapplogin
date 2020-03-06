package org.logintestMe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class login {
	WebDriver driver;
//	@Given("Login details")
//	public void login_details() throws Throwable
//	{
//		  System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP2C.05.15\\Desktop\\drivers\\chromedriver.exe");
//		  driver=new ChromeDriver();
//			 driver.manage().window().maximize();
//			 driver.get("http://localhost:8083/TestMeApp2.2/");
//			 throw new cucumber.api.PendingException();
//			
//	}
	@Given("Login details")
	public void login_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP2C.05.15\\Desktop\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://localhost:8083/TestMeApp2.2/");
	   // throw new cucumber.api.PendingException();
	}
//	@When("enter {string} and {string}")                            
//	public void enter_and(String username, String password) throws Throwable {      
//	  new object(driver);                                   
//	  object.signinbtn.click();
//	  object.usernamelogin.sendKeys(username);
//	  object.passwordlogin.sendKeys(password);
//	  object.loginbtn.click();
//	  throw new cucumber.api.PendingException();
//    }
	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		  new object(driver);                                   
		  object.signinbtn.click();
		  object.usernamelogin.sendKeys(string);
		  object.passwordlogin.sendKeys(string2);
		  object.loginbtn.click();

	}
//	@Then("logged in successfully")
//	public void logged_in_successfully() {
//    	  System.out.println("logged in");
//    	  throw new cucumber.api.PendingException();
//      }
	@Then("logged in successfully")
	public void logged_in_successfully() throws Throwable{
		System.out.println("logged in");

	}

}
