package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockifyAddEntryService;
import com.crowdar.examples.services.ClockifyHomeService;
import com.crowdar.examples.services.ClockifySetTimeService;
import cucumber.api.java.en.And;

import java.util.UUID;

public class ClockifyAddEntrySteps extends PageSteps {

    @And("I define the start time (.*):(.*) and the end time (.*):(.*)")
    public void iDefineTheStartTimeAndTheEndTime(String startHs, String startMin, String endHS, String endMin) {
        ClockifyAddEntryService.tapOnTimeSection();
        ClockifySetTimeService.setTimeDedication(startHs,startMin,endHS,endMin);
    }

    @And("I sets the description '(.*)'")
    public void iSetsTheDescription(String description) {
        ClockifyAddEntryService.tapOnDescriptionSection();
        ClockifyAddEntryService.setDescription(description);
    }

}
