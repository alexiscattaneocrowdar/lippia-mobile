package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyHomeConstants;
import org.testng.Assert;

public class ClockifyHomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(ClockifyHomeConstants.TITLE_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyHomeConstants.TITLE_LOCATOR), ClockifyHomeConstants.TITLE_VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void isDedicationPresent(String dedicationDescription) {
        String xpath = ClockifyHomeConstants.dedicationWidgetLocator(dedicationDescription);
        MobileActionManager.waitVisibility(xpath);
        Assert.assertTrue(MobileActionManager.isVisible(xpath), ClockifyHomeConstants.DEDICATION_WIDGET_VIEW_NOT_DISPLAYED_MESSAGE + ": " + dedicationDescription);
    }
}