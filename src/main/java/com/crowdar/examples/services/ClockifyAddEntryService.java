package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyAddEntryConstants;
import com.crowdar.examples.constants.ClockifyLoginConstants;
import org.testng.Assert;

public class ClockifyAddEntryService {

    public static void tapOnTimeSection(){
        MobileActionManager.waitVisibility(ClockifyAddEntryConstants.ADD_ENTRY_TITLE_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyAddEntryConstants.START_END_TIME_LAYOUT_LOCATOR), ClockifyAddEntryConstants.VIEW_NOT_DISPLAYED_LAYOUT_MESSAGE);
        MobileActionManager.click(ClockifyAddEntryConstants.START_END_TIME_LAYOUT_LOCATOR);
    }

    public static void tapOnDescriptionSection(){
        MobileActionManager.waitVisibility(ClockifyAddEntryConstants.TIME_DESCRIPTION_SECTION_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyAddEntryConstants.TIME_DESCRIPTION_SECTION_LOCATOR), ClockifyAddEntryConstants.VIEW_NOT_DISPLAYED_DESCRIPTION_SECTION_MESSAGE);
        MobileActionManager.click(ClockifyAddEntryConstants.TIME_DESCRIPTION_SECTION_LOCATOR);
    }

    public static void setDescription(String description){
        MobileActionManager.waitVisibility(ClockifyAddEntryConstants.TIME_DESCRIPTION_INPUT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyAddEntryConstants.TIME_DESCRIPTION_INPUT_LOCATOR), ClockifyAddEntryConstants.VIEW_NOT_DISPLAYED_DESCRIPTION_INPUT_MESSAGE);
        MobileActionManager.setInput(ClockifyAddEntryConstants.TIME_DESCRIPTION_INPUT_LOCATOR, description);
    }
}
