package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.ClockifyHomeService;
import cucumber.api.java.en.Then;

public class ClockifyHomeSteps extends PageSteps {

    @Then("The clockify home page is displayed")
    public void isHomePageVisible() {
        ClockifyHomeService.isViewLoaded();
    }

    @Then("The dedication '(.*)' is displayed")
    public void theDedicationIsDisplayed(String dedicacion) {
        ClockifyHomeService.isDedicationPresent(dedicacion);
    }

}
