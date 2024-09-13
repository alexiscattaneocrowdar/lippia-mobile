package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.crowdar.examples.services.ClockifyLoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClockifyLoginSteps extends PageSteps {

    @Given("The app Clockify is loaded correctly")
    @Then("Clockify login is displayed")
    public void isLoginPageVisible() {
        ClockifyLoginService.isViewLoaded();
    }

    @When("The user logs in Clockify with existing user")
    public void doLoginProcess() {
        ClockifyLoginService.doLogin(PropertyManager.getProperty("email"), PropertyManager.getProperty("password"));
    }

}
