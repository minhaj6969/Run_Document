package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	@Given("^user able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
		driver = getdriver();
		
	    
	   
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		
	    
	   
	}

	@When("^enter valid user name$")
	public void enter_valid_user_name() throws Throwable {
	    
	   
	}

	@When("^enter valid password$")
	public void enter_valid_password() throws Throwable {
	    
	   
	}

	@When("^click on submit in button$")
	public void click_on_submit_in_button() throws Throwable {
	    
	   
	}

	@Then("^user able to sign in successfully$")
	public void user_able_to_sign_in_successfully() throws Throwable {
	    
	   
	}

}
