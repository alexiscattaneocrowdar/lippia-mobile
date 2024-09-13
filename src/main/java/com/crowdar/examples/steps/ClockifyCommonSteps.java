package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockifyCommonService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ClockifyCommonSteps extends PageSteps {

    @When("I tap the '+' button to create a new dedication")
    @And("Save the changes")
    public void tapOnFloatingActionButton() {
        ClockifyCommonService.tapOnFloatingButton();
    }

}
