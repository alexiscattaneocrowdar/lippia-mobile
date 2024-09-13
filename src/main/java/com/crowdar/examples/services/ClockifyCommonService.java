package com.crowdar.examples.services;

import com.crowdar.core.LocatorManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyCommonConstants;
import com.crowdar.examples.constants.ClockifyHomeConstants;
import com.crowdar.examples.constants.ClockifySetTimeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getFluentWait;

public class ClockifyCommonService {

    public static void tapOnFloatingButton() {
        MobileActionManager.waitVisibility(ClockifyCommonConstants.FLOATING_ACTION_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyCommonConstants.FLOATING_ACTION_BUTTON_LOCATOR), ClockifyCommonConstants.FLOATING_ACTION_BUTTON_VIEW_NOT_DISPLAYED_MESSAGE);
        MobileActionManager.click(ClockifyCommonConstants.FLOATING_ACTION_BUTTON_LOCATOR);
    }
}