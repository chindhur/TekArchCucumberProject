package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AccountsSteps {
	
	@Before("@smoke")
	public void setup() {
		System.out.println("hello java");
		
	}

	@After ("smoke")
	public void teardown() {
		System.out.println("Bye java");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}



}
